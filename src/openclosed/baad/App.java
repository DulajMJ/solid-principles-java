package openclosed.baad;

public class App {
    public static void main(String arg[]){

        HomeLoan homeLoan=new HomeLoan(12,300000,60);
        System.out.println(LoanCalculator.loanCalculator(homeLoan));
    }
}
