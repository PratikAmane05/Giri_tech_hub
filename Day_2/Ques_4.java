import java.util.Scanner;
public class Ques_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int a,b,c;
        System.out.println("Enter first Angle: ");
        a= sc.nextInt();
        System.out.println("Enter second Angle: ");
        b= sc.nextInt();
        
        c= 180-(a+b);
        System.out.println("Third Angle: " + c);
}
}
