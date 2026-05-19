import java.util.Scanner;

class Ques_13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int years;
        float salary, bonus;

        System.out.print("Enter years of service: ");
        years = sc.nextInt();

        System.out.print("Enter salary: ");
        salary = sc.nextFloat();

        if(years > 5) {
            bonus = salary * 0.05f;
            System.out.println("Bonus = " + bonus);
        }
        else {
            System.out.println("No Bonus");
        }
    }
}
