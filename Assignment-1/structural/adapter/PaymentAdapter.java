// Adapter to make OldPaymentSystem compatible with PaymentGateway
public class PaymentAdapter implements PaymentGateway {
    private OldPaymentSystem oldPaymentSystem;

    // Constructor to initialize the old system
    public PaymentAdapter(OldPaymentSystem oldPaymentSystem) {
        this.oldPaymentSystem = oldPaymentSystem;
    }

    // Adapts the old system to match the new payment gateway interface
    @Override
    public void processPayment(String customerName, double amount) {
        System.out.println("Processing payment for customer: " + customerName);
        oldPaymentSystem.makePayment(amount); // Reuses old system's method
    }
}