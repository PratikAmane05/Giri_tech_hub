import java.util.Scanner;
public class Ques_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: "); long n = sc.nextLong();
        long first=n; while(first>=10) first/=10; long last=n%10;
        System.out.println("Sum first+last = " + (first+last));
    }
}
