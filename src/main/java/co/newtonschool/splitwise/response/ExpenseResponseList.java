// ExpenseResponseList.java
package co.newtonschool.splitwise.response;

import java.util.List;

public class ExpenseResponseList {
    private List<ExpenseResponse> expenses;

    public ExpenseResponseList() {
        // Default constructor
    }

    public ExpenseResponseList(List<ExpenseResponse> expenses) {
        this.expenses = expenses;
    }

    // Getters and setters
    public List<ExpenseResponse> getExpenseResponseList() {
        return expenses;
    }

    public void setExpenses(List<ExpenseResponse> expenses) {
        this.expenses = expenses;
    }
}
