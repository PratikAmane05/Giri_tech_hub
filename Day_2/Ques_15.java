import java.util.Scanner;

class Ques_15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        char op;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.print("Enter operator (+,-,*,/,%): ");
        op = sc.next().charAt(0);

        switch(op) {
            case  '+':
                System.out.println("Addition = " + (a + b));
                break;

            case '-':
                System.out.println("Subtraction = " + (a - b));
                break;

            case '*':
                System.out.println("Multiplication = " + (a * b));
                break;

            case '/':
                System.out.println("Division = " + (a / b));
                break;

            case '%':
                System.out.println("Modulus = " + (a % b));
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
