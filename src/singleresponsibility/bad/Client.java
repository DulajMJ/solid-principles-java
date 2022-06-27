package singleresponsibility.bad;

import java.math.BigDecimal;
import java.util.List;

public class Client {

    private String clientId;
    private String name;
    private String lastName;

    public Client(String clientId, String name, String lastName) {
        this.clientId = clientId;
        this.name = name;
        this.lastName = lastName;
    }

    public String calculateSubTotalInvoice(List<String> articles){
        return "CalculateValue";

    }

    public BigDecimal calculateTotalInvoice(BigDecimal subtotal, BigDecimal taxPercentage){
        return subtotal.add(subtotal.multiply(taxPercentage));
    }
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
