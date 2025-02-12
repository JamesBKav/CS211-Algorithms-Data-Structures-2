import java.util.*;

public class CS211Lab1
{
    public static int maxArea(int[] ar){
        // start of array
        int left = 0;
        // end of array
        int right = ar.length-1;
        int area = 0; // area
       
        while(left < right){
            // takes left and right value, finds min, * by index difference
            int newArea = Math.min(ar[left],ar[right])*(right-left);
           
            area = Math.max(area,newArea);
           
            //if left value is less than right valule moves to next left value
            if(ar[left] < ar[right]){
                left++;
            }else{ // opposite to if statement
                right--;
            }
        }
       
        return area;
    }
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of elements: ");

    int n = scanner.nextInt();

    int[] height = new int[n];
    //int[] height = {1,8,6,2,5,4,8,3,7};

       

    System.out.println("Enter the heights: ");

    for (int i = 0; i < n; i++) {

        height[i] = scanner.nextInt();

    }

    scanner.close();
    System.out.println("Maximum water: " + maxArea(height));

    }
}