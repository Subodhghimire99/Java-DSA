package Searching;

public class maxIn2DArray {
    public static void main(String[] args) {
        int[][] myArr = {
                {23,45,46,56,766,768,867},
                {32342,543,5656,43,21},
                {1,234,400050,99},
        };
        System.out.println(max(myArr));
    }
    static int max(int[][] myArr){
        int max = myArr[0][0];
        for (int row=0; row<myArr.length; row++){
            for(int col=0; col<myArr[row].length; col++) {
                if (max < myArr[row][col]) {
                    max = myArr[row][col];
                }
            }
        }
        return max;
    }
}
