package wyklady.w14.ex01;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public
    class Main
    extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        FlowPane root = new FlowPane();

//        new Thread(
//            ()->{
//                root.getChildren().addAll(
//                        new Text("text")
//                );
//                System.out.println("dodano");
//            }
//        ).start();

        Platform.runLater(
            ()->{
                root.getChildren().addAll(
                        new Text("text")
                );
                System.out.println("dodano");
            }
        );

        Scene scene = new Scene( root, 640, 480);
        stage.setScene(scene);
        stage.show();

//        System.exit(0);
//        Platform.exit();
    }
}
