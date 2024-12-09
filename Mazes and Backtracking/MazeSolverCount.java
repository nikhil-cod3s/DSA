public class MazeSolverCount {
    public static void main(String[] args) {
        // System.out.println(count(3, 3));
        // mazePath("", 3,3 );
        boolean[][] board = {
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        mazePathWObst("", board, 0, 0);
        
    }
    public static int count(int row, int colomn){
        if(row == 1 || colomn == 1){
            return 1;
        }
        int rightAns = count(row , colomn - 1);
        int leftAns = count( row - 1, colomn);
        return leftAns + rightAns;
    }
    public static void mazePath(String proc, int row, int colomn){
        if(row == 1 && colomn == 1){
            System.out.println(proc);
            return;
        }
        if(row > 1){
            mazePath(proc + "D", row -1, colomn );
        }
        if(colomn > 1){
            mazePath( proc+ "R", row, colomn - 1 );
        }
    }
    public static void mazePathWObst(String proc,boolean[][] maze, int row, int colomn){
        if(row == maze.length - 1 && colomn == maze[0].length - 1){
            System.out.println(proc);
            return;
        }
        if(!maze[row][colomn]){
            return;
        }
        if(row > maze.length - 1){
            mazePathWObst(proc + "D", maze,row + 1, colomn );
        }
        if(colomn > maze[0].length - 1){
            mazePathWObst( proc+ "R", maze,row, colomn + 1);
        }
    }
}