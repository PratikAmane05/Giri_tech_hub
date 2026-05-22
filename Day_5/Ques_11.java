package Day_5;

import java.util.Scanner;

class ArraySecondLargest {

    private final int[] arr = new int[5];
    private final Scanner sc = new Scanner(System.in);

    void inputArray(int arr[]) {
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            this.arr[i] = arr[i];
        }
    }

    int findSecondLargest() {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int value : arr) {
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest && value < largest) {
                secondLargest = value;
            }
        }

        return secondLargest;
    }

    public static void main(String args[]) {
        ArraySecondLargest obj = new ArraySecondLargest();
        int arr[] = new int[5];
        obj.inputArray(arr);
        System.out.println("Second Largest = " + obj.findSecondLargest());
    }
}