//take an array of string from the user and find the combine length of the string.

import java.util.Scanner;
public class strings{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size= sc.nextInt();
        int totalLength=0;
        System.out.println("Enter the strings: ");
        String array[]=new String[size];
        for(int i=0;i<size;i++){
            array[i]= sc.next();
            totalLength+= array[i].length();
        }
        System.out.println(totalLength);
    }
}