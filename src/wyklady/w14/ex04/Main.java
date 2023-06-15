package wyklady.w14.ex04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public
class Main
        extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        StackPane root = new StackPane();

        root.getChildren().addAll(
            new Circle(
                100,
                new ImagePattern(
                    new Image(
                            "https://upload.wikimedia.org/wikipedia/commons/b/b1/Claude_Monet_-_Twilight%2C_Venice.jpg"
                    )
                )
            )
        );

        Scene scene = new Scene( root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }
}
