package PracticeQuestions;

import java.util.Arrays;

public class SortAndFindIndex {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,2,5,7,234,45,56,76};
        for(int i=0;i<nums.length-1;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
