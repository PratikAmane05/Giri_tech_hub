import java.util.Scanner;

class Ques_17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int day;

        System.out.print("Enter day number: ");
        day = sc.nextInt();

        switch(day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;

            case 6:
            case 7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Invalid Day");
        }
    }
}
