package wyklady.w14.ex02;

import javax.swing.*;
import java.awt.*;

public
    class Main
    extends JFrame{

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }

    int pos = 0;
    JPanel jPanel;

    public Main(){

        jPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.MAGENTA);
                g.fillOval( pos, pos, 50, 50);
            }
        };

        new Thread(
                ()->{
                    while(true){
                        pos++;
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        jPanel.repaint();
                    }
                }
        ).start();

        this.getContentPane().add(jPanel);

        this.setSize( 640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
