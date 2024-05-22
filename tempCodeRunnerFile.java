import java.util.*;
public class bstSearch{
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
public static void binarySearchTree{
    Node root;
    public binarySearchTree(){
        root= null;
    }
    
    public void insert(int data){
        Node newNode= new Node(data);
        if(root==null){
            root= newNode;
            return;
        }
        Node current= root;

        while(true){
            if(data<current.data){
                if(current.left==null){
                    current.left=newNode;

                }
                current=current.left;
            }
            else if(data>current.data){
                if(current.right==null){
                    current.right=newNode;
                }
                current=current.right;
            }else{
                
                return;
            }
        }
    }
    public boolean search(Node root, int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        else if(key>root.data){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }
}
     public static void main(String[]args){
        binarySearchTree tree= new binarySearchTree();
        tree.insert(15);
        tree.insert(8);
        tree.insert(18);
        tree.insert(20);
        tree.insert(7);
        tree.insert(11);
        tree.insert(12);

        int keySearch= 20;
      boolean found= tree.search(root,keySearch);
      if(found){
        System.out.println(keySearch+"found");
      }else{
        System.out.println(keySearch+"not found");
      }
     }
    }