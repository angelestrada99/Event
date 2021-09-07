package sample;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
 //PRIMER CASO (MISMA ALCASE)
public class Main extends Application implements EventHandler {
    Button btnEntrar;

    @Override
    public void start(Stage primaryStage) throws Exception{
        btnEntrar = new Button("Presiona");
        btnEntrar.addEventHandler(MouseEvent.MOUSE_CLICKED, this);

        Scene scene = new Scene(btnEntrar,200, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("MENU PRINCIPAL");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(Event event) {
        System.out.println("HOLA ESTE ES MI PRIMER EVENTO");
    }
}
