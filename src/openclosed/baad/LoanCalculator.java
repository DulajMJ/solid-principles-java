package openclosed.baad;

public class LoanCalculator {

    public static double loanCalculator(HomeLoan homeLoan){

        double interest=(homeLoan.getLoanRate()*homeLoan.getLoanAmount()*homeLoan.getTime())/100;

        double instalment=(interest+homeLoan.getLoanAmount())/homeLoan.getTime();

        return instalment;
    }
}
