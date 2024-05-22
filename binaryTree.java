import java.util.*;

public class binaryTree{

      public static class Node{
        int data;
        Node left;
        Node right;
          Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
          }
      }
         public static class buildTree{
            Node root;
            
            public buildTree(){
                root=null;
            }

          public void insert(int data){
            Node newNode= new Node(data);
            if(root==null){
                root= newNode;
                return;
            }
            Node current= root;;
            while(true){
            if(data<current.data){
                if(current.left==null){
                    current.left=newNode;
                    return;
                }
                current= current.left;
            }    
            else if(data>current.data){
                if(current.right==null){
                     current.right=newNode;
                     return;
                }
                current=current.right;
            }
            else{
                System.out.println("Data already exist");
                return;
            }
            
          }

         
        }          
    public static void main(String[]args){
        buildTree tree= new buildTree();
        tree.insert(12);
        tree.insert(15);
        tree.insert(19);
        tree.insert(8);
        tree.insert(7);
        tree.insert(3);
        tree.insert(5);
        tree.insert(11);
        tree.insert(14);
        System.out.println("Root node is: "+tree.root.data);
        
 
    }
       }
}
