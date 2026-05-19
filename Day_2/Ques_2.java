
import java.util.Scanner;

class Ques_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num, first, last;

        System.out.print("Enter a 3 digit number: ");
        num = sc.nextInt();

        first = num / 100;
        last = num % 10;

        System.out.println("First digit = " + first);
        System.out.println("Last digit = " + last);
    }
}
