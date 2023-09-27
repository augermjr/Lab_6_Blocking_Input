import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String trash = "";

        System.out.println("Input temperature in degrees Celsius: ");
        do {
            trash = in.nextLine();
            System.out.println("Invalid input, try again.\nInput temperature in degrees Celsius: ");
        } while(!in.hasNextInt());

        int degC = in.nextInt();
        int degF = (degC * 9/5) + 32;
        System.out.println( degC + "°C is equivalent to " + degF + "°F");
    }
}