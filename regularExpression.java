import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class regularExpression{
    public static void main(String[]args){
        Pattern pattern= Pattern.compile("Java");
        Matcher matcher= pattern.matcher("visit Java");
        boolean matchFound= matcher.find();
        if(matchFound){
            System.out.println("Match is found");
        }else{
            System.out.println("Match is not found");
        }
    }
}