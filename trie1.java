import java.util.*;
public class trie1{
    public static class Node{
        Node[]children;
        boolean eow;

        Node(){
            children= new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow= false;
        }
    }
 public static Node root= new Node();
    public static void insert(String words){
        
          Node current=root;
          for(int i=0;i<words.length();i++){
            int idx= words.charAt(i)-'a';
            if(current.children[idx]==null){
                current.children[idx]= new Node();
            }
            if(i==words.length()-1){
                current.children[idx].eow= true;
            }
            current= current.children[idx];
          }
    }
    public static boolean search(String key){
        Node current= root;
        for(int i=0;i<key.length();i++){
            int idx= key.charAt(i)-'a';
            if(current.children[idx]==null){
                return false;
            }
            if(i==key.length()-1 &&  current.children[idx].eow==false){
                return false;
            }
            current= current.children[idx];
        }
        return true;
    }
    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
      String firstPart= key.substring(0,i);
      String secondPart= key.substring(i);
      if(search(firstPart)&& wordBreak(secondPart)){
        return true;
      }
        }
        return false;
    }
    public static void main(String[]args){
        String  []words= {"i","like","samsung","mobile"};
       String key= "ilikesamsung";
        
       for(int i=0;i<words.length;i++){
        insert(words[i]);
       }
       System.out.println(wordBreak(key));

    }
}