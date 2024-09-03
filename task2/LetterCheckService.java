package task2;

import java.util.Scanner;

public class LetterCheckService {

    public static int countLetterA(String input) {
        int count = 0;
        String lowerCaseInput = input.toLowerCase();

        for (char c : lowerCaseInput.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int count = countLetterA(input);
        System.out.println("The letter 'a' appears " + count + " times in the string.");

        scanner.close();
    }
}

