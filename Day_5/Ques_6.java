package Day_5;

import java.util.Scanner;

class ArrayReverse {

    private final int[] arr = new int[5];
    private final Scanner sc = new Scanner(System.in);

    void inputArray(int arr[]) {
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            this.arr[i] = arr[i];
        }
    }

    void reverseArray() {
        System.out.println("Reverse Array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        ArrayReverse obj = new ArrayReverse();
        int arr[] = new int[5];
        obj.inputArray(arr);
        obj.reverseArray();
    }
}