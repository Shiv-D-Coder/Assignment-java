// Demo of the Observer pattern in action
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject forum = new Subject(); // Creating a forum (Subject)
        
        // Adding users (Observers) to the forum
        User alice = new User("Alice");
        User bob = new User("Bob");
        forum.addObserver(alice);
        forum.addObserver(bob);

        // Simulating a new post in the forum
        forum.newPost("Welcome to the new forum on design patterns!");
        forum.newPost("Observer pattern is live. Stay tuned for more!");
    }
}
