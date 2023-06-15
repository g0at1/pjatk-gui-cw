package wyklady.w14.ex05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public
class Main
        extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        StackPane root = new StackPane();

        Rectangle rect = new Rectangle( 400, 400);

        Stop[] stops = new Stop[]{
            new Stop(0.3, Color.RED),
            new Stop(0.5, Color.GREEN),
            new Stop(1, Color.BLUE),
        };

        LinearGradient lg = new LinearGradient(
            200, 0, 300, 0, false, CycleMethod.REPEAT, stops
        );

        rect.setFill(lg);

        root.getChildren().addAll(rect);

        Scene scene = new Scene( root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }
}
