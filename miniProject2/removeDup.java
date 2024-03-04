package miniProject2;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class removeDup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem, adjon meg egy szöveget:");
        String input = scanner.nextLine();
        String result = removeDuplicates(input);
        System.out.println("Az új szöveg az ismétlődések nélkül: " + result);
        scanner.close();
    }

    public static String removeDuplicates(String input) {
        Set<Character> characters = new LinkedHashSet<>();

        for (int i = 0; i < input.length(); i++) {
            characters.add(input.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for (Character ch : characters) {
            sb.append(ch);
        }

        return sb.toString();
    }
}
