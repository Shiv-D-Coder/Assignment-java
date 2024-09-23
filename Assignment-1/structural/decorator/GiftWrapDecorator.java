// Concrete Decorator: Adds gift wrapping to the product
public class GiftWrapDecorator extends ProductDecorator {
    public GiftWrapDecorator(Product product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", with Gift Wrapping";
    }

    @Override
    public double getCost() {
        return product.getCost() + 5.00; // Additional cost for gift wrapping
    }
}