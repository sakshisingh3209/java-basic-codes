import java.util.Scanner;
public class mazePath{
    public static void main(String[]args){
        int rows= 3;
        int columns=3;
        int [][] maze=  {{1,0,1},
                             {1,1,0},
                            {0,1,1}};
        printWays(0,0,rows-1,columns-1,"",maze);
    }

    private static void printWays(int sr, int sc, int er, int ec, String s, int maze[][]){
if(sr<0 || sc<0|| sr>er ||sc>ec ){
    return ;
}
if(sr==er && sc==ec){
    System.out.println(s);
    return;
}       
if(maze[sr][sc]==0){
    return;
}
if(maze[sr][sc]==-1){
    return;
}

maze[sr][sc]=-1;

                 //Go right
                 printWays(sr,sc+1,er,ec,s+"R",maze);

                                  //Go down
                                  printWays(sr+1,sc,er,ec,s+"D", maze);

                 //Go left
                 printWays(sr,sc-1,er,ec,s+"L", maze);

                 //Go up
                 printWays(sr-1,sc,er,ec,s+"U",maze);

                

                maze[sr][sc]=1;

    }
}