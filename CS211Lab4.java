
/**
 * @author James Kavanagh
 * @version 04-03-2025
 */
import java.util.*;

public class CS211Lab4 {
    public static String[] chop(String s, int n) {
        // Creates array
        String[] split = new String[n];
        int pieceLen = s.length() / n;

        for (int i = 0; i < n; i++) {
            String temp = ""; // stores values to be added

            // adds values into temp
            for (int j = 0; j < pieceLen; j++) {
                temp = temp + s.charAt(j);
            }

            split[i] = temp; // adds values into array
            s = s.substring(pieceLen); // moves to next part
        }
        return split;
    }

    public static String chopAndHash(String s, int n) {
        // Creates array
        String[] chopped = new String[n];
        chopped = chop(s, n);

        String hash = "";

        for (String i : chopped) {
            int temp = 0;
            for (char j : i.toCharArray()) {
                temp += (int) j - 97;
            }
            System.out.println(temp);
            temp += 97;
            hash = hash + Character.toString((char) temp);
        }
        System.out.println(hash);
        return hash;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter the string: ");
        String s = scanner.nextLine();

        // Taking the block units
        System.out.print("Enter the number of pieces: ");
        int n = scanner.nextInt();
        scanner.close();

        // Compute and display the result
        String result = chopAndHash(s, n);

        System.out.println("Output: " + result);
    }
}
