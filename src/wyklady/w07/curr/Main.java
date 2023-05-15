package wyklady.w07.curr;

import javax.swing.*;
import java.awt.*;

public
    class Main
    extends JFrame{

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
            ()->{
                new Main();
            }
        );
    }

    public Main(){

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        MyColorPanel colorPanel1 = new MyColorPanel(Color.ORANGE);
        MyColorPanel colorPanel2 = new MyColorPanel(Color.GREEN);
        MyColorPanel colorPanel3 = new MyColorPanel(Color.BLUE);

        controlPanel.add(colorPanel1);
        controlPanel.add(colorPanel2);
        controlPanel.add(colorPanel3);


        ColorListener colorListener = new ColorListener() {
            @Override
            public void colorChange(ColorEvent evt) {
                getContentPane().setBackground(evt.getColor());
            }
        };

        colorPanel1.addColorListener(colorListener);
        colorPanel2.addColorListener(colorListener);
        colorPanel3.addColorListener(colorListener);

        this.getContentPane().add(
            controlPanel, BorderLayout.PAGE_END
        );

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize( 640, 480);
        this.setVisible(true);
    }
}
