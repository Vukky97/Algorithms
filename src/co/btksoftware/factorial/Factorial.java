package co.btksoftware.factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.print("Calculate co.btksoftware.factorial of: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int fact = Fact(number);
        System.out.println("Result: " + number + "! = " + fact);
    }

    private static int Fact(int n) {
        if (n > 0) {
            return n * Fact(n - 1);
        } else {
            return 1;
        }
    }
}
