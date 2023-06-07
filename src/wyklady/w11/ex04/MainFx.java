package wyklady.w11.ex04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public
    class MainFx
    extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FlowPane root = new FlowPane();

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                double size = 5 + (30 * Math.random());
                Rectangle rectangle = new Rectangle(
                    size, size, (i+j)%2 == 0 ? Color.ORANGE : Color.DARKCYAN
                );
                root.getChildren().add(rectangle);
            }
        }

        Scene scene = new Scene(
            root, 640, 480
        );

        stage.setScene(scene);
        stage.show();
    }

}
