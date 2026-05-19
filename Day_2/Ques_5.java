import java.util.Scanner;

class Ques_5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num, rev;

        System.out.print("Enter 3 digit number: ");
        num = sc.nextInt();

        rev = (num % 10) * 100 + ((num / 10) % 10) * 10 + (num / 100);

        if(num == rev)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome Number");
    }
}
