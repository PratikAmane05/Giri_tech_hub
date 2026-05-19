import java.util.Scanner;
public class Ques_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount, sum=0, notes;
        System.out.println("Enter Amount");
        amount=sc.nextInt();
         
        notes=amount/500;
        sum=sum+notes;
        System.out.println("Rs. 500="+notes);
        amount=amount-notes*500;

        notes=amount/200;
        sum=sum+notes;
        System.out.println("Rs. 200="+notes);
        amount=amount-notes*200;

        notes=amount/100;
        sum=sum+notes;
        System.out.println("Rs. 100="+notes);
        amount=amount-notes*100;

        notes=amount/50;
        sum=sum+notes;
        System.out.println("Rs. 50="+notes);
        amount=amount-notes*50;

        notes=amount/20;
        sum=sum+notes;
        System.out.println("Rs. 20="+notes);
        amount=amount-notes*20;

        notes=amount/10;
        sum=sum+notes;
        System.out.println("Rs. 10="+notes);
        amount=amount-notes*10;

        notes=amount/5;
        sum=sum+notes;
        System.out.println("Rs. 5="+notes);
        amount=amount-notes*5;

        System.out.println("Remaining amount="+ amount);

        System.out.println("Total="+(sum));

    }
}
