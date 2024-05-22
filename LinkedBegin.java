import java.util.Scanner;
public class LinkedBegin{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            
        }
    }
    public static class linkedList{
Node head= null;
Node tail=null;
void insertAtBeginning(int data){
          Node current= new Node(data);
          if(head==null){
            head=current;  //or we can write head=tail=current;
            tail=current;
          } else{
            current.next=head;
            head=current;
          }
    }
     void display(){
    Node current=head;
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
            current=current.next;
        }
        return count;
    }
}
 public static void main(String[]args){
    linkedList ll= new linkedList();
    ll.insertAtBeginning(10);
    ll.insertAtBeginning(20);
    ll.insertAtBeginning(30);
    ll.insertAtBeginning(40);
    ll.insertAtBeginning(60);
    ll.display();
    System.out.println(ll.length());
}
}