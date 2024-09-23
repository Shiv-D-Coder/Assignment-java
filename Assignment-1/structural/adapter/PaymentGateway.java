// New Payment Gateway interface which the client expects to use
public interface PaymentGateway {
    void processPayment(String customerName, double amount);
}