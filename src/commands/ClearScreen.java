package commands;

import model.Turtle;
import model.VariableMap;

import java.util.List;

/**
 * A specific class for ClearScreen.
 * @author Allen Qiu
 */
public class ClearScreen extends CommandNode {
    public int numParameters = 0;

    @Override
    public double run(List<String> parameters, Turtle turtle, VariableMap varMap, CommandInitializer commands){
        double oldX = turtle.getX();
        double oldY = turtle.getY();
        turtle.moveTo(0, 0);
        turtle.clearLines();
        turtle.setOrientation(90);
        return Math.sqrt(Math.pow((oldY), 2)+Math.pow(oldX, 2));
    }

    public int getNumParameters(){
        return numParameters;
    }

}
