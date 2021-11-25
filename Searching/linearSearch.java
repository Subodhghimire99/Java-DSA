package Searching;

public class linearSearch {
    public static void main(String[] args) {
        int[] myArr = {2,3,4,56,7,234,342,546,576,78,12};
        int result = linearSearch2(myArr, 0);
        System.out.println(result);
    }

    //returning index
    static int linearSearch(int[] myArr, int target){
        if (myArr.length == 0){
            return -1;
        }
        for(int i=0;i<myArr.length;i++){
            if (myArr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //returning value
    static int linearSearch2(int[] myArr, int target){
        if (myArr.length == 0){
            return Integer.MAX_VALUE;
        }
        for(int i=0;i<myArr.length;i++){
            if (myArr[i] == target) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
