import java.util.Scanner;

public class Ques_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: "); char c = sc.next().charAt(0);
        System.out.println("ASCII value of " + c + " = " + (int) c);
        sc.close();
    }
}
