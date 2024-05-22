import java.util.Scanner;
public class backtrackingMazePath{
    public static void main(String[]args){
        int rows= 3;
        int columns=3;
        boolean [][] isVisited= new boolean[rows][columns];
        printWays(0,0,rows-1,columns-1,"",isVisited);
    }

    private static void printWays(int sr, int sc, int er, int ec, String s, boolean[][] isVisited){
if(sr<0 || sc<0|| sr>er || sc>ec|| isVisited[sr][sc]){
    return ;
}
if(sr==er && sc==ec){
    System.out.println(s);
    return;
}
                    isVisited[sr][sc]= true;
                 //Go right
                 printWays(sr,sc+1,er,ec,s+"R",isVisited);

                                  //Go down
                                  printWays(sr+1,sc,er,ec,s+"D", isVisited);

                 //Go left
                 printWays(sr,sc-1,er,ec,s+"L", isVisited);

                 //Go up
                 printWays(sr-1,sc,er,ec,s+"U",isVisited);

                

                 isVisited[sr][sc]= false;

    }
}