import java.util.Scanner;
import java.util.Arrays;

public class Array2DInputOutput{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr2d = new int[3][3];
        for(int row=0; row< arr2d.length; row++){
            for(int column=0; column<arr2d[row].length; column++){
                arr2d[row][column] = in.nextInt();
            }
        }
        for(int [] a: arr2d){
            System.out.println(Arrays.toString(a));
        }
    }
}
