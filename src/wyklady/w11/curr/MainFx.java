package wyklady.w11.curr;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public
    class MainFx
    extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane root = new BorderPane();

        Text textComp = new Text("top");
        root.setTop(textComp);
        BorderPane.setAlignment( textComp, Pos.CENTER);

        root.setBottom(new Text("bottom"));
        root.setLeft(new Text("left"));
        root.setRight(new Text("right"));

        //root.setCenter();

        Scene scene = new Scene(
            root, 640, 480
        );

        stage.setScene(scene);
        stage.show();
    }

}
