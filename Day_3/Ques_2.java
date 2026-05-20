import java.util.Scanner;
public class Ques_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int i = n;
        while(i >= 1) {
            System.out.println(i);
            i--;
        }
    }
}
