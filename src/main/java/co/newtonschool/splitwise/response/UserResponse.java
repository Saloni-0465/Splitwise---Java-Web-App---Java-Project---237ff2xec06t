// UserResponse.java
package co.newtonschool.splitwise.response;

import java.util.List; // Import List class
import co.newtonschool.splitwise.model.User; // Import User class

public class UserResponse {
    public int userId;
    private String firstName;
    private String lastName;
    private String username;

    public UserResponse(int userId,String firstName, String lastName, String username) {
        this.userId= userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    // Getters and setters
    public int getUserId() {
        return userId;
    }

   public String getFirstName(){
    return firstName;
   }

    public String getLastName() {
        return lastName;
    }

    public String getUsername(){
        return username;
    }
}
