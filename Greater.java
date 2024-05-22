import java.util.Scanner;
public class greater{
    public static int greaterNumber(int a, int b){
        if(a>b){
            System.out.println("a is greater than b");

        }
        else{
            System.out.println("b is greater than a");
        }
        return 1;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a= sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b= sc.nextInt();
        System.out.println(greaterNumber(a,b));
    }
}