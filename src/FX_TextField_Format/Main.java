package FX_TextField_Format;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.IntegerStringConverter;
import javafx.util.converter.LocalDateStringConverter;

import java.time.LocalDate;
import java.time.chrono.Chronology;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        final StringConverter<LocalDate> dateToString = createLocalDateConverter();
        final TextField dateTimeText = createDateFormattedTextfield(dateToString);
        final StringConverter<Integer> IntToString = createLocalIntegerConverter();
        //final TextField integerText = createIntegerFormattedTextfield();

        dateTimeText.setPromptText("Datum als DD.MM.YYYY eingeben.");
       // integerText.setPromptText("Bitte nur ganze Zahlen");

        VBox root = new VBox(30);
        root.setPadding(new Insets(50));
       // root.getChildren().addAll( dateTimeText, integerText);

/*        Parent root = FXMLLoader.load(getClass().getResource("Lotto.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));*/
/*        StackPane root = new StackPane();
        var node = new CheckBox("Hi fertig");
        Rectangle rect = new Rectangle(140, 70, Color.RED);


        root.getChildren().addAll(rect, node);*/
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("Textformatierung");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private StringConverter<Integer> createLocalIntegerConverter() {
        return null;
    }


    private StringConverter<LocalDate> createLocalDateConverter() {
        return new LocalDateStringConverter(FormatStyle.MEDIUM, Locale.GERMANY, Chronology.ofLocale(Locale.GERMANY));
    }

    private TextField createIntegerFormattedTextfield(StringConverter<LocalDate> converter) {
        TextField textField = new TextField();
                textField.setOnAction(event ->checkValidation(textField,converter));

       return textField;
    }

    private void checkValidation(TextField txtField, StringConverter<LocalDate> converter) {
        try{
            converter.fromString(txtField.getText());
        } catch(final RuntimeException ex){
            System.out.println("Fehler");
        }
        System.out.println("Checke... ;)");
    }

    private TextField createDateFormattedTextfield(StringConverter<LocalDate> dateToString) {
        TextField txtField = new TextField();
        txtField.setTextFormatter(new TextFormatter<>(dateToString));
        txtField.setOnAction(event -> checkValidation(txtField, dateToString));
        return new TextField();
    }


    public static void main(String[] args) {

        launch(args);
    }
}
