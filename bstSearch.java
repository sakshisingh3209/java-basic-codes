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
public static class binarySearchTree{
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
        else if(key<root.data){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }
    public static void printInRange(Node root, int X, int Y){
        if (root==null){
            return;
        }
if( root.data>=X && root.data<=Y){
    printInRange(root.left,X,Y);
    System.out.print(root.data+" ");
    printInRange(root.right,X,Y);
}   else if(root.data>=Y){
    printInRange(root.left,X,Y);
}else{
    printInRange(root.left,X,Y);
}
    }
    public void traversal(Node root){
            if(root==null){
                return;
            }
            traversal(root.left);
            System.out.print(root.data+" ");
        traversal(root.right) ;   }
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
    tree.traversal(tree.root);
    System.out.println();
        int keySearch= 11;

           
    
      boolean found= tree.search(tree.root,keySearch);
      if(found){
        System.out.println(keySearch+" "+"found");
      }else{
        System.out.println(keySearch+ " "+ "not found");
      }
tree.printInRange(tree.root,5,15);

     }
    }