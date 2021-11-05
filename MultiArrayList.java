import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        ArrayList <ArrayList<Integer>> myList  = new ArrayList<>();
        for(int i=0;i<3;i++){
            myList.add(new ArrayList<>());
        }
       for (int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               myList.get(i).add(in.nextInt());
           }
       }
       for(ArrayList a:myList){
           System.out.println(a);
       }

       //we also can print whole arraylist
        System.out.println(myList);
    }
}
