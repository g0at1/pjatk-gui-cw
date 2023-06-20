package cwiczenia.c11.e01;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label weightLabel = new Label("Waga (kg):");
        Slider weightSlider = new Slider(0, 200, 0);
        weightSlider.setShowTickLabels(true);
        weightSlider.setShowTickMarks(true);
        weightSlider.setMajorTickUnit(50);
        weightSlider.setBlockIncrement(1);

        Label heightLabel = new Label("Wzrost (m):");
        Slider heightSlider = new Slider(0, 3, 0);
        heightSlider.setShowTickLabels(true);
        heightSlider.setShowTickMarks(true);
        heightSlider.setMajorTickUnit(1);
        heightSlider.setBlockIncrement(0.01);

        TextField bmiTextField = new TextField();
        bmiTextField.setEditable(false);

        bmiTextField.textProperty().bind(
            Bindings.format("%.2f",
                weightSlider.valueProperty().divide(
                    heightSlider.valueProperty().multiply(
                        heightSlider.valueProperty())))
        );


        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        gridPane.add(weightLabel, 0, 0);
        gridPane.add(weightSlider, 1, 0);
        gridPane.add(heightLabel, 0, 1);
        gridPane.add(heightSlider, 1, 1);
        gridPane.add(new Label("BMI:"), 0, 2);
        gridPane.add(bmiTextField, 1, 2);


        Scene scene = new Scene(gridPane, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Kalkulator BMI");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
