//write a program to count the total no of vowels and consonants

import java.util.Scanner;
public class strings5{
    public static boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';

    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input= sc.nextLine().toLowerCase();
       

        int vowel=0;
        int consonant=0;
        for(int i=0;i<input.length();i++){
            char ch= input.charAt(i);
            if(isVowel(ch)){
                vowel++;
            }
            else if(Character.isLetter(ch)){
                consonant++;
            }
        }
        System.out.println("Input String is: "+input);
        System.out.println("Total vowels is: "+vowel);
        System.out.println("Total consonant is: "+consonant);
    }
}
