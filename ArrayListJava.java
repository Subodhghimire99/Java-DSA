import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListJava {
 public static void main(String[] args ){
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> myList = new ArrayList<>();
     System.out.println("Enter the items for the ArrayList >..");
     for(int i=0;i<6;i++) {
         myList.add(in.nextInt());
     }
     System.out.println("Output of this ArrayList");
     for(int i=0;i<myList.size();i++){
         System.out.print(myList.get(i) + " ");
     }
 }
}

