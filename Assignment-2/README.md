# Virtual Classroom Manager

This project is a simple Java-based virtual classroom manager. It allows you to manage classrooms, students, assignments, and submissions through command-line interactions.

## Features

- Create classrooms with names and subjects.
- Enroll students in classrooms.
- Schedule assignments for classrooms with due dates.
- Submit assignments as a student.
- List all classrooms and students in a classroom.
- Generate classroom reports.

## Project Structure

The project consists of several Java classes:

- `VirtualClassroomManager`: The main class for managing classrooms and their operations.
- `Classroom`: Represents a classroom with students and assignments.
- `Student`: Represents a student with an ID, name, and email.
- `Assignment`: Represents an assignment with a name, description, and due date.
- `Main`: The entry point of the application where you can interact with the Virtual Classroom Manager.

## Requirements

- Java Development Kit (JDK) 8 or higher

## How to Run

1. Clone or download this repository.
2. Navigate to the project directory where all `.java` files are located.
3. Open a terminal or command prompt in the project directory.

### Compiling the Project

To compile all Java files at once, run the following command in your terminal:

```bash
javac *.java
```
This will generate `.class` files for each `.java` file in the directory.

### Running the Application
To run the application, execute the following command:

```bash
java main
```

## Example Usage

Once the project is running, you can interact with the classroom manager. Here are some example commands you might see or input:

Create a Classroom:  
Input: `addClassroom "Math,Integration"`

Add a Student to a Classroom:  
Input: `addStudent "Shiv Patel,shiv.patel@gmail.com" "Math"`

Schedule an Assignment:  
Input: `scheduleAssignment "Math" "Integration Homework" "2024-10-10T10:00"`

Submit an Assignment:  
Input: `submitAssignment "Shiv Patel" "Math" "Integration Homework"`

List Classrooms:  
Input: `listClassrooms`

List Students in a Classroom:  
Input: `listStudentsInClassroom "Math"`

Generate Classroom Report:  
Input: `generateClassroomReport "Math"`
