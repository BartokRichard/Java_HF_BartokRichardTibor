package miniProject2;

import java.util.Scanner;

public class charComp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy szót: ");
        String szo = sc.nextLine();
        String comp = compressString(szo);
        System.out.println("Módosított szó: " + comp);
        sc.close();
    }

    
    public static String compressString(String szo) {
        StringBuilder comp = new StringBuilder();
        int count = 1;

        for (int i = 0; i < szo.length(); i++) {
            if (i + 1 < szo.length() && szo.charAt(i) == szo.charAt(i + 1)) {
                count++;
            } else {
                comp.append(szo.charAt(i));
                comp.append(count);
                count = 1;
            }
        }

        return comp.toString();
    }

}
