package Day_4;
import java.util.Scanner;

class Ques_11 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,2,3,4,4,5};

        for(int i=0; i<arr.length; i++) {

            int count = 0;

            for(int j=0; j<arr.length; j++) {

                if(arr[i] == arr[j])
                    count++;
            }

            if(count == 1)
                System.out.println(arr[i]);
        }
    }
}