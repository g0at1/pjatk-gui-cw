package wyklady.w11.ex03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public
    class MainFx
    extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        StackPane root = new StackPane();

        Rectangle rectangle1 = new Rectangle( 30, 30, Color.LIGHTSEAGREEN);
        Rectangle rectangle2 = new Rectangle( 70, 70, Color.TOMATO);
        Rectangle rectangle3 = new Rectangle( 90, 90, Color.AQUAMARINE);

        root.getChildren().addAll(rectangle1, rectangle2, rectangle3);

        rectangle3.toBack();
        rectangle1.toFront();

        Scene scene = new Scene(
            root, 640, 480
        );

        stage.setScene(scene);
        stage.show();
    }

}
