// Singleton class to manage configurations
public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String configuration;

    // Private constructor to prevent instantiation
    private ConfigurationManager() {
        configuration = "Default Configuration";
    }

    // Public method to provide access to the single instance
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) { // Thread-safe lazy initialization
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    // Method to set configuration
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    // Method to get current configuration
    public String getConfiguration() {
        return configuration;
    }
}
