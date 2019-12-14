package AdventOfCode2019.Day4;

import java.util.stream.IntStream;

public class Day4p2 {
    public static void main(String[] args){
        int password = 172930;
        int count = 0;

        for (int i = 0; i < 510152; i++){
            boolean valid = false;
            boolean decreasing = false;
            password ++;
            String temp = Integer.toString(password);
            int[] guess = new int[temp.length()];
            int[] occurrences = new int[10];
            for (int digit = 0; digit < temp.length(); digit++)
            {
                guess[digit] = temp.charAt(digit) - '0';
                occurrences[temp.charAt(digit) - '0']++ ;
            }
            for (int j = 0; j < 5; j++){
                if (guess[j+1] < guess[j]){
                    decreasing = true;
                }
            }
            for (int j = 0; j < 5; j++){
                if (IntStream.of(occurrences).anyMatch(x -> x == 2) && !decreasing){ //This wouldn't work if there wasn't the "never decreasing" condition
                    valid = true;
                }
            }
            if (valid){
                count++ ;
            }
        }
        System.out.println("Valid passwords number: "+count); //1142
    }
}
