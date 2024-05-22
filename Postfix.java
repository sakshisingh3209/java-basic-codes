import java.util.Stack;
public class Postfix{
    public static void main(String[]args){
        Stack<Integer>val= new Stack<>();
String postfix= "953+4*6/-";
        
        for(int i=0;i<postfix.length();i++){
            char ch= postfix.charAt(i);
            int ascii= (int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }
            else {
                if(ch=='+'){
                    int v2= val.pop();
                    int v1= val.pop();
                    val.push(v1+v2);
                } else if(ch=='-'){
                    int v2= val.pop();
                    int v1= val.pop();
                    val.push(v1-v2);
                }else if(ch=='*'){
                    int v2= val.pop();
                    int v1= val.pop();
                    val.push(v1*v2);
                }else{
                    int v2= val.pop();
                    int v1= val.pop();
                    val.push(v1/v2);
                }
            }
        }
System.out.println("Answer is: "+val.peek());
    }
}