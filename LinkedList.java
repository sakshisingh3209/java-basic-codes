import java.util.Scanner;
class LinkedList{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=next;
        }
    }
    //using function
    public static void printLinkedList(Node startNode){
        Node current= startNode;
        while(current!=null){
            System.out.print(current.data+"->");
            current= current.next;
        }
        System.out.println("Null");
    }
    //using recursion
    public static void printReverse(Node startNode){
        if(startNode==null){
            return;
        }
        printReverse(startNode.next);
        System.out.print(startNode.data+"->");
        
    }
    //length of the linked list
    public static int length(Node startNode){
           int count=0;
           while(startNode!=null){
                count++;
                startNode=startNode.next;
           }
           return count;
    }
    public static void main(String[]args){
        Node a= new Node(5);
        Node b= new Node(8);
        Node c= new Node(11);
        Node d= new Node(15);
       
        a.next=b;
        b.next=c;
        c.next=d;
        printLinkedList(a);
        printReverse(a);
        System.out.println("length of the linked list is: "+length(a));
    }

}