// Demo class to show Adapter pattern in action
public class AdapterPatternDemo {
    public static void main(String[] args) {
        // Old system object
        OldPaymentSystem oldSystem = new OldPaymentSystem();

        // Create adapter to make old system work with new interface
        PaymentGateway paymentGateway = new PaymentAdapter(oldSystem);

        // Client uses new payment gateway, unaware it's using the old system
        paymentGateway.processPayment("John Doe", 100.50);
    }
}