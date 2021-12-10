package PracticeQuestions;

import java.util.Arrays;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] ans = {-1,-1};
        int[] arr = {1,2,3,4,5,5,5,6,6,7,7,7,7,8};
        int target = 20;
        ans = findFirstAndLast(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findFirstAndLast(int[] arr,int target){
        int[] ans = {-1,-1};
        ans[0] = findIndex(arr,target,true);
        ans[1] = findIndex(arr,target,false);
        return ans;
    }
    static int findIndex(int[] nums, int target,  boolean isleftArray){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                ans = mid;
                if (isleftArray){
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            }
            if(nums[mid] > target){
                end = mid-1;
            }
            if(nums[mid] < target){
                start = mid+1;
            }
        }
        return ans;
    }
}
