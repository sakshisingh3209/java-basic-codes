import java.util.Scanner;
public class binary{
    public static int binarySearch(int arr[],int n,int key){
        int s=0;
        int e=n;
        while(s<=e){
            int mid= s+(e-s)/2;
            if(arr[mid]==key){
                return mid;
            } else if(arr[mid]>key){
                e=mid-1;
                
            } else{
                s= mid+1;
            }
        }
        return 0;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
          
            System.out.println("Enter the size: ");
            int n= sc.nextInt();
              int arr[]= new int[n];
            System.out.println("Enter the element: ");
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            System.out.println("Enter the key value: ");
            int key= sc.nextInt();
        System.out.println(binarySearch(arr,n,key));
    }
}