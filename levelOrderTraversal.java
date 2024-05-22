import java.util.*;
public class levelOrderTraversal{
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data= data;
            this.left= null;
            this.right=right;

        }
    }
         public static class binaryTree{
            Node root;

            binaryTree(){
                root=null;
            }

            public void levelOrder(Node root){
                Queue<Node>q= new LinkedList<>();
                q.add(root);
                q.add(null);
              while(!q.isEmpty()){
                Node current= q.remove();
                if(current==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(current.data+" ");
                    if(current.left!=null){
                        q.add(current.left);
                    }
                    if(current.right!=null){
                        q.add(current.right);
                    }
                }
              }
            }
         }
         public static void main(String[]args){
            binaryTree l= new binaryTree();
            l.root= new Node(1);
            l.root.left= new Node(2);
            l.root.right= new Node(3);
            l.root.left.left= new Node(4);
            l.root.left.right= new Node(5);
            l.root.right.right= new Node(6);
            l.levelOrder(l.root);
         }
}