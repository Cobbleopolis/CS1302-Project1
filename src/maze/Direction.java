package maze;

public enum Direction {
    NORTH, SOUTH, EAST, WEST

    private void turnRight() {
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

    private void turnLeft() {
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

    private void turnForwards() {
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

    private void turnBackwards() {
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
}
