package interface_prac;

public class UPIPayment implements PaymentGateway{
    double amount;
    public UPIPayment(double v) {
        this.amount = v;
    }

    @Override
    public void processPayment(){
        System.out.println("Processing UPI payment of "+amount);
    }
}
