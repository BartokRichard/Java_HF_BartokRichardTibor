package miniProject1;
import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        if (isAlphabetic(input)) {
            System.out.println("The string contains only alphabetic characters.");
        } else {
            System.out.println("The string contains non-alphabetic characters.");
        }
        sc.close();
    }

    public static boolean isAlphabetic(String text) {
        // Ellenőrizzük, hogy minden karakter betű-e
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!Character.isLetter(ch)) {
                return false;
            }
        }
        return true;
    }
}

