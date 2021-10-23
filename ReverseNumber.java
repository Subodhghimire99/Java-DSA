import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to reverse :  ");
        int num = in.nextInt();
        int reversedNum = 0;
        while(num != 0){
            reversedNum = reversedNum * 10 + (num%10);
            num = num/10;
        }
        System.out.println("Reversed number : " + reversedNum);
    }
}
