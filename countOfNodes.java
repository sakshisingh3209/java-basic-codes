import java.util.*;
public class countOfNodes{
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
    public static class binaryTree{
        Node root;

        binaryTree(){
            root= null;
        }
      public  int count(Node root){
   if(root==null){
    return 0;
   }
        int leftNodes=  count(root.left);
        int rightNodes= count(root.right);
        return leftNodes+rightNodes+1;
    }
}
    public static void main(String[]args){
        binaryTree tree= new binaryTree();
        tree.root= new Node(1);
        tree.root.left= new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);

        System.out.println(tree.count(tree.root));
    }
}