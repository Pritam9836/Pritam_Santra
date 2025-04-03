class Student {
    // Properties
    String name;
    int rollNumber;
    int marks;

    // Constructor
    Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    String calculateGrade() {
        if (marks >= 80 && marks <= 100) {
            return "Grade A";
        } else if (marks >= 60 && marks < 80) {
            return "Grade B";
        } else if (marks >= 40 && marks < 60) {
            return "Grade C";
        } else {
            return "Grade F";
        }
    }

    // Main method to create an object of Student and display the grade
    public static void main(String[] args) {
        // Creating an object of Student
        Student student = new Student("John Doe", 101, 85);

        // Displaying the grade of the student
        System.out.println("Student Name: " + student.name);
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Marks: " + student.marks);
        System.out.println("Grade: " + student.calculateGrade());
    }
}
