// ExpenseUserDetail.java
package co.newtonschool.splitwise.response;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class ExpenseUserDetail {
    private int userId;
    private String userName;
    private double amountOwed;

    public ExpenseUserDetail() {
        // Default constructor
    }
.......
    public ExpenseUserDetail(int userId, String userName, double amountOwed) {
        this.userId = userId;
        this.userName = userName;
        this.amountOwed = amountOwed;
    }
    .....

    public ExpenseUserDetail(int expenseId, String expenseTitle, float expenseAmount, String name, LocalDate localDate,
            LocalTime localTime, List<UserExpenseResponse> userExpenseResponseList) {
        //TODO Auto-generated constructor stub
    }

    // Getters and setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getAmountOwed() {
        return amountOwed;
    }

    public void setAmountOwed(double amountOwed) {
        this.amountOwed = amountOwed;
    }
}
