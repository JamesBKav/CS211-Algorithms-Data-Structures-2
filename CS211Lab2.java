
/**
 * Write a description of class CS211Lab2 here.
 *
 * @author (James Kavanagh)
 * @version (18/2/25)
 */
import java.util.*;

public class CS211Lab2 {
    public static String getRoman(int hex) {
        if (hex > 0) {
            if (hex / 1000 > 0) {
                return "M" + getRoman(hex - 1000);
            } else if (hex / 500 > 0) {
                return "D" + getRoman(hex - 500);
            } else if (hex / 100 > 0) {
                return "C" + getRoman(hex - 100);
            } else if (hex / 50 > 0) {
                return "L" + getRoman(hex - 50);
            } else if (hex / 10 > 0) {
                return "X" + getRoman(hex - 10);
            } else if (hex / 5 > 0) {
                return "V" + getRoman(hex - 5);
            } else if (hex / 1 > 0) {
                return "I" + getRoman(hex - 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Hex string: ");
        String hex = scanner.nextLine();

        scanner.close();

        int number = Integer.parseInt(hex, 16);
        String romanR = getRoman(number);
        System.out.println(romanR);
        // System.out.println(roman);

    }
}
