package PracticeQuestions;

//https://leetcode.com/problems/find-peak-element/
public class PeakElement {
    public static void main(String[] args) {
        int[] nums = {-1,1,2,4,5,-3,-4,-7};
        if(nums.length != 0){
            System.out.println(findPeak(nums));
        }
    }
    static int findPeak(int[] nums){
        int start = 0;
        int end = nums.length-1;
        int mid = -1;
        while(start<end){
            mid = (start+end)/2;
            if(nums[mid] > nums[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }
}
