package Searching;

import java.util.Arrays;

public class linearSearchIn2DArray {
    public static void main(String[] args) {
        int[][] myArr = {
                {23,43,54},
                {34, 234, 54, 65},
                {223,374,45,56}
        };
        int[] result = linearSearch(myArr, 374);
        System.out.println(Arrays.toString(result));
    }
    static int[] linearSearch(int[][] myArr, int target){
        for(int row=0;row<myArr.length;row++){
            for(int column=0;column<myArr[row].length;column++){
                if(myArr[row][column] == target){
                    return new int[]{row,column};
                }
            }
        }
        return new int[]{};
    }
}
