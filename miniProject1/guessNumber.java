package miniProject1;

import java.util.Scanner;
import java.util.Random;

public class guessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int guessCount = 0;
        int guess;

        System.out.println("Gondoltam egy számra 1 és 100 között!" + randomNumber);

        do {
            System.out.println("Tipplej egy számra:");
            while(!sc.hasNextInt()) {
                System.out.println("Csak szám lehet!");
                sc.next();
            }
            
            guess = sc.nextInt();
            guessCount++;

            if (guess < randomNumber) {
                System.out.println("Kevés- a szám nagyobb");
            } else if (guess > randomNumber) {
                System.out.println("Sok- a szám kisebb");
            } else if (guess == randomNumber) {
                System.out.println("Gratulálok, eltaláltad "+ guessCount +" lépésből");
            }

        } while (guess != randomNumber);
        sc.close();
    }
}
