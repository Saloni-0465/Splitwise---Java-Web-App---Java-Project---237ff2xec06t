// UserResponseList.java
package co.newtonschool.splitwise.response;

import java.util.List; 
import co.newtonschool.splitwise.model.User; 

public class UserResponseList {
    private List<UserResponse> userResponseList;

    public UserResponseList(List<UserResponse> userResponseList) {
        this.userResponseList = userResponseList;
    }

    public List<UserResponse> getUserResponseList(){
        return userResponseList;
    }

    
    // public List<UserResponse> getUsers() {
    //     return userResponseList;
    // }

    public void setUsers(List<UserResponse> userResponseList) {
        this.userResponseList = userResponseList;
    }
}
