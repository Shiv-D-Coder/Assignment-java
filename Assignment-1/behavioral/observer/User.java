// Concrete observer: User in the forum
public class User implements Observer {
    private String username;

    public User(String username) {
        this.username = username;
    }

    // This method is called when the Subject posts a new message
    @Override
    public void update(String post) {
        System.out.println(username + " has received notification about a new post: " + post);
    }
}
