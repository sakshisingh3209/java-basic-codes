import java.util.Scanner;
public class LinkedList1{
   static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedList{
        Node head= null;
        Node tail= null;
        void insertAtEnd(int data){
            Node current= new Node(data);
            if(head==null){
                head= current;
            }
            else{
                tail.next= current;
            }
            tail=current;
        }
        void display(){
            Node current= head;
            while(current!=null){
                System.out.print(current.data+"->");
                current=current.next;
            }
            System.out.println("null");
        }
        int length(){
            Node current= head;
            int count=0;
            while(current!=null){
                count++;
                current= current.next;
            }
            return count;
        }
    }
    public static void main(String[]args){
 linkedList ll1= new linkedList();
        ll1.insertAtEnd(5);
        ll1.insertAtEnd(8);
        ll1.insertAtEnd(15);
        ll1.insertAtEnd(20);
        ll1.display();
        System.out.println(ll1.length());
    }
}