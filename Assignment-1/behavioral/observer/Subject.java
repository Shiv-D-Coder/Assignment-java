import java.util.ArrayList;
import java.util.List;

// Subject class representing the forum
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String post;

    // Method to add observers (Users)
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Method to set a new post and notify all observers
    public void newPost(String post) {
        this.post = post;
        notifyAllObservers();
    }

    // Notify all users about the new post
    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(post);
        }
    }
}
