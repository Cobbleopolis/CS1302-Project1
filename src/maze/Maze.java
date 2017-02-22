package maze;

/**
 * Created by Tulin Kilinc 1/19/2017.
 * KSU Programming Principles II
 */

public class Maze {

    //TODO remove before final turn in?
    static boolean debugPrint = false;
    private int[][] arrMaze;
    private Direction direction;
    private int r;  // x position of the mouse
    private int c;  //y position of the mouse
    private boolean exitFound = false;


    public Maze(int[][] arrMaze) {
        this.arrMaze = arrMaze;
        r = 0;
        c = this.arrMaze.length - 1;
        direction = Direction.NORTH;
    }

    //Prints out the maze without solution
    public void displayMaze() {
        for (int i = 0; i < arrMaze.length; i++) {
            for (int j = 0; j < arrMaze[i].length; j++) {
                System.out.print(getDispChar(j, i, false, debugPrint) + " ");
            }
            System.out.println();
        }
    }

    //displays the Maze with the path taken
    public void displayPath() {
        for (int i = 0; i < arrMaze.length; i++) {
            for (int j = 0; j < arrMaze[i].length; j++) {
                System.out.print(getDispChar(j, i, true, debugPrint) + " ");
            }
            System.out.println();
        }
    }


    public boolean takeStep() {
        //complete the code here

        return isAnExit();
    }

    private void moveNorth() {
        //complete the code here

    }

    private void moveSouth() {
        //complete the code here

    }

    private void moveEast() {
        //complete the code here

    }

    private void moveWest() {
        //complete the code here

    }


    private boolean isAnExit() {
        //complete the code here
        return exitFound;
    }

    //finds the path without stopping at every step
    public void findExit() {
        //complete the code here

    }

    /**
     * Gets the character to print for the specified x and y coordinates in the array. This a will not include any debug output.
     * @param x            The x location of the location to get the character for.
     * @param y            The y location of the location to get the character for.
     * @param showSolution A boolean determining if the solution for the maze should be shown.
     * @return The appropriate character to print for the specified x and y location
     */
    private String getDispChar(int x, int y, boolean showSolution) {
        return getDispChar(x, y, showSolution, false);
    }

    /**
     * Gets the character to print for the specified x and y coordinates in the array.
     * @param x            The x location of the location to get the character for.
     * @param y            The y location of the location to get the character for.
     * @param showSolution A boolean determining if the solution for the maze should be shown.
     * @param debug        A boolean determining if the debug output should be shown.
     * @return The appropriate character to print for the specified x and y location
     */
    private String getDispChar(int x, int y, boolean showSolution, boolean debug) {
        int mazeVal = this.arrMaze[y][x];
        if (x == r && y == c)
            if (debug)
                switch (direction) {
                    case NORTH:
                        return new StringBuilder().appendCodePoint(0x1F839).toString();
                    case EAST:
                        return new StringBuilder().appendCodePoint(0x1F83A).toString();
                    case WEST:
                        return new StringBuilder().appendCodePoint(0x1F838).toString();
                    case SOUTH:
                        return new StringBuilder().appendCodePoint(0x1F83B).toString();
                    default:
                        return "@";
                }
            else
                return "@";
        else if (mazeVal == 0)
            return "#";
        else if (mazeVal == 1)
            return " ";
        else if (mazeVal == 2)
            return "~";
        else if (mazeVal == 3)
            return (showSolution) ? "*" : " ";
        else
            return "?";
    }
}