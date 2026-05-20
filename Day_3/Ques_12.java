import java.util.Scanner;
public class Ques_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long n = sc.nextLong();
        long prod = 1; long t = n; boolean has=false;
        if(n==0) prod = 0;
        while(t!=0){ has=true; prod *= (t%10); t/=10; }
        System.out.println("Product digits = " + prod);
    }
}
