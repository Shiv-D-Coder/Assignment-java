// Abstract Decorator class that implements Product interface
public abstract class ProductDecorator implements Product {
    protected Product product;

    // Constructor to set the product being decorated
    public ProductDecorator(Product product) {
        this.product = product;
    }

    @Override
    public String getDescription() {
        return product.getDescription();
    }

    @Override
    public double getCost() {
        return product.getCost();
    }
}