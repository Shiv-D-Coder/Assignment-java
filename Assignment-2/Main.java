import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the VirtualClassroomManager to manage classrooms, students, and assignments
        VirtualClassroomManager manager = new VirtualClassroomManager();
        Scanner scanner = new Scanner(System.in);

        // Display a welcome message and list of available commands
        System.out.println("Welcome to the Virtual Classroom Manager!");
        System.out.println("Available commands: add_classroom, add_student, schedule_assignment, submit_assignment, list_classrooms, list_students, generate_report, exit");

        while (true) {
            System.out.print("\nEnter command: ");
            String input = scanner.nextLine().trim();
            String[] parts = input.split("\\s+", 2);

            try {
                switch (parts[0].toLowerCase()) {
                    case "add_classroom":
                        if (parts.length < 2) {
                            System.out.println("Usage: add_classroom <name>,<subject>");
                        } else {
                            manager.addClassroom(parts[1]);
                        }
                        break;
                    case "add_student":
                        if (parts.length < 2) {
                            System.out.println("Usage: add_student <name>,<email> <classroom_name>");
                        } else {
                            String[] studentParts = parts[1].split("\\s+", 2);
                            if (studentParts.length < 2) {
                                System.out.println("Usage: add_student <name>,<email> <classroom_name>");
                            } else {
                                manager.addStudent(studentParts[0], studentParts[1]);
                            }
                        }
                        break;
                    case "schedule_assignment":
                        if (parts.length < 2) {
                            System.out.println("Usage: schedule_assignment <classroom_name> <assignment_name> <due_date>");
                        } else {
                            String[] assignmentParts = parts[1].split("\\s+", 3);
                            if (assignmentParts.length < 3) {
                                System.out.println("Usage: schedule_assignment <classroom_name> <assignment_name> <due_date>");
                            } else {
                                manager.scheduleAssignment(assignmentParts[0], assignmentParts[1], assignmentParts[2]);
                            }
                        }
                        break;
                    case "submit_assignment":
                        if (parts.length < 2) {
                            System.out.println("Usage: submit_assignment <student_name> <classroom_name> <assignment_name>");
                        } else {
                            String[] submissionParts = parts[1].split("\\s+", 3);
                            if (submissionParts.length < 3) {
                                System.out.println("Usage: submit_assignment <student_name> <classroom_name> <assignment_name>");
                            } else {
                                manager.submitAssignment(submissionParts[0], submissionParts[1], submissionParts[2]);
                            }
                        }
                        break;
                    case "list_classrooms":
                        manager.listClassrooms();
                        break;
                    case "list_students":
                        if (parts.length < 2) {
                            System.out.println("Usage: list_students <classroom_name>");
                        } else {
                            manager.listStudentsInClassroom(parts[1]);
                        }
                        break;
                    case "generate_report":
                        if (parts.length < 2) {
                            System.out.println("Usage: generate_report <classroom_name>");
                        } else {
                            manager.generateClassroomReport(parts[1]);
                        }
                        break;
                    case "exit":
                        System.out.println("Thank you for using Virtual Classroom Manager. Goodbye!");
                        return; // Exit the program
                    default:
                        System.out.println("Unknown command. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}