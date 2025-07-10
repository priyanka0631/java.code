import java.util.Scanner;

class Student {
    String name;
    String address;
    int[] marks = new int[5];
    int total;
    int average;
    String grade;

    void calculateGrade() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        average = total / 5;

        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Marks:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        sc.nextLine();  // Consume newline left after nextInt()

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();  // Instantiate each student

            System.out.println("Enter details for student " + (i + 1));

            System.out.print("Name: ");
            students[i].name = sc.nextLine();

            System.out.print("Address: ");
            students[i].address = sc.nextLine();

            for (int j = 0; j < 5; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                students[i].marks[j] = sc.nextInt();
            }
            sc.nextLine();  // Consume newline after reading marks

            students[i].calculateGrade();
        }

        System.out.println("\n--- Students Details and Grades ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            students[i].display();
        }

        sc.close();
    }
}
