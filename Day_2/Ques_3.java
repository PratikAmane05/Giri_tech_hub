import java.util.Scanner;

class Ques_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num, first, last, sum;

        System.out.print("Enter number: ");
        num = sc.nextInt();

        first = num / 100;
        last = num % 10;

        sum = first + last;

        System.out.println("Sum = " + sum);
    }
}
