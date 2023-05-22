package additional.ex1002;

import additional.ex1002.event.ColorEvent;
import additional.ex1002.event.ColorSetListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public
    class LeftPanel
    extends JPanel {

    public LeftPanel() {
        this.setBackground(Color.GREEN);
        this.setPreferredSize(new Dimension( 300, 300));

        JButton jButton = new JButton("click me");
        this.add(jButton);

        jButton.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    fireColorSet(
                        new Color(
                            (int)(Math.random()*255),
                            (int)(Math.random()*255),
                            (int)(Math.random()*255)
                        )
                    );
                }
            }
        );

    }

    private ArrayList<ColorSetListener> listeners = new ArrayList<>();

    public void addColorSetListener(ColorSetListener listener){
        this.listeners.add(listener);
    }
    public void removeColorSetListener(ColorSetListener listener){
        this.listeners.remove(listener);
    }

    protected void fireColorSet(Color color){
        ColorEvent evt = new ColorEvent( this, color);
        for(ColorSetListener listener : listeners)
            listener.colorSet(evt);
    }
}
