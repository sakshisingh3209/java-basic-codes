import java.util.Scanner;
public class insertionSort{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        //Insertion Sort
        for(int i=1;i<size;i++){
            int current= arr[i];
            int j= i-1;
            while(arr[j]>current && j>=0){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]= current;
        }
        System.out.println("After Sorting: ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
    }
}