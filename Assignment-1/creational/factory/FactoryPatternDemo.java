// Demo for the Factory pattern simulating pizza ordering
public class FactoryPatternDemo {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();

        // Order a Margherita pizza
        Pizza pizza1 = factory.createPizza("Margherita");
        pizza1.prepare();

        // Order a Pepperoni pizza
        Pizza pizza2 = factory.createPizza("Paneer");
        pizza2.prepare();
    }
}
