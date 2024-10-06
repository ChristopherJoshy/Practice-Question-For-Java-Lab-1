package PractieceJavalab1;

import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (array[i] < first) {
                second = first;
                first = array[i];
            } else if (array[i] < second && array[i] != first) {
                second = array[i];
            }
        }

        System.out.println("Second smallest element: " + second);
    }
}

