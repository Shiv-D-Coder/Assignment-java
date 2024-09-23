// Demo class to show Singleton pattern in action
public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Access the single instance of ConfigurationManager
        ConfigurationManager configManager1 = ConfigurationManager.getInstance();
        System.out.println("Initial Config: " + configManager1.getConfiguration());

        // Change the configuration using the same instance
        configManager1.setConfiguration("Custom Configuration");
        System.out.println("Updated Config: " + configManager1.getConfiguration());

        // Access the same instance again to verify it's the same object
        ConfigurationManager configManager2 = ConfigurationManager.getInstance();
        System.out.println("Config from second reference: " + configManager2.getConfiguration());

        // Confirm both instances are the same
        System.out.println("Both instances are same: " + (configManager1 == configManager2));
    }
}
