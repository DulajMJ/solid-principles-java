package Liskov.baad;

public class PremiumAccount extends BankAccount {

    private double balance;
    private int preferencePoints;

    @Override
    public void deposit(double amount) {

        this.balance += amount;
        accumulatePreferencePoints();
    }

    @Override
    public boolean withdraw(double amount) {
        if(this.balance < amount)
            return false;
        else{
            this.balance -= amount;
            accumulatePreferencePoints();
            return true;
        }
    }

    private void accumulatePreferencePoints(){
        this.preferencePoints++;
    }
}
