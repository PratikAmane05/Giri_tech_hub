import java.util.Scanner;

public class Ques_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seconds: "); int sec = sc.nextInt();
        int hours = sec / 3600;
        int minutes = (sec % 3600) / 60;
        int seconds = sec % 60;
        System.out.println(hours + " hour(s) " + minutes + " minute(s) " + seconds + " second(s)");
        sc.close();
    }
}
