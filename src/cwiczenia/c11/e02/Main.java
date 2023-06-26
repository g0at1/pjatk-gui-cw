package cwiczenia.c11.e02;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private ObservableList<String> shoppingList;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        shoppingList = FXCollections.observableArrayList();

        ListView<String> listView = new ListView<>(shoppingList);
        listView.setPrefWidth(200);
        listView.setPrefHeight(200);
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        TextField itemTextField = new TextField();
        itemTextField.setPromptText("Item name");

        Button addButton = new Button("Add");
        addButton.setOnAction(
            e -> addItemToList(itemTextField.getText(), itemTextField)
        );

        Button removeButton = new Button("Delete highlighted");
        removeButton.setOnAction(
            e -> removeSelectedItems(listView)
        );

        VBox root = new VBox(10, listView, itemTextField, addButton, removeButton);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Shopping list");
        primaryStage.show();
    }

    private void addItemToList(String item, TextField itemTextField) {
        if (!item.isEmpty()) {
            shoppingList.add(item);
            itemTextField.clear();
        }
    }

    private void removeSelectedItems(ListView<String> listView) {
        ObservableList<Integer> selectedIndices = listView.getSelectionModel().getSelectedIndices();
        ObservableList<String> itemsToRemove = FXCollections.observableArrayList();

        for (int index : selectedIndices) {
            itemsToRemove.add(shoppingList.get(index));
        }

        shoppingList.removeAll(itemsToRemove);
    }
}
