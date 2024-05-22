import java.util.Scanner;
public class divisor{
    public static int gfg(int a, int b){
        int i;
        if(a>b){
            i=a;
        }else{
            i=b;
        }
        for(int j=i;j>=1;j--){
            if(a%j==0&&b%j==0)
            return j;
        }
        return 0;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a= sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b= sc.nextInt();
        System.out.println("gcd is: " + gfg(a,b));
    }
}