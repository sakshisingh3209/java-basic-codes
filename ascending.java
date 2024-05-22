import java.util.Scanner;
public class ascending{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int size= sc.nextInt();
    int number[]= new int[size];

    System.out.println("Enter the elements of the array: ");
    for(int i=0;i<size;i++){
        number[i]=sc.nextInt();
    }
    boolean isAscending= true;
    for(int i=0;i<size;i++){
        if(number[i]>number[i+1]){
            isAscending= false;
        }
        if(isAscending){
            System.out.println("The array is in ascending order.");
        } else{
            System.out.println("The array is not in ascending order.");
        }
    }
}
}