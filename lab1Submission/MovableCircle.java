/**
 * <h>MovebleCircle.java</h>
 * <p>
 * This is a class that implements the movable interface to create a moveable circle.
 * This class also uses the MovablePoint class to make a center for the circle.
 * This will move the circle by moving the centerpoint while keeping the radius from that point constant.
 * </p>
 * @author UNO Lab
 * @version 1.0
 * @since 09-20-2021
 */


public class MovableCircle implements Movable {
    private final int radius;
    private final MovablePoint center;


    /**
     * This method creates the circle.
     * @param x Integer value of the x coordinate of the center of the circle.
     * @param y Integer value of the y coordinate of the center of the circle.
     * @param radius Integer value of the radius of the circle.
     */
    public MovableCircle(int x, int y, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y);
    }
    /**
     * This method moves the center of the circle up by accessing the moveUp method from the MovablePoint class.
     */
    @Override
    public void moveUp() {
        center.moveUp();
    }
    /**
     * This method moves the center of the circle down by accessing the moveDown method from the MovablePoint class.
     */
    @Override
    public void moveDown() {
        center.moveDown();
    }
    /**
     * This method moves the center of the circle to the left by accessing the moveLeft method from the MovablePoint class.
     */
    @Override
    public void moveLeft() {
        center.moveLeft();
    }
    /**
     * This method moves the center of the circle to the right by accessing the moveRight method from the MovablePoint class.
     */
    @Override
    public void moveRight() {
        center.moveRight();
    }
    /**
     * The toString method converts the object to a string.
     * @return Returns the radius and the center coordinates.
     */
    @Override
    public String toString() {
        return "MovableCircle [radius=" + radius + ", center=" + center + "]";
    }

}
