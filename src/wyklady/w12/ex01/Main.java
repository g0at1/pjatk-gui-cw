package wyklady.w12.ex01;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public
    class Main
    extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();

        Text text = new Text("text");
        Label label = new Label("label");

        Button button = new Button("click me");
        button.setOnAction(
            e -> System.out.println("button clicked")
        );

        RadioButton radioButton1 = new RadioButton("opcja1");
        RadioButton radioButton2 = new RadioButton("opcja2");

        ToggleGroup toggleGroup = new ToggleGroup();
        radioButton1.setToggleGroup(toggleGroup);
        radioButton2.setToggleGroup(toggleGroup);

        CheckBox checkBox1 = new CheckBox("opcja1");
        CheckBox checkBox2 = new CheckBox("opcja2");

        ChoiceBox choiceBox = new ChoiceBox();
        choiceBox.getItems().addAll("o1","o2","o3");

        ListView listView = new ListView(
            FXCollections.observableArrayList("v1","v2","v3")
        );

        root.getChildren().addAll(
            text, label,
            button, radioButton1, radioButton2, checkBox1, checkBox2,
            choiceBox, listView
        );

        Scene scene = new Scene(
            root, 320, 280
        );

        stage.setScene(scene);
        stage.show();
    }

}
