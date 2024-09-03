package task1;

import java.util.Scanner;

public class FibonacciService {

    public static boolean isFibonacciNumber(int n) {
        int a = 0, b = 1;

        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return (b == n || a == n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isFibonacciNumber(number)) {
            System.out.println("The number " + number + " belongs to the Fibonacci sequence.");
        } else {
            System.out.println("The number " + number + " does not belong to the Fibonacci sequence.");
        }

        scanner.close();
    }
}
