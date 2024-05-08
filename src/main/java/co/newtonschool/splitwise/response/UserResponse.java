// UserResponse.java
package co.newtonschool.splitwise.response;

public class UserResponse {
    private int statusCode;
    private String message;
    private List<UserDetail> users;

    public UserResponse(int statusCode, String message, List<UserDetail> users) {
        this.statusCode = statusCode;
        this.message = message;
        this.users = users;
    }

    // Getters and setters
    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<UserDetail> getUsers() {
        return users;
    }

    public void setUsers(List<UserDetail> users) {
        this.users = users;
    }
}
