import java.util.Scanner;
public class circumference{
    public static double circumferenceCircle(double r){
     
         return 2*3.14*r;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r= sc.nextInt();
        System.out.println(circumferenceCircle(r));
    }
}