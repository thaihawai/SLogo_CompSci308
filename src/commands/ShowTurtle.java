package commands;

import java.util.Scanner;

public class ShowTurtle implements Command {

    @Override
    public void run(Scanner args){
        System.out.println("Show turtle");
    }

}