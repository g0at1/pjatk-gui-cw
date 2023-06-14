package wyklady.w13.ex01;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.stage.Stage;

public
    class Main
    extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        ObservableList<Integer> items = FXCollections.observableArrayList(
            10, 20, 50, 80, 100
        );

        items.addListener(
            (ListChangeListener<? super Integer>) e -> System.out.println(e)
        );

        System.out.println(items);

        items.add(120);

        System.out.println(items);
    }
}
