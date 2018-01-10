package co.btksoftware.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.print("Length of Fibonacci sequence: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int fib = Fibo(number);
        System.out.println("Result: " + fib);
    }

    private static int Fibo(int n) {
        if (n > 1) {
            return Fibo(n - 1) + Fibo(n - 2);
        } else {
            return n;
        }
    }
}
