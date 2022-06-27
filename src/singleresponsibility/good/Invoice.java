package singleresponsibility.good;

import java.math.BigDecimal;
import java.util.List;

public class Invoice {

    public String calculateSubTotalInvoice(List<String> articles){
        return "CalculateValue";

    }

    public BigDecimal calculateTotalInvoice(BigDecimal subtotal, BigDecimal taxPercentage){
        return subtotal.add(subtotal.multiply(taxPercentage));
    }
}
