import java.util.Scanner;

class Ques_14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float sales, commission;

        System.out.print("Enter sales amount: ");
        sales = sc.nextFloat();

        if(sales < 5000)
            commission = sales * 0.02f;
        else if(sales <= 10000)
            commission = sales * 0.05f;
        else
            commission = sales * 0.10f;

        System.out.println("Commission = " + commission);
    }
}
