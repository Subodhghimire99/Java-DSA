package PracticeQuestions;

//https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition{
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 0;
        if(nums.length != 0){
            System.out.println(FindPosition(nums, target));
        }else{
            System.out.println(0);
        }
    }
    static int FindPosition(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return end+1;
    }
}
