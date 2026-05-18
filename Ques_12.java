import java.util.Scanner;

public class Ques_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: "); char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z')
            ch = (char) (ch - ('a' - 'A'));
        else if (ch >= 'A' && ch <= 'Z')
            ch = (char) (ch + ('a' - 'A'));
        System.out.println("Toggled: " + ch);
        sc.close();
    }
}
