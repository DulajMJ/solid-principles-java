package openclosed.good;

public class CarLaonService implements LoanBase {

    CarLoan carLoan;

    @Override
    public double loanAmountCal() {
        double interest=(carLoan.getLoanRate()*carLoan.getLoanAmount()*carLoan.getTime())/100;

        double instalment=(interest+carLoan.getLoanAmount())/carLoan.getTime();

        return instalment;

    }
}
