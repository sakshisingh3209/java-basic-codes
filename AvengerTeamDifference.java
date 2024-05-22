import java.util.*;
public class AvengerTeamDifference{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
int n= sc.nextInt();
int[]powers= new int[n];
  for(int i=0;i<n;i++){
 powers[i]= sc.nextInt();
  }
  Arrays.sort(powers);
  long capPower=0;
  long ironManPower=0;
  for(int i= n-1;i>=0;i-=2){
  capPower+= powers[i];
  }
  for(int i=n-2;i>=0;i-=2){
    ironManPower+= powers[i];
  }
  long difference= capPower - ironManPower;
  System.out.println(difference);
    sc.close();
}
}