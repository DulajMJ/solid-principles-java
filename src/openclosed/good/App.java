package openclosed.good;

public class App {

    public static void main(String arg[]){

        CarLoan carLoan=new CarLoan(12,300000,60);
        System.out.println("Car Loan monthly instalment :"+LoanCalculator.loanCal(carLoan));
        HomeLoan homeLoan=new HomeLoan(4,4000000,120);
        System.out.println("Home Loan monthly instalment :"+LoanCalculator.loanCal(homeLoan));
        PersonalLoan personalLoan=new PersonalLoan(9,400000,80);
        System.out.println("Personal Loan monthly instalment :"+LoanCalculator.loanCal(personalLoan));
    }
}
