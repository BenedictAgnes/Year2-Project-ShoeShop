package controllers.security;

import play.mvc.*;
import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;


import models.users.*;
import models.products.*;
import views.html.*;

public class HomeCtrl extends Controller {

    private FormFactory formFactory;
    private Environment e;

    @Inject
    public HomeCtrl(FormFactory f,Environment env) {
        this.formFactory = f;
        this.e = env;
}


@Security.Authenticated(Secured.class)
public Result addCustomer() {
    Form<Customer> cForm = formFactory.form(Customer.class);
    return ok(addCustomer.render(cForm,User.getUserById(session().get("email"))));
}
@Security.Authenticated(Secured.class)
@Transactional
public Result addCustomerSubmit() {
Form<Customer> newUserForm = formFactory.form(Customer.class).bindFromRequest();
if (newUserForm.hasErrors()) {
    
    return badRequest(addCustomer.render(newUserForm,User.getUserById(session().get("email"))));
} else {
    Customer newUser = newUserForm.get();
    System.out.println("Name: "+newUserForm.field("name").getValue().get());
    System.out.println("Email: "+newUserForm.field("email").getValue().get());
    System.out.println("Password: "+newUserForm.field("password").getValue().get());
    System.out.println("Role: "+newUserForm.field("role").getValue().get());
    
    if(User.getUserById(newUser.getEmail())==null){
        newUser.save();
    }else{
        newUser.update();
    }
    flash("success", "User " + newUser.getName() + " was added/updated.");
    return redirect(controllers.routes.HomeCtrl.usersCustomer()); 
    }
}
@Security.Authenticated(Secured.class)
@Transactional
@With(AuthAdmin.class)
public Result deleteCustomer(String email) {

    // The following line of code finds the item object by id, then calls the delete() method
    // on it to have it removed from the database.

    Customer u = (Customer) User.getUserById(email);
    u.delete();

    // Now write to the flash scope, as we did for the successful item creation.
    flash("success", "User has been deleted.");
    // And redirect to the onsale page
    return redirect(controllers.routes.HomeCtrl.usersCustomer());
}
@Security.Authenticated(Secured.class)
public Result updateCustomer(String email) {
    Customer u;
    Form<Customer> userForm;

    try {
        // Find the item by email
        u = (Customer) User.getUserById(email);
        u.update();

        // Populate the form object with data from the user found in the database
        userForm = formFactory.form(Customer.class).fill(u);
    } catch (Exception ex) {
        return badRequest("error");
    }

    // Display the "add item" page, to allow the user to update the item
    return ok(addCustomer.render(userForm,User.getUserById(session().get("email"))));
}
public Result usersAdmin() {
    List<Administrator> userList = null;

    userList = Administrator.findAll();

    return ok(admin.render(userList,User.getUserById(session().get("email"))));

 }

 public Result usersCustomer() {
    List<Customer> cList = null;

    cList = Customer.findAll();

    return ok(customers.render(cList,User.getUserById(session().get("email"))));

 }
}