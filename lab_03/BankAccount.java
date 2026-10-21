public class BankAccount {
    private String owner;
    private double balance;


    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        if(amount >0){
            this.balance += amount;
        }
    }
    public void withdraw(double amount){
        if(this.balance<=amount && amount>0){
            this.balance -= amount;
        }
    }
}
