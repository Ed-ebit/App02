package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.StackPane;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ResourceBundle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root =FXMLLoader.load(getClass().getResource("sample.fxml"));
/*        Parent root = FXMLLoader.load(getClass().getResource("Lotto.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));*/
/*        StackPane root = new StackPane();
        var node = new CheckBox("Hi fertig");
        Rectangle rect = new Rectangle(140, 70, Color.RED);


        root.getChildren().addAll(rect, node);*/
        Scene scene = new Scene(root, 150, 100);
        primaryStage.setTitle("Hallo FX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);
    }
}
