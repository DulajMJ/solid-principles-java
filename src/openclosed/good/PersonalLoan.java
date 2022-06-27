package openclosed.good;

public class PersonalLoan implements LoanBase{
    double loanRate;
    double loanAmount;
    Integer time;

    public PersonalLoan(double loanRate, double loanAmount, Integer time) {
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


    @Override
    public double loanAmountCal() {

        double interest=(this.getLoanRate()*this.getLoanAmount()*this.getTime())/100;

        double instalment=(interest+this.getLoanAmount())/this.getTime();

        return instalment;
    }
}
