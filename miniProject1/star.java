package miniProject1;

import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Enter a number: ");
            while(!sc.hasNextInt()) {
                System.out.println("Invalid input. Please, enter a  positeive number: ");
                sc.next();
            }
            n = sc.nextInt();
        }while (n <= 0);
        
        for (int i = 1; i <=n ; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
