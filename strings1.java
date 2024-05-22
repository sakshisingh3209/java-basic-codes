//Input a string from the user. Create a new string called result in which you will replace the letter 'e'
//in the original string with letter i. for ex= original= eabcef, letter= iabcif.

import java.util.Scanner;
public class strings1{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the original string: ");
        String original= sc.next();
        String result= "";
        System.out.println("The new string is: ");
        for(int i=0;i<original.length();i++){
            if(original.charAt(i)=='e'){
                result+= 'i';
            }else{
                result+= original.charAt(i);
            }
        }
        System.out.println(result);
    }
}