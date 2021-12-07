package PracticeQuestions;


import java.util.Arrays;

//https://leetcode.com/problems/remove-element/
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {2};
        int val = 3;
        if(nums.length==0){
            System.out.println(0);
        }
        else if(nums.length == 1 && nums[0]==val){
            System.out.println(0);
        }
        else{
            System.out.println(solve(nums, val));
        }
    }
    static int solve(int[] nums, int val) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[start] == val) {
                if (nums[start] != nums[end]) {
                    int temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                    start ++;
                }
                end--;
            }
            else{
                start ++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++){
            if(val == nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
