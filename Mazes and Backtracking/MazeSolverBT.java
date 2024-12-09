public class MazeSolverBT {
    public static void main(String[] args){
        boolean[][] board = {
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        mazePathBT("", board, 0, 0);
    }
    public static void mazePathBT(String proc,boolean[][] maze, int row, int colomn){
        if(row == maze.length - 1 && colomn == maze[0].length - 1){
            System.out.println(proc);
            return;
        }
        if(!maze[row][colomn]){
            return;
        }
        // considering that the cell is in path
        maze[row][colomn] = false;
        if(row < maze.length - 1){
            mazePathBT(proc + "D", maze,row + 1, colomn );
        }
        if(colomn < maze[0].length - 1){
            mazePathBT( proc+ "R", maze,row, colomn + 1);
        }
        if(row > 0){
            mazePathBT(proc + "U", maze, row 
            - 1, colomn);
        }
        if(colomn > 0){
            mazePathBT(proc + "L", maze, row, colomn - 1);
        }
        // this is after the function return so therefore we shall mark all the changes false cells as true
        maze[row][colomn] = true;
    }
}
