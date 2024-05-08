// UserExpenseDetail.java
package co.newtonschool.splitwise.response;

public class UserExpenseDetail {
    private int expenseId;
    private String expenseTitle;
    private double amount;
    private double share;

    public UserExpenseDetail(int expenseId, String expenseTitle, double amount, double share) {
        this.expenseId = expenseId;
        this.expenseTitle = expenseTitle;
        this.amount = amount;
        this.share = share;
    }

    // Getters and setters
    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public String getExpenseTitle() {
        return expenseTitle;
    }

    public void setExpenseTitle(String expenseTitle) {
        this.expenseTitle = expenseTitle;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getShare() {
        return share;
    }

    public void setShare(double share) {
        this.share = share;
    }
}
