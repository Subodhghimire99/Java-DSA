package Searching;

public class minElementInArray {
    public static void main(String[] args) {
        int[] myArr = {1223,34,54,65,768,87,342,45,64,43,26436,1343,54,66,6434};
        System.out.println(min(myArr));
    }
    static int min(int[] myArr){
        int min = myArr[0];
        for(int i=1;i<myArr.length;i++){
            if (min>myArr[i]){
                min = myArr[i];
            }
        }
        return min;
    }
}
