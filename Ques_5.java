import java.util.Scanner;

public class Ques_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            total += sc.nextInt();
        }
        double percent = total / 5.0;
        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percent + "%");
        sc.close();
    }
}
