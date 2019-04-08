package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.shopping.*;

@Entity
@Table(name = "user")
// This is a user of type Customer
@DiscriminatorValue("c")

// Customer inherits from the User class
public class Customer extends User{
	

    // Customer has one basket.
    // Customer is the owner (foreign key will be added to Basket
    // table). All changes to Customer are cascaded.
    @OneToOne(mappedBy="customer", cascade = CascadeType.ALL)
    private Basket basket;

    // Customer can habe many ShopOrders.
    // Customer is the owner (forieng key will be added to Basket
    // table). All changes to Customer are cascaded
    @OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
    private List<ShopOrder> orders;

    public Customer(){

    }
	
	public Customer(String email, String role, String name, String password)
	{
        super(email, role, name, password);
       
    }
   
    public static final Finder<Long, Customer> find = new Finder<>(Customer.class);
			    
    public static final List<Customer> findAll() {
       return Customer.find.all();
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public List<ShopOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ShopOrder> orders) {
        this.orders = orders;
    }
    

   

}