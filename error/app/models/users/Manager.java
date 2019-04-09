package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
// This is a User of type manager

@DiscriminatorValue("manager")
@Table(name = "user")
// Manager inherits from the User class
public class Manager extends User {
	
public Manager(){
	
}

	public Manager(String email, String role, String name, String password)
	{
		super(email, role, name, password);
		
	}

}