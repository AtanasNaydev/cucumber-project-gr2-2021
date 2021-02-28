package uni.pl.fmi;
import java.util.*;

/**
 * 
 */
public class User {

    private String username;

    private String password;

    
    private String email;

   
    private boolean isAdmin;

    public Set<Comment> comment;

    public Set<Topic> topic;

  
  
    /**
     * Default constructor
     */
    public User() {
    }
    /**
     * @return
     */
    public String getUsername() {
        // TODO implement here
        return "";
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
    public String getPassword() {
        // TODO implement here
        return "";
    }

    /**
     * @param password 
     * @return
     */
    public void setPassword(String password) {
       
    }

    /**
     * @return
     */
    public String getEmail() {
        // TODO implement here
        return "";
    }

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
     
    }

    /**
     * @return
     */
    public boolean getisAdmin() {
		return isAdmin;
    
    }

    /**
     * @param isAdmin 
     * @return
     */
    public void setisAdmin(boolean isAdmin) {
      this.isAdmin=isAdmin;
    }

    /**
     * @return
     */
    public Set getComment() {
        // TODO implement here
        return null;
    }

    /**
     * @param comment 
     * @return
     */
  

    /**
     * @param comment 
     * @return
     */
    public void addComment(Comment comment) {
   
     
    }
	/**
	 * @return the isAdmin
	 */
	public boolean isAdmin() {
		return isAdmin;
	}
	/**
	 * @param isAdmin the isAdmin to set
	 */
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	/**
	 * @return the topic
	 */
	public Set<Topic> getTopic() {
		return topic;
	}
	/**
	 * @param topic the topic to set
	 */
	public void setTopic(Set<Topic> topic) {
		this.topic = topic;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(Set<Comment> comment) {
		this.comment = comment;
	}

}