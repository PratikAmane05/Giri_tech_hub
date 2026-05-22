package Day_5;

import java.util.Scanner;

class ArrayPalindrome {

    private final int[] arr = new int[5];
    private final Scanner sc = new Scanner(System.in);

    void inputArray(int arr[]) {
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            this.arr[i] = arr[i];
        }
    }

    boolean isPalindrome() {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        ArrayPalindrome obj = new ArrayPalindrome();
        int arr[] = new int[5];
        obj.inputArray(arr);

        if (obj.isPalindrome()) {
            System.out.println("Palindrome Array");
        } else {
            System.out.println("Not Palindrome Array");
        }
    }
}