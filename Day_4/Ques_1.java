package Day_4;
import java.util.Scanner;

class Ques_1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter 5 elements:");

        for(int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Elements:");

        for(int i=0; i<5; i++) {
            System.out.println(arr[i]);
        }
    }
}