package Introductory_Problems;

import java.util.Scanner;

public class IncreasingArray {
    long solution(int input1, long[] input2) {
        long result = 0;
        for(int i=1; i<input1; i++) {
            var diff = input2[i-1] - input2[i];
            if (diff > 0) {
                input2[i] += diff; // Update the current index with latest value.
                result += diff;
            }
        }
        return result;
    }
    static void execute() {
        var scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        long[] input2 = new long[input1];
        for(int i=0; i<input1; i++) {
            input2[i] = scanner.nextLong();
        }
        var increasingArray = new IncreasingArray();
        System.out.println(increasingArray.solution(input1, input2));
    }
}