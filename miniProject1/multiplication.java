package miniProject1;
import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.println("Pick a number between 1 and 10");
            number = sc.nextInt();

            if (number < 1 || number > 10) {
                System.out.println("Incorrect number, please pick a number between 1 and 10");
            } else {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(number + " * " + i + " = " + number * i);
                }
            }
        } while (number < 1 || number > 10);

        sc.close();
    }
}
