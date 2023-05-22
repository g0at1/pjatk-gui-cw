package additional.ex1002;

import additional.ex1002.event.ColorEvent;
import additional.ex1002.event.ColorSetListener;

import javax.swing.*;
import java.awt.*;

public
    class RightPanel
    extends JPanel
    implements ColorSetListener {

    public RightPanel() {
        this.setBackground(Color.RED);
        this.setPreferredSize(new Dimension( 300, 300));
    }

    @Override
    public void colorSet(ColorEvent evt) {
        this.setBackground(evt.getColor());
    }
}
