// UserExpense.java
package co.newtonschool.splitwise.model;

public class UserExpense {
    private int userExpenseId;
    private User user;
    private Expense expense;
    private double amount;
    private float share;

    public UserExpense() {
        // Default constructor
    }

    // public UserExpense(int userExpenseId, User user, Expense expense, double amount) {
    //     this.userExpenseId = userExpenseId;
    //     this.user = user;
    //     this.expense = expense;
    //     this.amount = amount;
    // }

    ......

    public UserExpense(User user2, Expense expense2, float share2) {
        //TODO Auto-generated constructor stub
    }


    .......

    // Getters and setters
    public int getUserExpenseId() {
        return userExpenseId;
    }

    public void setUserExpenseId(int userExpenseId) {
        this.userExpenseId = userExpenseId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Expense getExpense() {
        return expense;
    }

    public void setExpense(Expense expense) {
        this.expense = expense;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public float getShare() {
        // TODO Auto-generated method stub
        return this.share;
        // throw new UnsupportedOperationException("Unimplemented method 'getShare'");
    }
}
