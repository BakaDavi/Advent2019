import java.util.Scanner;
public class Day1p1 {
    public static void main(String[] args){
        int sum = 0;
        System.out.print("Input: ");
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble()){
            double mass = in.nextDouble();
            int fuel = (int) Math.floor((mass/3)-2.0);
            sum += fuel ;
        }
        in.close();
        System.out.println("Fuel: "+ sum);
    }
}
