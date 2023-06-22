package additional.ex1201;

import javafx.application.Application;
import javafx.beans.binding.StringBinding;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public
    class Main
    extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GridPane root = new GridPane();

        Label lWeight = new Label("weight: ");
        Slider sWeight = new Slider();
        TextField tWeight = new TextField();

        root.add( lWeight, 0, 0);
        root.add( sWeight, 1, 0);
        root.add( tWeight, 2, 0);

        tWeight.textProperty().bind( sWeight.valueProperty().asString());

        Label lHeight = new Label("height: ");
        Slider sHeight = new Slider();
        TextField tHeight = new TextField();

        root.add( lHeight, 0, 1);
        root.add( sHeight, 1, 1);
        root.add( tHeight, 2, 1);

        tHeight.textProperty().bind( sHeight.valueProperty().asString());


        TextField tBMI = new TextField();

        root.add(tBMI, 2, 2);

        StringBinding stringBinding = new StringBinding() {
            {
                super.bind(sWeight.valueProperty());
                super.bind(sHeight.valueProperty());
            }


            @Override
            protected String computeValue() {
                return "" + ( (sWeight.getValue() / (sHeight.getValue() * sHeight.getValue())));
            }
        };

        tBMI.textProperty().bind(stringBinding);

        stage.setScene(
            new Scene( root, 640, 480)
        );
        stage.show();
    }

}
