package uni.pl.fmi;
import java.util.*;

/**
 * 
 */
public class User {

 
    private String username;

    private String password;

    private String email;

    private String firstname;

    private String lastname;

    private Set<Order> orders=new HashSet<>();
    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * @return
     */
    public String getUsername() {
     return username;
    }

    /**
     * @param username 
     * @return
     */
    public void setUsername(String username) {
    	this.username=username;
    }

    /**
     * @return
     */
    public String getEmail() {
    	return email;
    }

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
    	this.email=email;
    }

    /**
     * @return
     */
    public String getPassword() {
    	 return password;
    }

    /**
     * @param password 
     * @return
     */
    public void setPassword(String password) {
    	this.password=password;
    }

    /**
     * @return
     */
    public Set<Order> getOrders() {
    	return orders;
    }

    /**
     * @param order 
     * @return
     */
    public void setOrder(Set<Order> orders) {
        this.orders=orders;
    }

    /**
     * @param order 
     * @return
     */
    public void addOrder(Order order) {
     this.orders.add(order);
    }

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}