package entities;

public class Account {

    private Integer id;
    private String holder;
    protected Double balance;

    public Account() {

    }

    public Account(Integer id, String holder, Double balance) {
        this.id = id;
        this.holder = holder;
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void withdraw(double amount) {
        this.balance -= (amount + 5);
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
