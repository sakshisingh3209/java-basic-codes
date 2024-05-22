import java.util.Scanner;
public class fibonacci{
    public static int solution(int n){
        int a=0;
        int b=1;
        int temp =a+b;
        System.out.println(a+" ");
        for(int i=2;i<=n;i++){
            System.out.println(b+" ");
         temp=a+b;
         a=b;
         b=temp;
        }
  return 1;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n: ");
         int n= sc.nextInt();
        System.out.println(solution(n)); 
    }
}