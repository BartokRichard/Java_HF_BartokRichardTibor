package miniProject2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class repeatFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adja meg a tömb elemeit vesszővel elválasztva:");
        String[] elements = scanner.nextLine().split("\\s*,\\s*");
        
        int[] array = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }

        Map<Integer, Integer> occurrences = findMultipleOccurrences(array);
        
        System.out.println("Többször előforduló elemek:");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " (" + entry.getValue() + " alkalommal)");
            }
        }

        scanner.close();
    }
    
    public static Map<Integer, Integer> findMultipleOccurrences(int[] array) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        
        for (int num : array) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }
        
        return occurrences;
    }
}
