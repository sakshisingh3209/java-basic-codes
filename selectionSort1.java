import java.util.Scanner;
public class selectionSort1{
  public static void  swap(int arr[]){
    int n= arr.length;
    for(int i=0;i<n-1;i++){
        int minIndex=i;
        for(int j=i+1;j<n;j++){
            if(arr[minIndex]>arr[j]){
                minIndex=j;

            }

        }
       int temp= arr[i];
       arr[i]= arr[minIndex];
       arr[minIndex]= temp;
    }
  }

  public static void main(String[]args){
    int arr[]= {5,3,1,8,2,20,11};
    swap(arr);
    for(int num: arr){
        System.out.println(num+" ");
    }
  }
}