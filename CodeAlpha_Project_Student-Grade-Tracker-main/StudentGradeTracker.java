import java.util.*;

class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.print("Enter the number of students - ");
        int students = scanner.nextInt();

        // Input grades
        for (int i = 0; i < students; i++) {
            System.out.printf("Enter grade for student %d -  ", i + 1);
            int grade = scanner.nextInt();
            grades.add(grade);
        }

        // Calculate average,highest and lowest grade
        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        for (int grade : grades) {
            sum += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }
        double average = (double) sum / students;

        // output
        System.out.println("Grades entered: " + grades);
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
    }
}
