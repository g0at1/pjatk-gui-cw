package wyklady.w12.ex03;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public
    class Main
    extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();

        Scene scene = new Scene(
            root, 320, 280
        );

        Rectangle back = new Rectangle();
        back.setFill(Color.MAGENTA);

        back.widthProperty().bind(
            scene.widthProperty()
        );
        back.heightProperty().bind(
            scene.heightProperty()
        );

        root.getChildren().add(back);

        stage.setScene(scene);
        stage.show();
    }

}
