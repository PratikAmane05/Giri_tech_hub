import java.util.Scanner;

public class Ques_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle1 (degrees): "); double a = sc.nextDouble();
        System.out.print("Enter angle2 (degrees): "); double b = sc.nextDouble();
        double c = 180 - (a + b);
        System.out.println("Third angle: " + c);
        sc.close();
    }
}
