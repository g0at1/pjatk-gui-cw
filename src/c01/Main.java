package c01;

import java.awt.*;

public
    class Main
    extends Frame {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        super();
        setVisible(true);
        setSize(640, 480);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        System.out.println("here");

//        g.drawPolygon(
//                new int[]{100, 200, 100},
//                new int[]{100, 100, 200},
//                3
//        );

        
        int count = 10;
        double radStep = (2 * Math.PI) / count;
        double r = 100;
        int[] xArr = new int[count];
        int[] yArr = new int[count];
        for (int i = 0; i < count; i++) {
            xArr[i] = (int) ((Math.sin(radStep * i) * r)) + 350;
            yArr[i] = (int) ((Math.cos(radStep * i) * r)) + 350;
        }
        g.drawPolygon(
                xArr,
                yArr,
                count
        );
    }
}