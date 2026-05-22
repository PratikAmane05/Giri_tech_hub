package Day_5;

import java.util.Scanner;

class ArrayCopy {

    private final int[] arr = new int[5];
    private final Scanner sc = new Scanner(System.in);

    void inputArray(int arr[]) {
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            this.arr[i] = arr[i];
        }
    }

    int[] copyArray() {
        int copy[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    public static void main(String args[]) {
        ArrayCopy obj = new ArrayCopy();
        int arr[] = new int[5];
        obj.inputArray(arr);

        int result[] = obj.copyArray();

        System.out.println("Copied Array:");
        for (int value : result) {
            System.out.println(value);
        }
    }
}