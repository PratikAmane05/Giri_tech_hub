import java.util.Scanner;
public class Ques_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: "); int a = sc.nextInt();
        System.out.print("Enter exponent: "); int b = sc.nextInt();
        long res = 1; for(int i=0;i<b;i++) res *= a;
        System.out.println(a+"^"+b+" = "+res);
    }
}
