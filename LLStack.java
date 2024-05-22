import java.util.Scanner;

public class LLStack{
    

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
        }
    }
    public static class Stack{
        Node head= null;
        private int size=0;

        void push(int x){
            Node current= new Node(x);
            current.next=head;
            head=current;
            size++;
        }

        int peek(){
            if(head==null){
                return -1;
            }
            return head.data;
        }

        int pop(){
            if(head==null){
                return -1;
            }
            int x= head.data;
            head= head.next;
            return x;
        }

        int size(){
            return size;
        }

        void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current= current.next;
        }
        System.out.println();
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