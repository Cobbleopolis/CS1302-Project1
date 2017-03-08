/*
  Group Members:
    Logan Thompson
    John Nnamezie
    Robel Adamu
	Noah Weber
*/

package maze;

public enum Direction {
    NORTH, SOUTH, EAST, WEST;

    public void turnRight() {
        switch (direction) {
            case NORTH:
                direction = Direction.EAST;
                break;
            case SOUTH:
                direction = Direction.WEST;
                break;
            case WEST:
                direction = Direction.NORTH;
                break;
            case EAST:
                direction = Direction.SOUTH;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case NORTH:
                direction = Direction.NORTH;
                break;
            case SOUTH:
                direction = Direction.SOUTH;
                break;
            case WEST:
                direction = Direction.WEST;
                break;
            case EAST:
                direction = Direction.EAST;
        }
    }

    //Do we need turnForward and turnBackward functions?

    /*
    public void turnForward() {
        switch (direction) {
            case NORTH:
                direction = Direction.EAST;
                break;
            case SOUTH:
                direction = Direction.WEST;
                break;
            case WEST:
                direction = Direction.NORTH;
                break;
            case EAST:
                direction = Direction.SOUTH;
        }
    }

    public void turnBackward() {
        switch (direction) {
            case NORTH:
                direction = Direction.SOUTH;
                break;
            case SOUTH:
                direction = Direction.NORTH;
                break;
            case WEST:
                direction = Direction.EAST;
                break;
            case EAST:
                direction = Direction.WEST;
        }
    }
    */
}
