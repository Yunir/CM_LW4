package model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        RungeKuttaMethod rkm = new RungeKuttaMethod(0, 1, 0.1, 1);
        MilneMethod mm = new MilneMethod(rkm.getValues(), 0.1);
        Parent root = FXMLLoader.load(getClass().getResource("../view/interface.fxml"));
        primaryStage.setTitle("Computational Mathematics - Fourth Laboratory Work");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
