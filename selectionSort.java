import java.util.Scanner;
public class selectionSort{
    public static  void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();

        }
        //Selection Sort
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[i]){
                    int temp= arr[j];
                    arr[j]= arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("After Sorting the element is: ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
    }
}