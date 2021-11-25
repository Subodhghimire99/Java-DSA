package Searching;

public class linearSearchString {
    public static void main(String[] args) {
        String myString = "Hello, This is a laptop";
        char target = 'T';
        System.out.println(linearSearch(myString, target));
    }
    static int linearSearch(String myString, char target){
        if (myString.length() == 0){
            return -1;
        }
        for (int i=0;i<myString.length();i++){
            if (myString.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }
}
