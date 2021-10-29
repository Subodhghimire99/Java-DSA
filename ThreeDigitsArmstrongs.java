public class ThreeDigitsArmstrongs {
    public static void main(String[] args) {
        System.out.print("All three digits armstrong numbers are : ");
        for (int i=100; i<1000; i++) {
            if (isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isArmstrong(int num){
        int original = num;
        int res = 0;
        while(num > 0){
            int lastNum = num%10;
            res = res + (lastNum*lastNum*lastNum);
            num = num/10;
        }
        return (original==res);
    }
}
