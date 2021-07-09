package Aufgabenerfassung;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root =FXMLLoader.load(getClass().getResource("Erfassungsformular.fxml"));
/*        Parent root = FXMLLoader.load(getClass().getResource("Lotto.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));*/
/*        StackPane root = new StackPane();
        var node = new CheckBox("Hi fertig");
        Rectangle rect = new Rectangle(140, 70, Color.RED);


        root.getChildren().addAll(rect, node);*/
        Scene scene = new Scene(root);
        primaryStage.setTitle("Aufgabe erfassen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);
    }
}
