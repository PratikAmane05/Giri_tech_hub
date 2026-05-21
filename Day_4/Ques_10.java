package Day_4;
import java.util.Scanner;

class Ques_10 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int count;

        System.out.println("Enter elements:");

        for(int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<5; i++) {

            count = 1;

            for(int j=i+1; j<5; j++) {

                if(arr[i] == arr[j])
                    count++;
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
}