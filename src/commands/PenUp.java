package commands;

import java.util.Scanner;

public class PenUp implements Command {

    @Override
    public void run(Scanner args){
        System.out.println("Pen up");
    }

}