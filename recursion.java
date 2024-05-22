//write a program to print the x^n(stack height=n)

import java.util.Scanner;
public class recursion{
    public static int calcPower(int x, int n){
        if(x==0){
            return 0;
        } 
        if(n==0){
            return 1;
        }
       int pownm1= calcPower(x,n-1);
       int pow= x*pownm1;
       return pow;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x= sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n= sc.nextInt();
        int ans= calcPower(x,n);
        System.out.println(ans);
    }
}