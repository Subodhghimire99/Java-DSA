package PracticeQuestions;
import java.util.ArrayList;
import java.util.Scanner;

public class MatrixDigitsSum {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> myArr = createArrayList();
        System.out.println(findAndSolve(myArr, 5));
    }
     static int digitSum(int n){
        int sum = 0;
        while(n>0){
            sum = sum + n%10;
            n = n/10;
        }
         return sum;
     }
     static int findAndSolve(ArrayList<ArrayList<Integer>> Arr, int target){
        for(int row=0;row<Arr.size();row++){
            for(int col=0;col<Arr.get(row).size();col++){
                int elem = (int) Arr.get(row).get(col);
                if (elem == target){
                    int checkValue = row+1 + col+1;
                    int Ans;
                    if(checkValue%2 == 0){
                        Ans = solveEven(Arr);
                    }
                    else {
                        Ans = solveOdd(Arr);
                    }
                    return Ans;
                }
            }
        }
        return 0;
     }

     static ArrayList<ArrayList<Integer>> createArrayList(){
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList <Integer>> arr = new ArrayList<>();
        System.out.println("Enter Row Numbers");
        int rows = in.nextInt();
        for(int i=0;i<rows;i++){
            arr.add(new ArrayList<Integer>());
        }
        for(int i=0;i<arr.size();i++){
            System.out.println("Enter Column numbers for " + i + " column" );
            int cols = in.nextInt();
            System.out.println("Enter " + cols + " elements separated by space");
            for(int j=0;j<cols;j++){
                arr.get(i).add(in.nextInt());
            }
        }
        return arr;
     }

     static int solveEven(ArrayList<ArrayList<Integer>> Arr){
        int sum = 0;
        for(int i=0;i<Arr.size();i++){
            for(int j=0;j<Arr.get(i).size();j++){
                int elem = Arr.get(i).get(j);
                if (elem%2 == 0){
                    sum = sum + digitSum(elem);
                }
            }
        }
        return sum;
     }
    static int solveOdd(ArrayList<ArrayList<Integer>> Arr){
        int sum = 0;
        for(int i=0;i<Arr.size();i++){
            for(int j=0;j<Arr.get(i).size();j++){
                int elem = Arr.get(i).get(j);
                if (elem%2 != 0){
                    sum = sum + digitSum(elem);
                }
            }
        }
        return sum;
    }
}
