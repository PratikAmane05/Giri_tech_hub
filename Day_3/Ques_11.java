import java.util.Scanner;
public class Ques_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long n = sc.nextLong();
        long sum = 0; long t = n;
        while(t!=0){ sum += t%10; t/=10; }
        System.out.println("Sum digits = " + sum);
    }
}
