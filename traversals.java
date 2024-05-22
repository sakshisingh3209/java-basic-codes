import java.util.*;
public class traversals{
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
    public static class traversal{
        Node root;
        public traversal(){
            root=null;
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
        public void traversal1(Node root){
            //preorder traversal

            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            traversal1(root.left);
            traversal1(root.right);
        }
        public static void traversal2(Node root){
            //inorder traversal

            if(root==null){
                return;
            }
            traversal2(root.left);
            System.out.print("\n"+root.data+" ");
            traversal2(root.right);

        }
        public void traversal3(Node root){
            //post order traversal
            if(root==null){
                return;
            }
            traversal3(root.left);
            traversal3(root.right);
            System.out.print("\n"+root.data+" ");
        }
        
    }
    public static void main(String[]args){
        traversal tree= new traversal();
        tree.insert(12);
        tree.insert(8);
        tree.insert(7);
        tree.insert(15);
        tree.insert(14);
        tree.traversal1(tree.root);
        tree.traversal2(tree.root);
        tree.traversal3(tree.root);
    }
}