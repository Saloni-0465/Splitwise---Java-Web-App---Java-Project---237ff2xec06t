// ExpenseResponse.java
package co.newtonschool.splitwise.response;

import co.newtonschool.splitwise.model.UserExpense;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class ExpenseResponse {
    private int expenseId;
    private String description;
    private double amount;
    private LocalDate date;
    private LocalTime time;
    private List<UserExpense> userExpenses;

    public ExpenseResponse() {
        // Default constructor
    }

    public ExpenseResponse(int expenseId, String description, double amount, LocalDate date, LocalTime time,
            List<UserExpense> userExpenses) {
        this.expenseId = expenseId;
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.time = time;
        this.userExpenses = userExpenses;
    }

    ......

    public ExpenseResponse(int expenseId2, String expenseTitle, float expenseAmount, String name, LocalDate localDate,
            LocalTime localTime) {
        //TODO Auto-generated constructor stub
    }

    ....

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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public List<UserExpense> getUserExpenses() {
        return userExpenses;
    }

    public void setUserExpenses(List<UserExpense> userExpenses) {
        this.userExpenses = userExpenses;
    }
}
