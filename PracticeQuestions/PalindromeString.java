package PracticeQuestions;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(checkPalindrome(in.next()));
    }
    static String checkPalindrome(String original){
        int start = 0;
        int end = original.length()-1;
        while(start<end){
            if(original.charAt(start) == original.charAt(end)){
                start ++;
                end --;
            }
            else{
                return "Not palindrome";
            }
        }
        return "Palindrome";
    }
}
