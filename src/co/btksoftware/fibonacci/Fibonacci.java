package co.btksoftware.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.print("Length of Fibonacci sequence: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int fib = Fib(number);
        System.out.println("Result: " + fib);
    }

    private static int Fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fib(n - 1) + Fib(n - 2);
        }
    }
}
