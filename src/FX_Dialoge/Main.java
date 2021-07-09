package FX_Dialoge;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.awt.*;
import java.util.Optional;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        final Optional<ButtonType> result = showConfirmdialog();
        if(result.isPresent() && result.get() ==ButtonType.OK){
            final Optional<String>  inputText = showTextInputDialog();
            System.out.println(inputText);
            final Optional<String> selection = showActionSelection();
        }

    }

    private Optional<String> showActionSelection() {
        final ChoiceDialog<String> dialog = new ChoiceDialog<>("hoch", "mittel", "gering");
        dialog.setTitle("Wichtigkeit der Aufgabe");
        dialog.setHeaderText("");
        dialog.setContentText("Die aufgabe hat die  Prioritaet: ");
        dialog.setGraphic(null);

        return dialog.showAndWait();

    }

    private Optional<String> showTextInputDialog() {
        final TextInputDialog textDialog= new TextInputDialog("Wie ist Ihr name? ");
        textDialog.setTitle("wichtige Info... ");
        textDialog.setHeaderText("Dies ist ein Textdialog ");
        textDialog.setContentText("Bitte geben Sie Ihren Namen ein! ");
        textDialog.setGraphic( new ImageView());;

        return textDialog.showAndWait();
    }

    private Optional<ButtonType> showConfirmdialog() {
        return new Alert(Alert.AlertType.NONE, "Wollen wir Pause? ").showAndWait();
    }


    public static void main(String[] args) {

        launch(args);
    }
}
