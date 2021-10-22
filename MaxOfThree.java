import java.util.Scanner;
class MaxOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = a;
        if (b>a){
            max = b;
        }
        else{
            max = c;
        }
        System.out.println("Maximum number of " + a +"," + b +"," + c + " is " + max);
    }
}