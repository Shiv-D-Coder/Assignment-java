// Concrete component: A basic product
public class BasicProduct implements Product {
    @Override
    public String getDescription() {
        return "Basic Product";
    }

    @Override
    public double getCost() {
        return 100.00; // Base price of the product
    }
}