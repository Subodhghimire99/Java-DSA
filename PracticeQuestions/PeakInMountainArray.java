package PracticeQuestions;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {19,20,33,42,46,48,56,88,99,100,36,35,22,8,0};
        System.out.println(findPeak(arr));
    }
    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = (start + end)/2;
            if(arr[mid]> arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return arr[start];
    }
}
