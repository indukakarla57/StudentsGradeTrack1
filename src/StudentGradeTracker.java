import java.util.Scanner;

class StudentGradeTracker {

    // Method to calculate average
    static double findAverage(int marks[]) {
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        return (double) sum / marks.length;
    }

    // Method to find highest mark
    static int findHighest(int marks[]) {
        int highest = marks[0];

        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }

        return highest;
    }

    // Method to find lowest mark
    static int findLowest(int marks[]) {
        int lowest = marks[0];

        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        return lowest;
    }

    // Method to find grade
    static char findGrade(int mark) {

        if (mark >= 90) {
            return 'A';
        } 
        else if (mark >= 80) {
            return 'B';
        } 
        else if (mark >= 60) {
            return 'C';
        } 
        else {
            return 'D';
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String names[] = new String[n];
        int marks[] = new int[n];

        // Taking student details
        for (int i = 0; i < n; i++) {

            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.next();

            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
        }

        // Student report
        System.out.println();
        System.out.println("----- STUDENT GRADE REPORT -----");

        for (int i = 0; i < n; i++) {

            System.out.println("Student Name : " + names[i]);
            System.out.println("Marks        : " + marks[i]);
            System.out.println("Grade        : " + findGrade(marks[i]));
            System.out.println();
        }

        // Class summary
        System.out.println("----- CLASS SUMMARY -----");

        System.out.printf("Average : %.2f%n", findAverage(marks));
        System.out.println("Highest : " + findHighest(marks));
        System.out.println("Lowest  : " + findLowest(marks));

        sc.close();
    }
}