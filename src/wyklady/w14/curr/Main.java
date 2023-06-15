package wyklady.w14.curr;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public
class Main
        extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Pane root = new Pane();

        Circle circle = new Circle(50, 150, 50, Color.RED);

        KeyValue keyValue1 = new KeyValue(
            circle.translateXProperty(), 200, Interpolator.EASE_IN
        );

        KeyValue keyValue2 = new KeyValue(
            circle.translateYProperty(), 200
        );

        KeyFrame keyFrame1 = new KeyFrame(
            Duration.seconds(5), keyValue1
        );

        KeyFrame keyFrame2 = new KeyFrame(
            Duration.seconds(10), keyValue2
        );

        Timeline timeline = new Timeline(
            keyFrame1, keyFrame2
        );

        timeline.play();

        root.getChildren().addAll(circle);

        Scene scene = new Scene( root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }
}
