package commands;

import model.Turtle;

import java.util.List;

public class Random extends CommandNode {
    public int numParameters = 1;

    @Override
    public double run(List<String> parameters, Turtle turtle){
        double max = Double.parseDouble(parameters.get(0));
        return Math.random()*max;
    }

    public int getNumParameters(){
        return numParameters;
    }

}
