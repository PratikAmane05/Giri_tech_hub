import java.util.Scanner;

public class Ques_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side a: "); double a = sc.nextDouble();
        System.out.print("Enter side b: "); double b = sc.nextDouble();
        System.out.print("Enter side c: "); double c = sc.nextDouble();
        boolean valid = (a + b > c) && (a + c > b) && (b + c > a);
        System.out.println(valid ? "Triangle is valid" : "Triangle is not valid");
        sc.close();
    }
}
