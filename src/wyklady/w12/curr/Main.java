package wyklady.w12.curr;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public
    class Main
    extends Application{

    private final static int MAX_ATTEMPTS = 3;
    private final static BooleanProperty GRANTED_ACCESS = new SimpleBooleanProperty();
    private final IntegerProperty ATTEMPTS = new SimpleIntegerProperty();

    @Override
    public void start(Stage stage) throws Exception {

        User user = new User();

        Group root = new Group();

        Scene scene = new Scene(
            root, 320, 280
        );

        Rectangle back = new Rectangle();
        back.setFill(Color.MAGENTA);

        back.widthProperty().bind(
            scene.widthProperty()
        );
        back.heightProperty().bind(
            scene.heightProperty()
        );

        Label userNameLabel = new Label("username:");
        PasswordField passwordField = new PasswordField();

        userNameLabel.textProperty().bind(
            user.userNameProperty()
        );

        passwordField.textProperty().addListener(
            (osb, ov, nv) ->
                GRANTED_ACCESS.set(
                    user.passwordProperty().getValue().equals(nv)
                )
        );

        passwordField.setOnAction(
            evt -> {
                if(GRANTED_ACCESS.get())
                    back.setFill(Color.GREEN);
                else {
                    ATTEMPTS.set(
                        ATTEMPTS.add(1).get()
                    );
                    back.setFill(Color.RED);
                }
            }
        );

        ATTEMPTS.addListener(
//            new ChangeListener<Number>() {
//                @Override
//                public void changed(
//                    ObservableValue<? extends Number> observableValue,
//                    Number oldValue,
//                    Number newValue
//                ) {
//
//                }
//            }
            (obs, ov, nv) -> {
                if(MAX_ATTEMPTS == nv.intValue())
                    Platform.exit();
            }
        );

        VBox fieldsBox = new VBox( 3, userNameLabel, passwordField);

        root.getChildren().addAll( back, fieldsBox);

        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setAlwaysOnTop(true);
        stage.setScene(scene);
        stage.show();
    }

}
