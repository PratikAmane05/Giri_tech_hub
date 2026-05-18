import java.util.Scanner;

public class Ques_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: "); int n = sc.nextInt();
        int sq = n * n;
        int sum = 0;
        while (sq != 0) {
            sum += sq % 10;
            sq /= 10;
        }
        if (sum == n)
            System.out.println(n + " is a Neon Number");
        else
            System.out.println(n + " is not a Neon Number");
        sc.close();
    }
}
