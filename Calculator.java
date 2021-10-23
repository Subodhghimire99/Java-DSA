import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        float ans = 0;
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Enter 'x' to exit : ");
            System.out.print("Enter the operator : ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter two numbers : ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/'){
                    ans = (float)num1/num2;
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
                System.out.println("Ans = " + ans);
                System.out.println();

            }
            else if(op=='x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid operator");
                System.out.println();
            }
        }
    }
}
