package Day_5;

import java.util.Scanner;

class ArraySum {

    private final int[] arr = new int[5];
    private final Scanner sc = new Scanner(System.in);

    void inputArray(int arr[]) {
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            this.arr[i] = arr[i];
        }
    }

    int calculateSum() {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    public static void main(String args[]) {
        ArraySum obj = new ArraySum();
        int arr[] = new int[5];
        obj.inputArray(arr);
        System.out.println("Sum = " + obj.calculateSum());
    }
}