package AdventOfCode2019.Day4;

public class Day4p1 {
    public static void main(String[] args){
        int password = 172930;
        int count = 0;

        for (int i = 0; i < 510152; i++){
            boolean valid = false;
            boolean decreasing = false;
            password ++;
            String temp = Integer.toString(password);
            int[] guess = new int[temp.length()];
            for (int digit = 0; digit < temp.length(); digit++)
            {
                guess[digit] = temp.charAt(digit) - '0';
            }
            for (int j = 0; j < 5; j++){
                if (guess[j+1] < guess[j]){
                    decreasing = true;
                }
            }
            for (int j = 0; j < 5; j++){
                if (!decreasing && (guess[j] == guess[j+1])){
                    valid = true;
                }
            }
            if (valid){
                count++ ;
            }
        }
        System.out.println("Valid passwords number: "+count); //1675
    }
}
