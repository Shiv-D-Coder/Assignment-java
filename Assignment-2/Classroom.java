import java.util.*;

public class Classroom {
    private String name;
    private String subject;
    private Set<Student> students;
    private List<Assignment> assignments;
    private Map<String, Double> gradeBook;

    public Classroom(String name, String subject) {
        this.name = name;
        this.subject = subject;
        this.students = new HashSet<>();
        this.assignments = new ArrayList<>();
        this.gradeBook = new HashMap<>();
    }

    // Method to add a student to the classroom
    public void addStudent(Student student) {
        students.add(student);
        gradeBook.put(student.getId(), 0.0);
    }

    // Method to add an assignment to the classroom
    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public void submitAssignment(Student student, String assignmentName, String submission) {
        Assignment assignment = findAssignment(assignmentName);
        if (assignment != null) {
            double grade = assignment.grade(submission);
            updateGrade(student, grade);
        }
    }

    // Private method to find an assignment by its name
    private Assignment findAssignment(String assignmentName) {
        return assignments.stream()
                .filter(a -> a.getName().equalsIgnoreCase(assignmentName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Assignment not found"));
    }

    // Private method to update the student's grade in the gradeBook
    private void updateGrade(Student student, double grade) {
        double currentGrade = gradeBook.getOrDefault(student.getId(), 0.0);
        gradeBook.put(student.getId(), (currentGrade + grade) / 2);
    }

    // Method to generate a report 
    public String generateReport() {
        StringBuilder report = new StringBuilder();
        report.append("Classroom Report for ").append(name).append(" (").append(subject).append(")\n");
        report.append("Number of students: ").append(students.size()).append("\n");
        report.append("Number of assignments: ").append(assignments.size()).append("\n\n");

        report.append("Student Grades:\n");
        gradeBook.forEach((studentId, grade) -> {
            Student student = findStudentById(studentId);
            report.append(student.getName()).append(": ").append(String.format("%.2f", grade)).append("\n");
        });

        return report.toString();
    }

    private Student findStudentById(String studentId) {
        return students.stream()
                .filter(s -> s.getId().equals(studentId))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Student not found"));
    }

    // Getters
    public String getName() { return name; }
    public String getSubject() { return subject; }
    public Set<Student> getStudents() { return new HashSet<>(students); }
    public List<Assignment> getAssignments() { return new ArrayList<>(assignments); }
}