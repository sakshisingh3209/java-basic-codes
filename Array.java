import java.util.Scanner;
public class array{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size= sc.nextInt();
        int number[]= new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(number[i]>min){
                max= number[i];
            }
            else{
                min=number[i];
            }
        }
        System.out.println("The maximum number is: " + max);
System.out.println("The minimum number is: "+ min);
        

    }
}