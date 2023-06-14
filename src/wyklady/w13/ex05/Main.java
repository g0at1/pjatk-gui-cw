package wyklady.w13.ex05;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;

import java.util.Random;

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
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        listView.getSelectionModel().selectedIndexProperty().addListener(
            e -> System.out.println(
                "Selected: " + listView.getSelectionModel().getSelectedItems()
            )
        );
        listView.setEditable(true);
        listView.setCellFactory(
            TextFieldListCell.forListView(
                new IntegerStringConverter()
            )
        );

        Button button = new Button("Add");
        button.setOnAction(
            e -> items.add(
                new Random().nextInt()
            )
        );

        BorderPane root = new BorderPane();

        root.setCenter(listView);
        root.setBottom(button);

        Scene scene = new Scene( root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }
}
