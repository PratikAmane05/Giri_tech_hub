package Day_5;

import java.util.Scanner;

class ArraySearch {

    private final int[] arr = new int[5];
    private final Scanner sc = new Scanner(System.in);

    void inputArray(int arr[]) {
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            this.arr[i] = arr[i];
        }
    }

    boolean searchElement(int key) {
        for (int value : arr) {
            if (value == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        ArraySearch obj = new ArraySearch();
        int arr[] = new int[5];

        obj.inputArray(arr);

        System.out.print("Enter element to search: ");
        int key = obj.sc.nextInt();

        if (obj.searchElement(key)) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}