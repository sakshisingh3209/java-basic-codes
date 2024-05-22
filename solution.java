import java.util.Scanner;
public class solution{
    public static int infinite(){
        do{
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int pos=0;
            int neg=0;
            int zero=0;
            if(x>0){
                pos++;
            }else if(x<0){
                neg++;
            }else{
                zero++;
            }
            System.out.println("Enter Y for yes and N for no: ");
            char ch=sc.nextInt();
        }while(ch!='N');
    }
    public static void main(String[]args){
        system.out.println(infinite);    
    }
}