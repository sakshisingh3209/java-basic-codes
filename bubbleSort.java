import java.util.Scanner;
public class bubbleSort{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
            System.out.println("Enter the size of the array: ");
            int size= sc.nextInt();
            int arr[]= new int[size];
            System.out.println("Enter the elements of the array: ");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();

            }
            int counter=1;
            while(counter<size){
                for(int i=0;i<size-counter;i++){
                    if(arr[i]>arr[i+1]){
                        int temp=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                    }
                }
                counter++;
            }
        System.out.println("After Sorting: ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
    }
}