import java.util.Scanner;

public class Ques_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num, rev;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        rev = (num % 10) * 100 + ((num / 10) % 10) * 10 + (num / 100);

        System.out.println("Reverse number: " + rev);
    }
}
