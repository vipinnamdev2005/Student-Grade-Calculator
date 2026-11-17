import java.util.Scanner;

class Student {
    float marks;

    Student(float marks) {
        this.marks = marks;
    }
}

public class studentGrade {
    public static void main(String[] args) {
        studentGrade();
    }

    static void studentGrade() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Subjects Are There: ");
        int totalSub = sc.nextInt();
        float totalMarks = 0;
        for (int i = 1; i <= totalSub; i++) {
            System.out.println("Enter " + i + " Subject Numbers Out Of 100: ");
            float marks = sc.nextFloat();
            totalMarks = totalMarks + marks;
        }
        float averageMarks = totalMarks / totalSub;
        String grade;
        if (averageMarks < 32) {
            grade = "D fail";

        } else if (averageMarks < 50) {
            grade = "C";

        } else if (averageMarks < 75) {
            grade = "B";

        } else if (averageMarks < 90) {
            grade = "A";
            
        }else{
            grade = "A+";
        }
        System.out.println("Total Marks:- " + totalMarks);
        System.out.println("Average Persentage:- " + averageMarks + "%");
        System.out.println("Grade:- " + grade);

    }

}
