import java.util.Scanner;

class Ques_16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        char grade;

        System.out.print("Enter grade: ");
        grade = sc.next().charAt(0);

        switch(grade) {
            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Good");
                break;

            case 'C':
                System.out.println("Average");
                break;

            case 'D':
                System.out.println("Poor");
                break;

            case 'F':
                System.out.println("Fail");
                break;

            default:
                System.out.println("Invalid Grade");
        }
    }
}
