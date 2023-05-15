package wyklady.w07.ex03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public
    class MyColorPanel
    extends JPanel {

    JButton aButton;

    public MyColorPanel(Color color) {
        this.setBackground(color);

        this.setLayout(new BorderLayout());

        this.setPreferredSize(
            new Dimension(150, 150)
        );

        aButton = new JButton("get new color");

        this.add(
            aButton, BorderLayout.PAGE_END
        );

        aButton.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setBackground(
                        new Color(
                            (int)(Math.random()*255),
                            (int)(Math.random()*255),
                            (int)(Math.random()*255)
                        )
                    );
                }
            }
        );

        aButton.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("here");
                }
            }
        );
    }
}
