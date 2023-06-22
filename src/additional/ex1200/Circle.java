package additional.ex1200;

import java.awt.*;

public
    class Circle
    implements Runnable{

    int x, y;
    int vx, vy;
    int del;
    Color color;

    public Circle(int x, int y){
        this.x = x;
        this.y = y;
        this.color = new Color(
            (int)(Math.random()*255),
            (int)(Math.random()*255),
            (int)(Math.random()*255)
        );
        this.vx = (int)(Math.random()*5)-2;
        this.vy = (int)(Math.random()*5)-2;
        this.del = (int)(Math.random()*500);
        new Thread(this).start();
    }


    public void paint(Graphics g){
        g.setColor(color);
        g.fillOval( x-25, y-25, 50, 50);
    }

    @Override
    public void run() {
        while(true){
            x += vx;
            y += vy;
            try {
                Thread.sleep(del);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
