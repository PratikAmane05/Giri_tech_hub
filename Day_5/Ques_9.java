package Day_5;

import java.util.Scanner;

class ArrayMerge {

    private final int[] arr1 = new int[3];
    private final int[] arr2 = new int[3];
    private final Scanner sc = new Scanner(System.in);

    void inputArray(int arr1[], int arr2[]) {
        System.out.println("Enter first array elements:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
            this.arr1[i] = arr1[i];
        }

        System.out.println("Enter second array elements:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
            this.arr2[i] = arr2[i];
        }
    }

    int[] mergeArrays() {
        int merged[] = new int[arr1.length + arr2.length];
        int k = 0;

        for (int value : arr1) {
            merged[k++] = value;
        }

        for (int value : arr2) {
            merged[k++] = value;
        }

        return merged;
    }

    public static void main(String args[]) {
        ArrayMerge obj = new ArrayMerge();
        int arr1[] = new int[3];
        int arr2[] = new int[3];

        obj.inputArray(arr1, arr2);

        int result[] = obj.mergeArrays();

        System.out.println("Merged Array:");
        for (int value : result) {
            System.out.println(value);
        }
    }
}