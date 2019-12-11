import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day2p1 {
    public static void main(String[] Args){
        System.out.println("Input:");
        Scanner scanner = new Scanner(System.in);
        String scanned = scanner.next();
        ArrayList<String> splitted = new ArrayList<>(Arrays.asList(scanned.split(",")));

        splitted.set(1, "12");
        splitted.set(2, "2");
        int i = 0;
        while(i < splitted.size()-3){
            int op = Integer.parseInt(splitted.get(i));
            int value1 = Integer.parseInt(splitted.get(Integer.parseInt(splitted.get(i+1))));
            int value2 = Integer.parseInt(splitted.get(Integer.parseInt(splitted.get(i+2))));
            int resultPosition = Integer.parseInt(splitted.get(i+3));
            if (op == 99){
                break;
            }
            switch(op){
                case 1:
                    splitted.set(resultPosition, Integer.toString(value1+value2));
                    break;
                case 2:
                    splitted.set(resultPosition, Integer.toString(value1*value2));
                    break;
                default:
                    break;
            }
            i += 4;
        }
        System.out.println("Result: "+splitted.get(0));
    }
}
