package PracticeQuestions;

import java.util.ArrayList;


//https://leetcode.com/problems/find-target-indices-after-sorting-array/submissions/
public class TargetIndicesAfterSorting {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3,2,2};
        int target =  2;
        System.out.println(targetIndices(nums,target));

    }
        static ArrayList<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
            for(int i=0;i<nums.length-1;i++){
                for(int j=1;j<nums.length-i;j++){
                    if(nums[j]<nums[j-1]){
                        int temp=nums[j];
                        nums[j] = nums[j-1];
                        nums[j-1] = temp;
                    }
                }
            }
            int ans1[] = {-1,-1};
            ans1[0] = (findIndex(nums, target, true));
            ans1[1] = (findIndex(nums,target,false));
            if(ans1[0] == -1){
                return ans;
            }else if(ans1[0] == ans1[1]){
                ans.add(ans1[0]);
            }
            else{
                for(int i=ans1[0];i<=ans1[1];i++){
                    ans.add(i);
                }
            }
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
