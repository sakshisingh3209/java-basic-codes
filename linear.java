import java.util.Scanner;
public class linear{
    public static int linearSearch(int arr[],int n, int key){
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        System.out.println("Enter the key value: ");
        int key= sc.nextInt();
           System.out.println("The key value is: "+ linearSearch(arr,n,key));
        
    }

}