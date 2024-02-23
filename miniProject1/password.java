package miniProject1;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3 ; i++){
            System.out.println("Add your password: ");
            String pw = sc.nextLine();

            if (checkPassword(pw)){
                System.out.println("Password is correct");
            } else {
                System.out.println("Password is not correct. You have " + (2 - i) + " tries left");
            }
        }
        sc.close();
        System.out.println("To manny incorrect tries. Your account has been locked.");
    }
    
     public static boolean checkPassword(String pw){
        return pw.equals("1234");
    }
}
