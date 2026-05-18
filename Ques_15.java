import java.util.Scanner;

public class Ques_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side a: "); double a = sc.nextDouble();
        System.out.print("Enter side b: "); double b = sc.nextDouble();
        System.out.print("Enter side c: "); double c = sc.nextDouble();
        if (a == b && b == c)
            System.out.println("Equilateral triangle");
        else if (a == b || b == c || a == c)
            System.out.println("Isosceles triangle");
        else
            System.out.println("Scalene triangle");
        sc.close();
    }
}
