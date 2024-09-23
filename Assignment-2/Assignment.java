import java.time.LocalDateTime;
import java.util.Random;

public class Assignment {
    private String name;
    private String description;
    private LocalDateTime dueDate;
    private int maxScore;

    public Assignment(String name, String description, LocalDateTime dueDate) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.maxScore = 100; // Default max score
    }

    public double grade(String submission) {
        // This is a simplified grading method. In a real-world scenario,
        // you would implement a more sophisticated grading algorithm.
        int submissionLength = submission.length();
        Random random = new Random();
        
        // Base the grade on submission length and add some randomness
        double baseGrade = Math.min(submissionLength / 10.0, maxScore);
        double randomFactor = random.nextDouble() * 10 - 5; // Random value between -5 and 5
        
        return Math.max(0, Math.min(maxScore, baseGrade + randomFactor));
    }

    // Getters
    public String getName() { return name; }
    public String getDescription() { return description; }
    public LocalDateTime getDueDate() { return dueDate; }
    public int getMaxScore() { return maxScore; }

    @Override
    public String toString() {
        return "Assignment{name='" + name + "', description='" + description + "', dueDate=" + dueDate + "}";
    }
}