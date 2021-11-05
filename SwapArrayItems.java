import java.util.Arrays;

public class SwapArrayItems {
    public static void main(String[] args) {
        int[] arr = {45,34,23,22,12,99,34,4,23};
        System.out.println("Before Swapping\n" + Arrays.toString(arr));
        swap(arr,0,arr.length-1);                 //swaps last and first
        System.out.println("After Swapping\n" + Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
