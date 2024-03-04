package miniProject2;

import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kérem, adja meg a tömb elemeit szóközzel elválasztva:");
        String[] input = scanner.nextLine().split("\\s*,\\s*");
        
        if (input.length >= 1) {
            int[] tomb = new int[input.length];
            
            for (int i = 0; i < input.length; i++) {
                tomb[i] = Integer.parseInt(input[i]);
            }
            
            System.out.println("Eredeti tömb: " + Arrays.toString(tomb));
   
            int temp = tomb[0];
            tomb[0] = tomb[tomb.length - 1];
            tomb[tomb.length - 1] = temp;
            
            System.out.println("A felcserélt tömb: " + Arrays.toString(tomb));
        } else {
            System.out.println("A tömb üres, nincs mit cserélni.");
        }
        
        scanner.close();
    }
}
