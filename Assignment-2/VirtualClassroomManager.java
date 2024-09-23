import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class VirtualClassroomManager {
    private Map<String, Classroom> classrooms;

    public VirtualClassroomManager() {
        this.classrooms = new HashMap<>();
    }

    // Method to add a classroom
    public void addClassroom(String input) {
        String[] parts = input.split(",");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Invalid input. Use format: name,subject");
        }
        String name = parts[0].trim();
        String subject = parts[1].trim();
        
        if (classrooms.containsKey(name)) {
            throw new IllegalArgumentException("Classroom already exists");
        }
        classrooms.put(name, new Classroom(name, subject));
        System.out.println("Classroom '" + name + "' for " + subject + " has been created.");
    }

    // Method to add a student to a classroom
    public void addStudent(String studentInfo, String className) {
        String[] parts = studentInfo.split(",");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Invalid student info. Use format: name,email");
        }
        String name = parts[0].trim();
        String email = parts[1].trim();
        
        Classroom classroom = getClassroom(className);
        Student student = new Student(name, email);
        classroom.addStudent(student);
        System.out.println("Student " + name + " has been enrolled in " + className + ".");
    }

    // Method to schedule an assignment for a classroom
    public void scheduleAssignment(String className, String assignmentName, String dueDate) {
        Classroom classroom = getClassroom(className);
        LocalDateTime dueDatetime = LocalDateTime.parse(dueDate);
        Assignment assignment = new Assignment(assignmentName, "Complete the assignment", dueDatetime);
        classroom.addAssignment(assignment);
        System.out.println("Assignment '" + assignmentName + "' has been scheduled for " + className + ".");
    }

    // Method for a student to submit an assignment
    public void submitAssignment(String studentName, String className, String assignmentName) {
        Classroom classroom = getClassroom(className);
        Student student = classroom.getStudents().stream()
                .filter(s -> s.getName().equalsIgnoreCase(studentName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Student not found"));
        
        // For simplicity, we're using a random submission. In a real application, you'd get actual submission content.
        String submission = "This is a sample submission for " + assignmentName;
        classroom.submitAssignment(student, assignmentName, submission);
        System.out.println("Assignment '" + assignmentName + "' submitted by " + studentName + " in " + className + ".");
    }

    // Method to list all available classrooms
    public void listClassrooms() {
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
        } else {
            System.out.println("Classrooms:");
            classrooms.values().forEach(classroom -> 
                System.out.println("- " + classroom.getName() + " (" + classroom.getSubject() + ")"));
        }
    }

    // Method to generate a report
    public void listStudentsInClassroom(String className) {
        Classroom classroom = getClassroom(className);
        Set<Student> students = classroom.getStudents();
        if (students.isEmpty()) {
            System.out.println("No students enrolled in " + className + ".");
        } else {
            System.out.println("Students in " + className + ":");
            students.forEach(student -> 
                System.out.println("- " + student.getName() + " (" + student.getEmail() + ")"));
        }
    }

    public void generateClassroomReport(String className) {
        Classroom classroom = getClassroom(className);
        String report = classroom.generateReport();
        System.out.println(report);
    }

    private Classroom getClassroom(String className) {
        return Optional.ofNullable(classrooms.get(className))
                .orElseThrow(() -> new IllegalArgumentException("Classroom not found: " + className));
    }
}