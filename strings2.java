//input an email from the user. you have to create a username from the email by deleting the rest of the part which comes after @.

import java.util.Scanner;
public class strings2{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the email: ");
        String email= sc.next();
        String username="";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }else{
                username+= email.charAt(i);
            }
        }
        System.out.println(username);
    }
}