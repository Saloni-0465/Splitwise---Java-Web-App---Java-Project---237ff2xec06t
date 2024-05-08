// UserResponseList.java
package co.newtonschool.splitwise.response;

public class UserResponseList {
    private List<UserDetail> users;

    public UserResponseList(List<UserDetail> users) {
        this.users = users;
    }

    // Getter and setter for the list of users
    public List<UserDetail> getUsers() {
        return users;
    }

    public void setUsers(List<UserDetail> users) {
        this.users = users;
    }
}
