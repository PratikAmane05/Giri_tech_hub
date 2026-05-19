import java.util.Scanner;

class Ques_10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a < b && a < c)
            System.out.println("Minimum = " + a);
        else if(b < c)
            System.out.println("Minimum = " + b);
        else
            System.out.println("Minimum = " + c);
    }
}
