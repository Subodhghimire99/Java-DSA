package Searching;

public class minIn2DArray {
    public static void main(String[] args) {
        int[][] myArr = {
                {23,45,46,56,766,768,867},
                {32342,543,5656,43,21},
                {54,234,400050,99},
        };
        System.out.println(min(myArr));
    }
    static int min(int[][] myArr){
        int min = myArr[0][0];
        for (int row=0; row<myArr.length; row++){
            for(int col=0; col<myArr[row].length; col++) {
                if (min > myArr[row][col]) {
                    min = myArr[row][col];
                }
            }
        }
        return min;
    }
}
