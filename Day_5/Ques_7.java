package Day_5;

import java.util.Scanner;

class ArraySort {

    private final int[] arr = new int[5];
    private final Scanner sc = new Scanner(System.in);

    void inputArray(int arr[]) {
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            this.arr[i] = arr[i];
        }
    }

    void sortArray() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int value : arr) {
            System.out.println(value);
        }
    }

    public static void main(String args[]) {
        ArraySort obj = new ArraySort();
        int arr[] = new int[5];
        obj.inputArray(arr);
        obj.sortArray();
    }
}