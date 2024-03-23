package Introductory_Problems;

import java.util.*;
public class WeirdAlgorithm {
    void solution(long input) {
        while (input != 1) { // Exit condition
            System.out.print(input + " ");
            input = input % 2 == 0 ? input / 2 : input * 3 + 1;
        }
        System.out.print(input);
    }
    static void execute() {
        var scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        WeirdAlgorithm algorithm = new WeirdAlgorithm();
        algorithm.solution(input);
    }
}
