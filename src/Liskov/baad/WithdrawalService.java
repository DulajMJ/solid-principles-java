package Liskov.baad;

import java.util.ArrayList;
import java.util.List;

public class WithdrawalService {

    public static final double ADMINISTRATIVE_EXPENSES_CHARGE = 25.00;
    public void cargarDebitarCuentas(){

        BankAccount basiAcct = new BasicAccount();
        basiAcct.deposit(100.00);

        BankAccount premiumAcct = new PremiumAccount();
        premiumAcct.deposit(200.00);

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(basiAcct);
        accounts.add(premiumAcct);

        debitAdministrativeExpenses(accounts);

    }

    private void debitAdministrativeExpenses(List<BankAccount> accounts){
        accounts.stream()
                .forEach(account -> account.withdraw(WithdrawalService.ADMINISTRATIVE_EXPENSES_CHARGE));
    }
}
