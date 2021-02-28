package uni.pl.fmi;
import java.util.*;

/**
 * 
 */
public class Topic {

    /**
     * Default constructor
     */
    public Topic() {
    }

    /**
     * 
     */
    private String header;

    /**
     * 
     */
    private String content;

    /**
     * 
     */
    public User user;

    /**
     * 
     */
    public Set<Topic> subTopic;

    /**
     * 
     */
    public Topic parentTopic;

    /**
     * 
     */
    public Set<Comment> comment;

    /**
     * @return
     */
    public String getHeader() {
        // TODO implement here
        return "";
    }

    /**
     * @param header 
     * @return
     */
    public void setHeader(String header) {
      this.header=header;
    }

    /**
     * @return
     */
    public String getContent() {
        // TODO implement here
        return "";
    }

    /**
     * @param content 
     * @return
     */
    public void setContent(String content) {
       this.content=content;
    }

}