package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
// This is a User of type admin
@DiscriminatorValue("a")
@Table(name = "user")
// Administrator inherits from the User class
public class Administrator extends User{

	public Administrator(){

    }

	public Administrator(String email, String role, String name, String password)
	{
		super(email, role, name, password);
	}
   
	public static final Finder<Long, Administrator> find = new Finder<>(Administrator.class);
			    
    public static final List<Administrator> findAll() {
       return Administrator.find.all();
    }
	
} 