import java.util.Scanner;
public class Ques_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long n = sc.nextLong();
        long rev=0, t=n;
        while(t!=0){ rev = rev*10 + t%10; t/=10; }
        System.out.println("Reverse = " + rev);
    }
}
