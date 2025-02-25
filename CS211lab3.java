
/**
 * Write a description of class CS211lab3 here.
 *
 * @author James Kavanagh
 * @version 25-02-2025
 */
import java.util.*;
public class CS211lab3
{
    public static String compress(String s, int i){
        s = s.toLowerCase(); // puts string to lower case
        if(s.isEmpty() == true){    // base case
            return "";
        }else if(s.length() == 1){ // when on the last digit
            return i + "" + s.charAt(0);
        }else if(s.charAt(0) == s.charAt(1)){   // counts the beside nums
            return compress(s.substring(1), ++i);
        }else{  // next step when numbers beside eachother arent the same
            return i + "" + s.charAt(0) + compress(s.substring(1), 1);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string to be compressed: ");

        String in = scanner.nextLine();
        String out = compress(in, 1);
        System.out.println(out);
        
        System.out.println("Compressed as: " + out);
        
        // getting ratio
        double num1 = in.length();
        double num2 = out.length();
        double ratio = (num2/num1)*100;
        System.out.println("Ratio: " + ratio);
    }
}
