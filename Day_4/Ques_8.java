package Day_4;
import java.util.Scanner;

class Ques_8 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int n, pos, value;

        System.out.print("Enter size: ");
        n = sc.nextInt();

        System.out.println("Enter elements:");

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position: ");
        pos = sc.nextInt();

        System.out.print("Enter value: ");
        value = sc.nextInt();

        for(int i=n; i>=pos; i--) {
            arr[i] = arr[i-1];
        }

        arr[pos-1] = value;

        System.out.println("Array after insertion:");

        for(int i=0; i<=n; i++) {
            System.out.println(arr[i]);
        }
    }
}