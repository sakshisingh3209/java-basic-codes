import java.util.Scanner;
public class power{
    public static int solution(int x, int n){
        int product=1;
        for(int i=1;i<=n;i++){
            product=product*x;
        }
        System.out.println("Product of the number is: "+ product);
        return 0;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x= sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        solution(x,n);
    }
}