package Day_5;

import java.util.Scanner;

class ArrayEvenOdd {

    private final int[] arr = new int[5];
    private final Scanner sc = new Scanner(System.in);

    void inputArray(int arr[]) {
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            this.arr[i] = arr[i];
        }
    }

    int countEven() {
        int even = 0;
        for (int value : arr) {
            if (value % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    int countOdd() {
        int odd = 0;
        for (int value : arr) {
            if (value % 2 != 0) {
                odd++;
            }
        }
        return odd;
    }

    public static void main(String args[]) {
        ArrayEvenOdd obj = new ArrayEvenOdd();
        int arr[] = new int[5];
        obj.inputArray(arr);
        System.out.println("Even Numbers = " + obj.countEven());
        System.out.println("Odd Numbers = " + obj.countOdd());
    }
}