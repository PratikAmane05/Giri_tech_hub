import java.util.Scanner;

class Ques_11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int marks;
        String grade;

        System.out.print("Enter marks: ");
        marks = sc.nextInt();

        grade = (marks >= 90) ? "A" :
                (marks >= 80) ? "B" :
                (marks >= 70) ? "C" : "F";

        System.out.println("Grade = " + grade);
    }
}
