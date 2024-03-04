package miniProject2;

import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adja meg a tömb elemeit vesszővel elválasztva:");
        String[] elements = scanner.nextLine().split("\\s*,\\s*");
        int length = elements.length;

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }

        int min = findMin(array);
        int max = findMax(array);

        System.out.println("A tömb legkisebb eleme: " + min);
        System.out.println("A tömb legnagyobb eleme: " + max);

        scanner.close();
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
