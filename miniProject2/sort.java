package miniProject2;

import java.util.Arrays;
import java.util.Scanner;

public class sort {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adja meg a tömb elemeit vesszővel elválasztva:");
        String[] elements = scanner.nextLine().split("\\s*,\\s*");
        
        int[] array = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }

        System.out.println("Eredeti tömb: " + Arrays.toString(array));
        
        Arrays.sort(array);

        System.out.println("Rendezett tömb: " + Arrays.toString(array));

        scanner.close();
    }
}
