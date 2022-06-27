package Liskov.baad;

public class BasicAccount extends BankAccount{

    private double balance;

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public boolean withdraw(double amount) {

        if(this.balance < amount)
            return false;
        else{
            this.balance -= amount;
            return true;
        }
    }
}
