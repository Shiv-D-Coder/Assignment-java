// Factory to create different types of pizza
public class PizzaFactory {
    public Pizza createPizza(String type) {
        switch (type) {
            case "Margherita":
                return new Margherita();
            case "Paneer":
                return new Paneer();
            default:
                throw new IllegalArgumentException("Unknown pizza type");
        }
    }
}
