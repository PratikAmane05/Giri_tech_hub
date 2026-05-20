import java.util.Scanner;
public class Ques_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: "); int n = sc.nextInt();
        System.out.print("Factors: ");
        for(int i=1;i<=n;i++) if(n%i==0) System.out.print(i+" ");
        System.out.println();
    }
}
