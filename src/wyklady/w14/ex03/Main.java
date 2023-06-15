package wyklady.w14.ex03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public
class Main
        extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Pane root = new Pane();

        root.getChildren().addAll(
            new Circle( 150, 80, 70, Color.rgb( 255, 0, 0, 0.3)),
            new Circle( 100,180, 70, Color.hsb( 120, 1.0, 1.0, 0.3)),
            new Circle( 200,180, 70, Color.web("0x0000FF", 0.3))
        );

        Scene scene = new Scene( root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }
}
