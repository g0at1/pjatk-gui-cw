package cwiczenia.c02;

import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Random;

public class Main extends Frame {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        this.addComponentListener(
                new ComponentAdapter() {
                    @Override
                    public void componentResized(ComponentEvent e) {
                        super.componentResized(e);
                        repaint();
                    }
                }
        );

        this.setSize(640, 480);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int circleCount = 10;
        int diameter = (this.getWidth() < this.getHeight() ? this.getWidth() : this.getHeight() / circleCount);
        Random random = new Random(1234);

        fillRectRec(g, 0, 0, this.getWidth(), this.getHeight());

//        for (int i = 0; i < circleCount; i++) {
//            for (int j = 0; j < circleCount; j++) {
//                g.setColor(
//                        new Color(
//                                random.nextFloat(),
//                                random.nextFloat(),
//                                random.nextFloat()
//                        )
//                );
//                g.fillOval(j * diameter, i * diameter, diameter, diameter);
//            }
//        }

    }

    public void fillRectRec(Graphics g, int x, int y, int w, int h) {
        g.setColor(
                new Color(
                        (float)(Math.random()),
                        (float)(Math.random()),
                        (float)(Math.random())
                )
        );
        g.fillRect(x, y, w, h);

        if (w > 0 && h > 0) {
            fillRectRec(g, x + 5, y + 5, w - 10, h - 10);
        }
    }
}

//draw(g, x, y, r)
//1) wyliczyc x[], y[]
//2) przesunac o vektor x, y
//drawline do kolorowania pikseli

