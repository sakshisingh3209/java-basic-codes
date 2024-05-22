import java.util.Stack;
public class PrefixToPostfix{
    public static void main(String[]args){
        Stack<String> val= new Stack<>();
        String prefix= "-9/*+5346";
        for(int i=prefix.length()-1;i>=0;i--){
            char ch= prefix.charAt(i);
            int ascii= (int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ch+"");

            }else{
                String v1= val.pop();
                String v2= val.pop();
                String t= v1+v2+ch;
                val.push(t);
            }
        }
        System.out.println("Postfix expression is: "+ val.peek());
    }
}