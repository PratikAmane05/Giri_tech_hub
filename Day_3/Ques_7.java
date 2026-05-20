import java.util.Scanner;
public class Ques_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int i = 2, sum = 0;
        while(i <= n){ sum += i; i += 2; }
        System.out.println("Sum of even = " + sum);
    }
}
