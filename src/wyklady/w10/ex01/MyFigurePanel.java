package wyklady.w10.ex01;

import javax.swing.*;
import java.awt.*;

public
    class MyFigurePanel
    extends JPanel
    implements Runnable{

    protected FigureType type;
    private boolean state;

    private int x, y;
    private int vx, vy;

    public MyFigurePanel(Color color, FigureType type) {
        this.type = type;
        this.state = true;

        this.x = 1;
        this.y = 20;

        this.vx = 1;
        this.vy = 1;

        this.setBackground(color);
        this.setPreferredSize(new Dimension(200, 200));

        new Thread(this).start();
        new Thread(){
            @Override
            public void run() {
                while(true){
                    if( x + vx <= 0 || x + 20 + vx >= getWidth()) {
                        vx *= -1;
                        int tmp = 1+(int)(Math.random()*5);
                        if(vx < 0)
                            tmp *= -1;
                        vx = tmp;
                    }
                    if( y + vy <= 0 || y + 20 + vy >= getHeight()) {
                        vy *= -1;
                        int tmp = 1+(int)(Math.random()*5);
                        if(vy < 0)
                            tmp *= -1;
                        vy = tmp;
                    }
                    x += vx;
                    y += vy;

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        switch(type){
            case OVAL ->
                g.fillOval( x, y, 20, 20);
            case RECT ->
                g.fillRect( x, y, 20, 20);
        }
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000/30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            repaint();
        }
    }
}
