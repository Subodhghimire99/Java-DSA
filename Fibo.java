import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int a = 0;
        int b = 1;
        int c;
        for(int i=0; i<count; i++){
            System.out.print(a + ", ");
            c = a+b;
            a=b;
            b=c;
        }
    }
}
