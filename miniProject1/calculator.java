package miniProject1;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, res;
        char op;
        do {
            System.out.println("Enter a number");
            num1 = sc.nextDouble();
            System.out.println("Enter another number");
            num2 = sc.nextDouble();

            System.out.println("Enter an operator (+, -, *, /)");
            op = sc.next().charAt(0);
            
            switch (op) {
                case '+':
                    res = num1 + num2;
                    System.out.println("Result: " + res);
                    break;
                case '-':
                    res = num1 - num2;
                    System.out.println("Result: " + res);
                    break;
                case '*':
                    res = num1 * num2;
                    System.out.println("Result: " + res);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero!");
                    } else {
                        res = num1 / num2;
                        System.out.println("Result: " + res);
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (op == '+' || op == '-' || op == '*' || op == '/');
        
        sc.close();
    }
}
