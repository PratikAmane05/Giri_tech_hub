package Day_4;
import java.util.Scanner;

class Ques_9 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int n, pos;

        System.out.print("Enter size: ");
        n = sc.nextInt();

        System.out.println("Enter elements:");

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position to delete: ");
        pos = sc.nextInt();

        for(int i=pos-1; i<n-1; i++) {
            arr[i] = arr[i+1];
        }

        System.out.println("Array after deletion:");

        for(int i=0; i<n-1; i++) {
            System.out.println(arr[i]);
        }
    }
}