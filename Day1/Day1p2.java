package AdventOfCode2019.Day1;
import java.util.Scanner;
public class Day1p2 {
    public static void main(String[] args){
        int result = 0;
        System.out.println("Input mass:");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int mass = scanner.nextInt();
            while(fuel(mass) > 0){
                result += fuel(mass);
                mass = fuel(mass);
            }
        }
        scanner.close();
        System.out.println("Fuel needed: " +result);
    }
    private static int fuel(int m){
        return (int) Math.floor((m/3)-2);
    }
}
