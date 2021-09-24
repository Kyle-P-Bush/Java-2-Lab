/**
 * <h>MovablePoint.java</h>
 * <p>
 * This is a class that implements the movable interface.
 * This utilizes MovablePoint to create topLeft and bottomRight 
 * variables as controllable points on the rectangle.
 * This allows the topLeft and bottomRight objects to be moved
 * since they are both points and can be moved with their x and y values. 
 * </p>
 * @author UNO Lab
 * @version 1.0
 * @since 09-20-2021
 */


public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    /**
     * This method creates the topLeft and bottomRight objects and assigns the corresponding x and y parameters to each.
     * @param x1 Integer value of the x coordinate of the topLeft corner of the rectangle.
     * @param y1 Integer value of the y coordinate of the topLeft corner of the rectangle.
     * @param x2 Integer value of the x coordinate of the bottomRight corner of the rectangle.
     * @param y2 Integer value of the y coordinate of the bottomRight corner of the rectangle.
     */
    public MovableRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MovablePoint(x1, y1);
        this.bottomRight = new MovablePoint(x2, y2);
    }
    /**
     * This method moves the points up by accessing the 
     * MovablePoint class and executing the moveUp method.
     */
    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    /**
     * This method moves the points down by accessing the 
     * MovablePoint class and executing the moveDown method.
     */
    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    /**
     * This method moves the points left by accessing the 
     * MovablePoint class and executing the moveLeft method.
     */
    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    /**
     * This method moves the points left by accessing the 
     * MovablePoint class and executing the moveLeft method.
     */
    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
    /**
     * toString method made to convert the object values to strings so they can be printed.
     * @return Returns the top left and bottom right coordinates.
     */
    @Override
    public String toString() {
        return "MovableRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
