
public class MaximumInArray {
    public static void main(String[] args) {
        int[] arr = {989,234,54,636,7,1001,46,76,89,64,667};
        System.out.println("The maximum number is " + maxOf(arr));
    }
    static int maxOf(int[] arr){
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (max<arr[i]){
                    max = arr[i];
            }
        }
        return max;
    }
}
