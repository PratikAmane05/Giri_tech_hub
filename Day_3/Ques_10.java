import java.util.Scanner;
public class Ques_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long n = sc.nextLong();
        int count = 0;
        if(n==0) count = 1;
        while(n!=0){ count++; n/=10; }
        System.out.println("Digits = " + count);
    }
}
