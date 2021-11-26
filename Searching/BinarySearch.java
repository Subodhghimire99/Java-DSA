package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] myArr = {12,34,45,66,69,78,88,99};
        for (int i =0;i< myArr.length;i++){
            int ans = binarySearch(myArr, myArr[i]);
            System.out.println(ans);
        }
//        int ans = binarySearch(myArr, 78);
//        System.out.println(ans);
    }
    static int binarySearch(int[] myArr,int target){
        int start = 0;
        int end = myArr.length-1;
        while(start<=end){
            int mid = start + (end - start)/ 2;
            if (myArr[mid] == target){
                return mid;
            }
            if(myArr[mid] > target){
                end = mid-1;
            }
            if(myArr[mid] < target){
                start = mid + 1;
            }
        }
        return -1;
    }
}
