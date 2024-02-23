package miniProject1;

import java.util.Scanner;

public class coffeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double price = 100.0;

        do {
            System.out.println("Kérem válasszon:");
            System.out.println("1. Pohár nélkül");
            System.out.println("2. Dupla cukorral");
            System.out.println("3. Habos kávé");
            while (!sc.hasNextInt()) {
                System.out.println("Csak 1, 2 vagy 3 lehet a válasz!");
                sc.next();
            }
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    price -= 10.0;
                    break;
                case 2:
                    price +=  20.0;
                    break;
                case 3:
                    price += 50.0;
                    break;
                default:
                    System.out.println("Hiba! Csak 1, 2 vagy 3 lehet a válasz!");
                    continue;
            }

            while (true) {
                System.out.println("A kávé ára " + price + "Ft. Kérem az összeget!");
                while (!sc.hasNextDouble()) {
                    System.out.println("Csak számmal lehet az összeget kifizetni!");
                    sc.next();
                }
                double payment = sc.nextDouble();

                if (payment < price) {
                    System.out.println("Elégtelen az összeg.");
                    continue;
                } else {
                    double change = payment - price;
                    System.out.println("Köszönjük a vásárlást! Kérjük vegye el a visszajárót: " + change + "Ft");
                    break;
                }
            }

        } while (price < 0);

        sc.close();
    }
}
