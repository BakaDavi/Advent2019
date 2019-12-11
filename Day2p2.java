import java.util.ArrayList;
import java.util.Arrays;

public class Day2p2 {
    public static void main(String[] Args){
        String memory = "1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,13,1,19,1,10,19,23,1,6,23,27,1,5,27,31,1,10,31,35,2,10,35,39,1,39,5,43,2,43,6,47,2,9,47,51,1,51,5,55,1,5,55,59,2,10,59,63,1,5,63,67,1,67,10,71,2,6,71,75,2,6,75,79,1,5,79,83,2,6,83,87,2,13,87,91,1,91,6,95,2,13,95,99,1,99,5,103,2,103,10,107,1,9,107,111,1,111,6,115,1,115,2,119,1,119,10,0,99,2,14,0,0";
        boolean exit = false;

        for (int noun = 0; noun < 100 && !exit; noun++){
            for (int verb = 0; verb < 100 && !exit; verb++){
                ArrayList<String> splitted = new ArrayList<>(Arrays.asList(memory.split(",")));
                splitted.set(1, String.valueOf(noun));
                splitted.set(2,String.valueOf(verb));
                System.out.println("Trying values: "+noun +"-" +verb);
                intcode(splitted);
                if (Integer.parseInt(splitted.get(0)) == 19690720){
                    System.out.println("Mr. Robot whispers the answer: "+ (100*noun+verb));
                    exit = true;
                } else {
                    System.out.println("Failed!");
                }
            }
        }
    }

    private static void intcode (ArrayList<String> splitted){
        int i = 0;
        while(i < splitted.size()){
            int op = Integer.parseInt(splitted.get(i));
            int value1 = Integer.parseInt(splitted.get(Integer.parseInt(splitted.get(i+1))));
            int value2 = Integer.parseInt(splitted.get(Integer.parseInt(splitted.get(i+2))));
            int resultPosition = Integer.parseInt(splitted.get(i+3));
            if (resultPosition > splitted.size()){
                System.out.println("Invalid parameter:" +resultPosition);
                break;
            }
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
    }
}