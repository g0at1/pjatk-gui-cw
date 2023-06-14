package wyklady.w13.ex06;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.ChoiceBoxListCell;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public
    class Main
    extends Application {

    ObservableList<String> items;
    ListView<String> listView;

    @Override
    public void start(Stage stage) throws Exception {
        items = FXCollections.observableArrayList(
            "Red", "Green", "Blue"
        );

        listView = new ListView<>(items);
//        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        listView.getSelectionModel().selectedIndexProperty().addListener(
            e -> System.out.println(
                "Selected: " + listView.getSelectionModel().getSelectedItems()
            )
        );

        ObservableList<String> itemsSelect = FXCollections.observableArrayList(
            "Red", "Green", "Gold", "Orange", "Purple", "Yellow"
        );

        listView.setEditable(true);
        listView.setCellFactory(
            ChoiceBoxListCell.forListView(itemsSelect)
        );

        BorderPane root = new BorderPane();

        root.setCenter(listView);

        Scene scene = new Scene( root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }
}
