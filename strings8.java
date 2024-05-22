//check weather a given string is palindrome or not

import java.util.Scanner;
public class strings8{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the string: ");
       String input= sc.nextLine();
       if(isPalindrome(input)){
        System.out.println("This is palindrome");
       }else{
        System.out.println("This is not palindrome");
       }
    }
    public static boolean isPalindrome(String str){
        int left=0;
        int right= str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}