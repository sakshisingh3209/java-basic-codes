import java.util.Scanner;
public class Function{
    public static int average(int a, int b, int c){
    //   int  average= (a+b+c)/3;
       return (a+b+c)/3; 
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println(average(a,b,c));
    }
}