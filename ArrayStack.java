import java.util.Scanner;
public class ArrayStack{


    public static class Stack{
        private int[] arr= new int[5];
        private int index=0;

        void push(int x){
            arr[index]=x;
            index++;
        }

        int size(){
            return index;
        }
        

        boolean isEmpty(){
            if(size()==0){
                return true;
            }else{
                return false;
            }
        }


        boolean isFull(){
            if(size()==arr.length){
                return true;
            }else{
                return false;
            }
        }

        int  peek(){
               if(index==0){
                System.out.println("Stack is underflow");
                return -1;
               }else{
                return arr[index-1];
               }
        }

        int pop(){
            if(index==0){
                System.out.println("Stack is underflow");
                return -1;
            }else{
                int top= arr[index-1];
                arr[index-1]=0;
                index--;
                return top;

            }
        }
        void display(){
            for(int i=0;i<index-1;i++){
                System.out.print(arr[i]+" ");
            }
        }

        int capacity(){
            return arr.length;
        }
    }
    public static void main(String[]args){
        Stack st= new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        
  
          st.display();
    System.out.println(st.size());     
  
          st.pop();
          st.display();
  
          System.out.println(st.size());    
    }
}