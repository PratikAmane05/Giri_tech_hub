import java.util.Scanner;
public class Ques_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int i = 1;
        while(i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
