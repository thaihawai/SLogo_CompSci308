package model;

import commands.CommandNode;
import commands.Forward;
import javafx.application.Application;
import javafx.stage.Stage;
import view.SLogoView;

/**
 *
 * @author duytrieu
 */
public class Main extends Application{


    @Override
    public void start (Stage stage) {
        SLogoView ui = new SLogoView();
        stage.setTitle("SLogo");
        stage.setScene(ui.sceneInit());
        stage.show();
    }

//<<<<<<< HEAD
//=======
//    @Override
//    public void start(Stage stage){
//        CommandParser test = new CommandParser( "not 0 not 1");
//    }
//>>>>>>> fbccf1b931b19e9ec441db16ad773cd8a36cf03c
//
//    public static void main (String[] args) {
//        launch(args);
//    }
}
