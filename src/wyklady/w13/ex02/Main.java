package wyklady.w13.ex02;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public
    class Main
    extends Application {

    ListView<Integer> listView;

    @Override
    public void start(Stage stage) throws Exception {
        ObservableList<Integer> items = FXCollections.observableArrayList(
            10, 20, 50, 80, 100
        );

        listView = new ListView<>(items);

        VBox root = new VBox(listView);
        Scene scene = new Scene( root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }
}
