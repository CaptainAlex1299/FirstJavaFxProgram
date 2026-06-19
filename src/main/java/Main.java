import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        //Label label = new Label("JavaFX is working");

        Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.BLACK);

        Image icon = new Image(getClass().getResourceAsStream("/images/crossIcon.png"));
        stage.getIcons().add(icon);
        stage.setTitle("Decension");
        stage.setScene(scene);
        stage.setHeight(420);
        stage.setWidth(420);
        stage.setFullScreen(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
