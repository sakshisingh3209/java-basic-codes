import java.util.Stack;
public class Prefix{
    public static void main(String[]args){
        Stack<Integer>val= new Stack<>();
String prefix= "-9/*+5346";
        
        for(int i=prefix.length()-1;i>=0;i--){
            char ch= prefix.charAt(i);
            int ascii= (int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }
            else {
                if(ch=='+'){
                    int v1= val.pop();
                    int v2= val.pop();
                    val.push(v1+v2);
                } else if(ch=='-'){
                    int v1= val.pop();
                    int v2= val.pop();
                    val.push(v1-v2);
                }else if(ch=='*'){
                    int v1= val.pop();
                    int v2= val.pop();
                    val.push(v1*v2);
                }else{
                    int v1= val.pop();
                    int v2= val.pop();
                    val.push(v1/v2);
                }
            }
        }
System.out.println("Answer is: "+val.peek());
    }
}