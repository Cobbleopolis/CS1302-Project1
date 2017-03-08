package maze;

/**
 * Created by Tulin Kilinc 1/19/2017.
 * KSU Programming Principles II
 */

public class Maze {

    /**
     * A boolean determining if debug printing should be used when printing the array.
     */
    static boolean debugPrint = false; //TODO remove before final turn in?

    /**
     * The array that stores the representation of the maze.
     */
    private int[][] arrMaze;

    /**
     * The current direction that the mouse if facing.
     */
    private Direction direction;

    /**
     * The x position of the mouse.
     */
    private int xPos;

    /**
     * The y position of the mouse.
     */
    private int yPos;

    /**
     * A boolean representing if the mouse has found the exit.
     */
    private boolean exitFound = false;


    /**
     * Creates a {@link Maze} object with a given array representing the maze.
     * @param arrMaze The array representing the array to initialize with.
     */
    public Maze(int[][] arrMaze) {
        this.arrMaze = arrMaze;
        xPos = 0;
        yPos = this.arrMaze.length - 1;
        direction = Direction.NORTH;
    }


    /**
     * Prints out the maze without solution.
     */
    public void displayMaze() {
        for (int i = 0; i < arrMaze.length; i++) {
            for (int j = 0; j < arrMaze[i].length; j++) {
                System.out.print(getDispChar(j, i, false, debugPrint) + " ");
            }
            System.out.println();
        }
    }


    /**
     * Displays the Maze with the path taken.
     */
    public void displayPath() {
        for (int i = 0; i < arrMaze.length; i++) {
            for (int j = 0; j < arrMaze[i].length; j++) {
                System.out.print(getDispChar(j, i, true, debugPrint) + " ");
            }
            System.out.println();
        }
    }


    /**
     * Iterates one step trough the left-hand method.
     * @return {@code true} if the current location of the mouse is at the exit, {@code false} otherwise.
     */
    public boolean takeStep() {
        //TODO implement

        return isAnExit();
    }

    /**
     * Determines if the mouse can move north based on its current location.
     * @return {@code true} if the mouse can move north, {@code false} otherwise.
     */
    private boolean canMoveNorth() {
        return getValueAt(xPos, yPos - 1) > 0;
    }

    /**
     * Determines if the mouse can move south based on its current location.
     * @return {@code true} if the mouse can move south, {@code false} otherwise.
     */
    private boolean canMoveSouth() {
        return getValueAt(xPos, yPos + 1) > 0;
    }

    /**
     * Determines if the mouse can move east based on its current location.
     * @return {@code true} if the mouse can move east, {@code false} otherwise.
     */
    private boolean canMoveEast() {
        return getValueAt(xPos + 1, yPos) > 0;
    }

    /**
     * Determines if the mouse can move west based on its current location.
     * @return {@code true} if the mouse can move west, {@code false} otherwise.
     */
    private boolean canMoveWest() {
        return getValueAt(xPos - 1, yPos) > 0;
    }

    /**
     * Moves the mouse north if possible. Otherwise the mouse does not move.
     * <p>
     * If the mouse has moved, the previous location of the mouse will be set to {@code 2}.
     */
    private void moveNorth() {
        //TODO implement

    }

    /**
     * Moves the mouse south if possible. Otherwise the mouse does not move.
     * <p>
     * If the mouse has moved, the previous location of the mouse will be set to {@code 2}.
     */
    private void moveSouth() {
        //TODO implement

    }

    /**
     * Moves the mouse east if possible. Otherwise the mouse does not move
     * <p>
     * If the mouse has moved, the previous location of the mouse will be set to {@code 2}.
     */
    private void moveEast() {
        //TODO implement

    }

    /**
     * Moves the mouse west if possible. Otherwise the mouse does not move.
     * <p>
     * If the mouse has moved, the previous location of the mouse will be set to {@code 2}.
     */
    private void moveWest() {
        //TODO implement

    }

    /**
     * Checks if the mouses current location is at the exit. This sets {@link Maze#exitFound} appropriately.
     * @return The current value of {@link Maze#exitFound} after the check.
     */
    private boolean isAnExit() {
        //TODO implement

        return exitFound;
    }

    /**
     * Finds the path without stopping at every step.
     */
    public void findExit() {
        //TODO implement

    }

    /**
     * Determines if the mouse can move forward relative to the direction its facing.
     * @return {@code true} if the mouse can move forward relative to the direction its facing, {@code false} otherwise.
     */
    private boolean canMoveForward() {
        switch (direction) {
            case NORTH:
                return canMoveNorth();
            case SOUTH:
                return canMoveSouth();
            case EAST:
                return canMoveEast();
            case WEST:
                return canMoveWest();
            default:
                return false;
        }
    }

    /**
     * Determines if the mouse can move backwards relative to the direction its facing.
     * @return {@code true} if the mouse can move backwards relative to the direction its facing, {@code false} otherwise.
     */
    private boolean canMoveBackwards() {
        switch (direction) {
            case NORTH:
                return canMoveSouth();
            case SOUTH:
                return canMoveNorth();
            case EAST:
                return canMoveWest();
            case WEST:
                return canMoveEast();
            default:
                return false;
        }
    }

    /**
     * Determines if the mouse can move to the right relative to the direction its facing.
     * @return {@code true} if the mouse can move to the right relative to the direction its facing, {@code false} otherwise.
     */
    private boolean canMoveRight() {
        switch (direction) {
            case NORTH:
                return canMoveEast();
            case SOUTH:
                return canMoveWest();
            case EAST:
                return canMoveSouth();
            case WEST:
                return canMoveNorth();
            default:
                return false;
        }
    }

    /**
     * Determines if the mouse can move to the left relative to the direction its facing.
     * @return {@code true} if the mouse can move to the left relative to the direction its facing, {@code false} otherwise.
     */
    private boolean canMoveLeft() {
        switch (direction) {
            case NORTH:
                return canMoveWest();
            case SOUTH:
                return canMoveEast();
            case EAST:
                return canMoveNorth();
            case WEST:
                return canMoveWest();
            default:
                return false;
        }
    }

    /**
     * Moves the mouse forward if possible. Otherwise the mouse does not move.
     * <p>
     * If the mouse has moved, the previous location of the mouse will be set to {@code 2}.
     */
    private void moveForward() {
        //Finish implementing
        if (canMoveForward()) {
            setValueAt(xPos, yPos, 2);
            yPos =- 1;
        }
    }

    /**
     * Moves the mouse backward if possible. Otherwise the mouse does not move.
     * <p>
     * If the mouse has moved, the previous location of the mouse will be set to {@code 2}.
     */
    private void moveBackward() {
        //Finish implementing
        if (canMoveBackwards()) {
            setValueAt(xPos, yPos, 2);
            yPos =+ 1;
        }
    }

    /**
     * Moves the mouse to the right if possible. Otherwise the mouse does not move.
     * <p>
     * If the mouse has moved, the previous location of the mouse will be set to {@code 2}.
     */
    private void moveRight() {
        //Finish implementing
        if (canMoveRight()) {
            setValueAt(xPos, yPos, 2);
            xPos =+ 1;
        }
    }

    /**
     * Moves the mouse to the left if possible. Otherwise the mouse does not move.
     * <p>
     * If the mouse has moved, the previous location of the mouse will be set to {@code 2}.
     */
    private void moveLeft() {
        //Finish implementing

        if (canMoveLeft()) {
            setValueAt(xPos, yPos, 2);
            xPos =- 1;
        }
    }

    /**
     * Turns the mouse 90° to the right.
     */
    private void turnRight() {
        //TODO implement
        turnRight();
    }

    /**
     * Turns the mouse 90° to the left.
     */
    private void turnLeft() {
        //TODO implement
        turnLeft();
    }

    /**
     * Determines if a a location is within the maze array.
     * @param x The x value of the location.
     * @param y The y value of the location.
     * @return {@code true} if the value is within the maze array, {@code false} otherwise.
     */
    private boolean isWithinBounds(int x, int y) {
        return x >= 0 && y >= 0 && x < arrMaze[0].length && y < arrMaze.length;
    }

    /**
     * Gets the value in the array based on a location.
     * @param x The x value of the location.
     * @param y The y value of the location.
     * @return The value stored in the array at the specified array. Will return -1 if the location provided is not inside the maze array.
     */
    private int getValueAt(int x, int y) {
        return isWithinBounds(x, y) ? arrMaze[y][x] : -1;
    }

    /**
     * Sets the value in the maze array to the provided value.
     * @param x     The x value of the location.
     * @param y     The y value of the location.
     * @param value The new value to be stored in the array.
     */
    private void setValueAt(int x, int y, int value) {
        arrMaze[y][x] = value;
    }

    /**
     * Gets the character to print for the specified x and y coordinates in the array. This a will not include any debug output.
     * @param x        The x location of the location to get the character for.
     * @param y        The y location of the location to get the character for.
     * @param showPath A boolean determining if the solution for the maze should be shown.
     * @return The appropriate character to print for the specified x and y location.
     */
    private String getDispChar(int x, int y, boolean showPath) {
        return getDispChar(x, y, showPath, false);
    }

    /**
     * Gets the character to print for the specified x and y coordinates in the array.
     * @param x        The x location of the location to get the character for.
     * @param y        The y location of the location to get the character for.
     * @param showPath A boolean determining if the solution for the maze should be shown.
     * @param debug    A boolean determining if the debug output should be shown.
     * @return The appropriate character to print for the specified x and y location.
     */
    private String getDispChar(int x, int y, boolean showPath, boolean debug) {
        int mazeVal = getValueAt(x, y);
        if (x == xPos && y == yPos)
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
            return showPath ? "~" : " ";
        else
            return "?";
    }
}