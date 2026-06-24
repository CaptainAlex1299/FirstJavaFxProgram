import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Label label = new Label("JavaFX is working");

        Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.BLACK);
        Stage stage = new Stage();

        Text text = new Text();
        text.setText("Hello World!");
        text.setY(50);
        text.setX(50);
        text.setFont(Font.font("Arial", FontWeight.BOLD, 50));
        text.setFill(Color.GREEN);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.GREEN);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(220);
        rectangle.setHeight(220);
        rectangle.setFill(Color.GREEN);

        Circle circle = new Circle();
        circle.setCenterX(50);
        circle.setCenterY(50);
        circle.setRadius(10);
        circle.setFill(Color.GREEN);

        Image icon = new Image("/images/crossIcon.png");
        stage.getIcons().add(icon);
        stage.setTitle("Decension");
        stage.setScene(scene);
        stage.setHeight(420);
        stage.setWidth(420);
        stage.setFullScreen(false);

        scene.setOnKeyPressed(event -> {

            switch (event.getCode()) {
                case W:
                    circle.setCenterY(circle.getCenterY() - 10);
                    break;

                case S:
                    circle.setCenterY(circle.getCenterY() + 10);
                    break;

                case A:
                    circle.setCenterX(circle.getCenterX() - 10);
                    break;

                case D:
                    circle.setCenterX(circle.getCenterX() + 10);
                    break;
            }

        });

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(circle);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
