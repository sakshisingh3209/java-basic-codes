import java.util.Scanner;
public class bubbleSort1{

    public static void Sort(int arr[]){
       for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
       }
    }
    public static void main(String[]args){
        int arr[]= {5,3,1,8,2,20,11,4};
        Sort(arr);
        for(int num: arr){
            System.out.println(num+" ");
        }
      }
}