// Expense.java
package co.newtonschool.splitwise.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;

public class Expense {
    private int expenseId;
    private String description;
    private double amount;
    private LocalDateTime createdAt;
    private List<User> usersInvolved;

    public Expense() {
        // Default constructor
    }

    public Expense(int expenseId, String description, double amount, LocalDateTime createdAt,
            List<User> usersInvolved) {
        this.expenseId = expenseId;
        this.description = description;
        this.amount = amount;
        this.createdAt = createdAt;
        this.usersInvolved = usersInvolved;
    }

    // Getters and setters
    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<User> getUsersInvolved() {
        return usersInvolved;
    }

    public void setUsersInvolved(List<User> usersInvolved) {
        this.usersInvolved = usersInvolved;
    }

    public String  getExpenseTitle(){
       return "Hello";
       .....
    }

    public float getExpenseAmount(){
        return 3.9F;
        ....
    }
    
    public UserExpense getShare(){
        return new UserExpense();
        .....
    }

    public LocalDateTime getExpenseDateTime() {
        return createdAt;
    }

    public Enum<HttpStatus> getSplitType() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSplitType'");
    }
}
