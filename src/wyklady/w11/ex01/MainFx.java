package wyklady.w11.ex01;

import javafx.application.Application;
import javafx.stage.Stage;

public
    class MainFx
    extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("init");
        super.init();
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("start()");
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop");
        super.stop();
    }
}
