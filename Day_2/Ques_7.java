import java.util.Scanner;

class Ques_7 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        float cp, sp, profit, loss;

        System.out.print("Enter Cost Price: ");
        cp = sc.nextFloat();

        System.out.print("Enter Selling Price: ");
        sp = sc.nextFloat();

        if(sp > cp) {

            profit = sp - cp;

            System.out.println("Profit");
            System.out.println("Profit Amount = " + profit);
        }

        else if(cp > sp) {

            loss = cp - sp;

            System.out.println("Loss");
            System.out.println("Loss Amount = " + loss);
        }

        else {

            System.out.println("No Profit No Loss");
        }
    }
}
