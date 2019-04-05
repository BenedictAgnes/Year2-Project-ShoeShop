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

        return ok(login.render(loginForm, User.getLoggedIn(session().get("email"))));
    }

    public Result loginSubmit() {
        // Bind form instance to the values submitted from the form  
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        // Check for errors
        // Uses the validate method defined in the Login class
        if (loginForm.hasErrors()) {
            // If errors, show the form again
            return badRequest(login.render(loginForm, User.getLoggedIn(session().get("email"))));
        } 
        else {
            // User Logged in successfully
            // Clear the existing session
            session().clear();
            // Store the logged in email in the session
            session("email", loginForm.get().getEmail());
            
            // Check user type
            User u = User.getLoggedIn(loginForm.get().getEmail());
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
        return ok(registerUser.render(regForm,User.getLoggedIn(session().get("email"))));
    }
    
    public Result registerUserSubmit() {
    
        Form<User> newUserForm = formFactory.form(User.class).bindFromRequest();
        Form<UserPassword2> newUserForm2 = formFactory.form(UserPassword2.class).bindFromRequest();
    
        if (newUserForm.hasErrors()) {
    
            return badRequest(registerUser.render(newUserForm2,User.getLoggedIn(session().get("email"))));
        } else {
    
            User  newUser = newUserForm.get();
            UserPassword2 newUser2 = newUserForm2.get();
    
    
            if(!newUser2.getPassword2().equals(newUser2.getPassword())){
                flash("error", "Passwords must match "); 
                return redirect(controllers.security.routes.LoginCtrl.registerUser());
                
            } 
        
            if(User.getLoggedIn(newUser.getEmail())==null){
                newUser.save();
            }else{
                newUser.update();
            }
    
        flash("success", "User " + newUser.getName() + " was registered.");
    
        return redirect(controllers.security.routes.LoginCtrl.login()); 
        }
    }

        
    
}