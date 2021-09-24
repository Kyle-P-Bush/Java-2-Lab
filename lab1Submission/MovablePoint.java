/**
 * <h>MovablePoint.java</h>
 * <p>
 * This is a class that implements the movable interface
 * to create a moveable point.
 * </p>
 * @author UNO Lab
 * @version 1.0
 * @since 09-20-2021
 */


public class MovablePoint implements Movable {
    int x;
    int y;

    /**
     * This method creates the moveable point.
     * @param x Integer value of the x coordinate.
     * @param y Integer value of the y coordinate.
     */
    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * This method moves the point up by adding 1 to the y coordinate.
     */
    @Override
    public void moveUp() {
        y += 1;
    }
    /**
     * This method moves the point down by subtracting 1 from the y coordinate.
     */
    @Override
    public void moveDown() {
        y -= 1;
    }
    /**
     * This method moves the point to the left by subtracting 1 from the x coordinate.
     */
    @Override
    public void moveLeft() {
        x -= 1;
    }
    /**
     * This method moves the point to the right by adding 1 to the x coordinate.
     */
    @Override
    public void moveRight() {
        x += 1;
    }

    /**
     * @return Returns the printed x and y coordinate.
     */
    @Override
    public String toString() {
        return "MovablePoint [x=" + x + ", y=" + y + "]";
    }
}
