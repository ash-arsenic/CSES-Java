package Introductory_Problems;

import java.util.*;

public class Repititions {

    int solution(String input) {
        int result = 0;
        var count = 1;
        for (int i=1; i<input.length(); i++) {
            if (input.charAt(i-1) != (input.charAt(i))) {
                result = result < count ? count : result;
                count = 0;
            }
            count++;
        }
        return result < count ? count : result;
    }
    static void execute() {
        var scanner = new Scanner(System.in);
        String input = scanner.next();
        Repititions repititions = new Repititions();
        System.out.println(repititions.solution(input));
    }
}