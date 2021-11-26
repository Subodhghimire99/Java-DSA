package Searching;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] myArr = {-1,0,1,2,34,45,56,67,87,989,8988,676765,6448635};
//        int[] myArr = {5646,3455,435,43,39,33,32,11,-2,-6};
        int target = 0;
        int ans = orderAgnosticBinarySearch(myArr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBinarySearch(int[] myArr, int target){
        boolean isAscending = myArr[0] < myArr[myArr.length-1];
        int start = 0;
        int end = myArr.length-1;
        while (start<=end){
            //we can use (start+end)/2 , we didn't because for large integer it is not good
            int mid = start + (end-start)/2;
            if (myArr[mid] == target){
                return mid;
            }
            if (isAscending){
                if (myArr[mid] > target){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else {
                if(myArr[mid]>target){
                    start = mid + 1;
                }
                else{
                    end = mid-1;
                }
            }
        }

        return -1;
    }
}
