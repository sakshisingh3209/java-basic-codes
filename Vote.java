import java.util.Scanner;
 public class Vote{
    public static int eligibility(int age){
        if(age>=18){
            System.out.println("You are eligible for vote.");
        }
        else{
            System.out.println("You are not eligible for vote.");
            
        }
        return age;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age= sc.nextInt();
        System.out.println(eligibility(age));
    }
}