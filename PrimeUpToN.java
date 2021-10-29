import java.util.Scanner;

public class PrimeUpToN {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isPrime(int n){
        if (n<=1) {
            return false;
        }
        int c = 2;
        while(c * c <= n){     //checking till square root
            if (n%c == 0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }
}
