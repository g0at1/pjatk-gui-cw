package wyklady.w12.ex02;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public
    class Main {


    public static void main(String[] args) {
        {
            double size = 10;
            double area = size * size;

            System.out.println(area);

            size = 20;

            System.out.println(area);

            area = size * size;

            System.out.println(area);
        }
        System.out.println("*************************");
        {
            Double size = Double.valueOf(10);
            Double area = Double.valueOf(
                size * size
            );

            System.out.println(area);

            size = Double.valueOf(20);

            System.out.println(area);

            area = Double.valueOf(
                size * size
            );

            System.out.println(area);
        }
        System.out.println("***************************");
        {
            DoubleProperty size = new SimpleDoubleProperty(10);
            NumberBinding area = size.multiply(size);

            System.out.println(area.getValue());

            size.set(20);

            System.out.println(area.getValue());
        }
        System.out.println("***************************");
        {
            DoubleProperty size = new SimpleDoubleProperty(10);
            NumberBinding area = new DoubleBinding() {

                {
                    super.bind(size);
                }

                @Override
                protected double computeValue() {
                    System.out.println("tu");
                    return size.get() * size.get();
                }
            };

            System.out.println(area.getValue());

            size.set(20);
            System.out.println(area.getValue());
            size.set(30);
            size.set(40);
            System.out.println(area.getValue());

        }

    }


/*    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();


        Scene scene = new Scene(
            root, 320, 280
        );

        stage.setScene(scene);
        stage.show();
    }*/

}
