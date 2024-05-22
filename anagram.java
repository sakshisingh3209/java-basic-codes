//write a program to check the string is anagram or not

import java.util.Scanner;
import java.util.Arrays;
public class anagram{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1= sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2= sc.nextLine();

        //check the string is anagram or not
        if(anagrams(str1, str2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }

    //create a function anagrams

    public static boolean anagrams(String str1, String str2){
        String s1= str1.replaceAll("\\s","").toLowerCase();
        String s2= str2.replaceAll("\\s","").toLowerCase();

        //check the string is anagram
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] charArray1= s1.toCharArray();
        char[] charArray2= s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        //compare the sorted character Array

        return Arrays.equals(charArray1,charArray2);
    }
}