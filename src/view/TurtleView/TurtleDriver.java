package view.TurtleView;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import model.Turtle;

/**
 * TurtleDriver
 *
 * @author brookekeene
 */
public class TurtleDriver {
    public static final String DEFAULT_IMAGE = "turtle.png";
    public static final String IMAGE_PATH = "slogo_team08/resources/images/";
    private ImageView myImage;
    private Turtle myTurtle;
    private int turtleID; // when multiple turtles arise
    public static double initX = 250;
    public static double initY = 275;
    private double xPos;
    private double yPos;
    private double orientation;


    /**
     * Constructor
     */

    public TurtleDriver() {
        myTurtle = new Turtle(initX, initY, Color.BLACK);
        Image image = new Image(getClass().getClassLoader().getResourceAsStream(DEFAULT_IMAGE));
        myImage = new ImageView(image);
        myImage.setFitWidth(100);
        myImage.setFitHeight(100);
        xPos = myTurtle.getX();
        yPos = myTurtle.getY();
        orientation = myTurtle.getOrientation();
    }

    /**
     *
     * @return the ImageView of the turtle
     */
    public ImageView getTurtleImage() {
        return myImage;
    }

    /**
     * changes the ImageView associated with the turtle
     * @param im
     */
    public void setTurtleImage(Image im) {
        myImage = new ImageView(im);
    }

    /**
     *
     * @return x-coordinate of the turtle ImageView
     */
    public double getX() {
        return xPos;
    }

    /**
     *
     * @return y-coordinate of the turtle ImageView
     */

    public double getY() {
        return yPos;
    }

    /**
     * changes the x-coordinate of the turtle ImageView
     * @param newX
     */

    public void updateX(double newX) {
        xPos = newX;
    }

    /**
     * changes the y-coordinate of the turtle ImageView
     * @param newY
     */

    public void updateY(double newY) {
        yPos = newY;
    }
}
