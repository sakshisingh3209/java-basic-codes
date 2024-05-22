//write a program to find the total no of alphabets digits and character in a string.

import java.util.Scanner;
public class strings4{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String input= sc.nextLine();

        int alphabet=0;
        int digit=0;
        int otherChar=0;
        for(int i=0;i<input.length();i++){
            char ch= input.charAt(i);
            if(Character.isLetter(ch)){
                alphabet++;
            }else if(Character.isDigit(ch)){
                digit++;
            }else{
                otherChar++;
            }
        }
        System.out.println("Input String is: "+input);
        System.out.println("Total no of alphabets is: "+alphabet);
        System.out.println("Total no of digit is: "+digit);
        System.out.println("Total no of other characters is: "+otherChar);
    }

}