// ExpenseUserResponse.java
package co.newtonschool.splitwise.response;

public class ExpenseUserResponse {
    private String expenseTitle; // Title of the expense
    private float expenseAmount; // Total amount of the expense
    private float share; // Share of the expense for a user

    // Constructor to initialize the attributes
    public ExpenseUserResponse(String expenseTitle, float expenseAmount, float share) {
        this.expenseTitle = expenseTitle;
        this.expenseAmount = expenseAmount;
        this.share = share;
    }

    // Getter and setter methods for the attributes
    public String getExpenseTitle() {
        return expenseTitle;
    }

    public void setExpenseTitle(String expenseTitle) {
        this.expenseTitle = expenseTitle;
    }

    public float getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(float expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public float getShare() {
        return share;
    }

    public void setShare(float share) {
        this.share = share;
    }
}
