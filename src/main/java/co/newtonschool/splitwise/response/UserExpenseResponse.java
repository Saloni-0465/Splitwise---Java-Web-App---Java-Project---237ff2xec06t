// UserExpenseResponse.java
package co.newtonschool.splitwise.response;

import java.util.List;

public class UserExpenseResponse {
    private int userId;
    private List<UserExpenseDetail> userExpenses;

    public UserExpenseResponse(int userId, List<UserExpenseDetail> userExpenses) {
        this.userId = userId;
        this.userExpenses = userExpenses;
    }

    // Getters and setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<UserExpenseDetail> getUserExpenses() {
        return userExpenses;
    }

    public void setUserExpenses(List<UserExpenseDetail> userExpenses) {
        this.userExpenses = userExpenses;
    }
}
