package Introductory_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    static void execute() {
        var scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        boolean[] enteredNumbers = new boolean[count];
        Arrays.fill(enteredNumbers, false);
        for (int i = 0; i < count - 1; i++) {
            var index = scanner.nextInt();
            enteredNumbers[index - 1] = true;
        }
        for (int i = 0; i < count; i++) {
            if (enteredNumbers[i] == false) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
