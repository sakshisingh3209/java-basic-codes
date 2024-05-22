import java.util.Scanner;
public class reverse{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String org= sc.next();
        String reverse= " ";
        System.out.println("Original String: "+org);
        for(int i=0;i<org.length();i++){
            reverse= org.charAt(i)+reverse;
        }
        System.out.println("Reversed String: "+reverse);
    }
}