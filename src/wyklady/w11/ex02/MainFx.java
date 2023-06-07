package wyklady.w11.ex02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public
    class MainFx
    extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        HBox root = new HBox();

        Rectangle rectangle = new Rectangle( 70, 70, Color.PALEVIOLETRED);
        CheckBox checkBox = new CheckBox("text to check");

        root.getChildren().add(rectangle);
        root.getChildren().add(checkBox);

        Scene scene = new Scene(
            root, 640, 480
        );

        stage.setScene(scene);
        stage.show();
    }

}
