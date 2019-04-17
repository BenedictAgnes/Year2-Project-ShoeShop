package controllers.security;
import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;
import models.users.*;
import models.users.UserPassword2;

public class LoginCtrl extends Controller {
    private FormFactory formFactory;
    private Environment env;

    @Inject
    public LoginCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    public Result login() {
        Form<Login> loginForm = formFactory.form(Login.class);

        return ok(login.render(loginForm, User.getUserById(session().get("email"))));
    }

    public Result loginSubmit() {
        // Bind form instance to the values submitted from the form  
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        // Check for errors
        // Uses the validate method defined in the Login class
        if (loginForm.hasErrors()) {
            // If errors, show the form again
            return badRequest(login.render(loginForm, User.getUserById(session().get("email"))));
        } 
        else {
            // User Logged in successfully
            // Clear the existing session
            session().clear();
            // Store the logged in email in the session
            session("email", loginForm.get().getEmail());
            
            // Check user type
            User u = User.getUserById(loginForm.get().getEmail());
            // If admin - go to admin section
            if (u != null && "admin".equals(u.getRole())) {
                return redirect(controllers.routes.AdminProductCtrl.index());
            }
            
            // Return to home page
            return redirect(controllers.routes.ProductCtrl.index());
        }
    }

    public Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect(controllers.security.routes.LoginCtrl.login());
    }

    public Result registerUser() {
        Form<UserPassword2> regForm = formFactory.form(UserPassword2.class);
        return ok(registerUser.render(regForm,User.getUserById(session().get("email"))));
    }
    
    public Result registerUserSubmit() {
    
        Form<User> newUserForm = formFactory.form(User.class).bindFromRequest();
        Form<UserPassword2> newUserForm2 = formFactory.form(UserPassword2.class).bindFromRequest();
    
        if (newUserForm.hasErrors()) {
    
            return badRequest(registerUser.render(newUserForm2,User.getUserById(session().get("email"))));
        } else {
    
            User  newUser = newUserForm.get();
            UserPassword2 newUser2 = newUserForm2.get();
    
    
            if(!newUser2.getPassword2().equals(newUser2.getPassword())){
                flash("error", "Passwords must match "); 
                return redirect(controllers.security.routes.LoginCtrl.registerUser());
                
            } 
        
            if(User.getUserById(newUser.getEmail())==null){
                newUser.save();
            }else{
                newUser.update();
            }
    
        flash("success", "User " + newUser.getName() + " was registered.");
    
        return redirect(controllers.security.routes.LoginCtrl.login()); 
        }
    }

    

     
@Transactional

public Result deleteUser(String email) {

    // The following line of code finds the item object by id, then calls the delete() method
    // on it to have it removed from the database.

        User u = User.getUserById(email);
        u.delete();

    // Now write to the flash scope, as we did for the successful item creation.
    flash("success", "User has been deleted.");
    // And redirect to the onsale page
    return redirect(controllers.security.routes.LoginCtrl.users());
}

public Result updateUser(String email) {
    User u;
    Form<User> userForm;

    try {
        // Find the item by email
        u = User.getUserById(email);
        u.update();

        // Populate the form object with data from the user found in the database
        userForm = formFactory.form(User.class).fill(u);
    } catch (Exception ex) {
        return badRequest("error");
    }

    // Display the "add item" page, to allow the user to update the item
    return ok(addUser.render(userForm,User.getUserById(session().get("email"))));
}


public Result addUser() {
    Form<User> userForm = formFactory.form(User.class);
    return ok(addUser.render(userForm,User.getUserById(session().get("email"))));
}

@Transactional
public Result addUserSubmit() {
// We use the method bindFromRequest() to populate our Form<ItemOnSale> object with the
// data that the user submitted. Thanks to Play Framework, we do not need to do the messy
// work of parsing the request and extracting data from it characte by character.
Form<User> newUserForm = formFactory.form(User.class).bindFromRequest();
// We check for errors (based on constraints set in ItemOnSale class)
if (newUserForm.hasErrors()) {
    // If the form data have errors, we call the method badRequest(), requesting Play 
    // Framework to send an error response to the user and display the additem page again. 
    // As we are passing in newItemForm, the form will be populated with the data that the 
    // user has already entered, saving them from having to enter it all over again.
    return badRequest(addUser.render(newUserForm,User.getUserById(session().get("email"))));
} else {
    // If no errors are found in the form data, we extract the data from the form.
    // Form objects have handy utility methods, such as the get() method we are using 
    // here to extract the data into an ItemOnSale object. This is possible because
    // we defined the form in terms of the model class ItemOnSale.
    User newUser = newUserForm.get();
    // Now we call the ORM method save() on the model object, to have it saved in the
    // database as a line in the table item_on_sale.
    
    if(User.getUserById(newUser.getEmail())==null){
        newUser.save();
    }else{
        newUser.update();
    }
    // We use the flash scope to specify that we want a success message superimposed on
    // the next displayed page. The flash scope uses cookies, which we can read and set
    // using the flash() function of the Play Framework. The flash scope cookies last
    // for a single request (unlike session cookies, which we will use for log-in in a
    // future lab). So, add a success message to the flash scope.
    flash("success", "User " + newUser.getName() + " was added/updated.");
    // Having specified we want a message at the top, we can redirect to the onsale page,
    // which will have to be modified to read the flash scope and display it.
    return redirect(controllers.security.routes.LoginCtrl.users()); 
    }
}
public Result users() {
    List<User> userList = null;

    userList = User.findAll();

    return ok(user.render(userList,User.getUserById(session().get("email"))));

 }
    

        
    
}