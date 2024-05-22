import java.util.Stack;
public class PostfixToPrefix{
    public static void main(String[]args){
        Stack<String> val= new Stack<>();
        String postfix=  "953+4*6/-";
        for(int i=0;i<postfix.length();i++){
            char ch= postfix.charAt(i);
            int ascii= (int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ch+"");
            }else{
                String v2=val.pop();
                String v1= val.pop();
                String t= ch+v1+v2;
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}