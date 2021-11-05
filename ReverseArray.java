import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {12,343,54,56,86,456,220,446,334,1};
        System.out.println("\nOriginal array   " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("After reverse   " + Arrays.toString(arr));

    }
    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
        }
    }
}
