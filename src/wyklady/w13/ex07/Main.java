package wyklady.w13.ex07;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
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

//        ObservableList<String> itemsSelect = FXCollections.observableArrayList(
//            "Red", "Green", "Gold", "Orange", "Purple", "Yellow"
//        );
//
//        listView.setEditable(true);
        listView.setCellFactory(
            (ListView<String> par) -> {
                return new ListCell<>(){
                    Rectangle rect = new Rectangle( 30, 30);
                    @Override
                    protected void updateItem(String item, boolean enabled) {
                        if(item == null){
                            setText(null);
                            setGraphic(null);
                        } else {
                            setText(item);
                            rect.setFill(Color.web(item));
                            setGraphic(rect);
                        }
                    }
                };
            }
        );

        BorderPane root = new BorderPane();

        root.setCenter(listView);

        Scene scene = new Scene( root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }
}
