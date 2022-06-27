package openclosed.baad;

public class HomeLoan {

    double loanRate;
    double loanAmount;
    Integer time;

    public HomeLoan(double loanRate, double loanAmount, Integer time) {
        this.loanRate = loanRate;
        this.loanAmount = loanAmount;
        this.time = time;
    }

    public double getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(double loanRate) {
        this.loanRate = loanRate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}
