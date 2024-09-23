import java.util.UUID;

public class Student {
    private String id;
    private String name;
    private String email;

    // Generates a random unique ID for each student using UUID
    public Student(String name, String email) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    // Method to compare Student objects based on their ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id);
    }

    // Method to generate a unique hash code based on the student's ID
    @Override
    public int hashCode() {
        return id.hashCode();
    }

    // Method to provide a custom string 
    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "', email='" + email + "'}";
    }
}