package miniProject2;
import java.util.Scanner;

public class changeChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy szót: ");
        String szo = sc.nextLine();
        String modszo = "";
        for (int i = 0; i < szo.length(); i++){
            if (szo.charAt(i) == 'a' || szo.charAt(i) == 'A'){
                modszo += "*";
            } else {
                modszo += szo.charAt(i);
            }
        }
        System.out.println("Módosított szó: " + modszo);
        sc.close();
    }
}
