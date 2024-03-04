package miniProject2;

import java.util.Scanner;

public class firstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Kérek egy szót:");
        String szo = sc.nextLine();

        if (szo.length() > 0){
            char elso = szo.charAt(0);
            char utolso = szo.charAt(szo.length() - 1);
            System.out.println("Elso karakter: " + elso);
            System.out.println("Utolso karakter: " + utolso);
        } else {
            System.out.println("Nem adott meg szót!");
        }
        
        sc.close();
    }
}
