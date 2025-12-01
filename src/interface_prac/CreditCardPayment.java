package interface_prac;

public class CreditCardPayment implements PaymentGateway{
    double amount;
    public CreditCardPayment(double v) {
        this.amount = v;
    }

    @Override
    public void processPayment(){
        System.out.println("Processing credit card payment of "+amount);
    }
}
