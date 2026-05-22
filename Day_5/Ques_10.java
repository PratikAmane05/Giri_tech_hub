package Day_5;

import java.util.Scanner;

class ArrayFrequency {

    private final int[] arr = new int[5];
    private final Scanner sc = new Scanner(System.in);

    void inputArray(int arr[]) {
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            this.arr[i] = arr[i];
        }
    }

    void countFrequency() {
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }

    public static void main(String args[]) {
        ArrayFrequency obj = new ArrayFrequency();
        int arr[] = new int[5];
        obj.inputArray(arr);
        obj.countFrequency();
    }
}