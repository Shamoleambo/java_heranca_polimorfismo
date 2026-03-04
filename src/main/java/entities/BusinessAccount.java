package entities;

public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer id, String holder, Double balance, Double loanLimit) {
        super(id, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if (amount <= this.loanLimit) {
            this.balance += amount - 10;
        }
    }

//    @Override
//    public void withdraw(double amount) {
//        super.withdraw(amount);
//        this.balance -= 2;
//    }

}
