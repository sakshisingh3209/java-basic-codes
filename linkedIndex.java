import java.util.Scanner;
public class linkedIndex{
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
int size=0;
void insertAtBeginning(int data){
          Node current= new Node(data);
          if(head==null){
            head=current;  //or we can write head=tail=current;
            tail=current;
          } else{
            current.next=head;
            head=current;
          }
          size++;
    }
    void insertAtIndex(int idx, int data){
        Node t= new Node(data);
        Node current= head;
        if(idx==0){
            insertAtBeginning( data);
            return;
        }
        else if(idx>size||idx<0) {
            System.out.println("out of bound");
        }
        
        for(int i=0;i<idx-1;i++){
            current=current.next;
        }
        t.next=current.next;
        current.next=t;
        size++;
    }
    //delete the element at specified postion
          void deleteAtIndex(int idx){
            Node current=head;
            
            for(int i=0;i<idx-1;i++){
                current=current.next;
            }
            current.next=current.next.next;
            tail=current;
            size--;
          }

     void display(){
    Node current=head;
    while(current!=null){
        System.out.print(current.data+"->");
        current=current.next;
    }
    System.out.println("null");
        }
        //to find the index of an element
        int getAt(int idx){
            Node current=head;
          for(int i=0;i<idx;i++){
            current=current.next;
          }
          return current.data;
        }

}
 public static void main(String[]args){
    linkedList ll= new linkedList();
    ll.insertAtBeginning(10);
    ll.insertAtBeginning(20);
    ll.insertAtBeginning(30);
    ll.insertAtBeginning(40);
    ll.insertAtBeginning(60);
    ll.insertAtIndex(4,50);
    ll.insertAtIndex(6,70);
   ll.insertAtIndex(0,5);
 ll.display();
    System.out.println(ll.size);
    System.out.println(ll.getAt(5));
   ll.deleteAtIndex(7);
   System.out.println(ll.size);
}
}