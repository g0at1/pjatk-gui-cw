package w07.curr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

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
                    Color color = new Color(
                        (int)(Math.random()*255),
                        (int)(Math.random()*255),
                        (int)(Math.random()*255)
                    );
                    setBackground(color);
                    fireColorChange(
                        new ColorEvent( MyColorPanel.this, color)
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

        listeners = new ArrayList<>();
    }

    private List<ColorListener> listeners;

    public void addColorListener(ColorListener colorListener){
        listeners.add(colorListener);
    }

    private void fireColorChange(ColorEvent evt){
        for(ColorListener colorListener : listeners)
            colorListener.colorChange(evt);
    }
}
