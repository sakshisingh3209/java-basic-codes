//count total no of words in a string.

import java.util.Scanner;
public class strings7{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input= sc.nextLine();
        int words= countWord(input);
        System.out.println("Total no of words in a string is:"+words);
    }
    public static int countWord(String input){
        if(input==null||input.isEmpty()){
            return 0;
        }
        String[] word= input.trim().split("\\s+");
        return word.length;
    }
}