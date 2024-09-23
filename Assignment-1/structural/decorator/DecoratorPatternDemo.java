// Demo class to show Decorator pattern in action
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Basic product
        Product basicProduct = new BasicProduct();
        System.out.println(basicProduct.getDescription() + " costs $" + basicProduct.getCost());

        // Adding gift wrapping to the product using the decorator
        Product giftWrappedProduct = new GiftWrapDecorator(basicProduct);
        System.out.println(giftWrappedProduct.getDescription() + " costs $" + giftWrappedProduct.getCost());
    }
}
