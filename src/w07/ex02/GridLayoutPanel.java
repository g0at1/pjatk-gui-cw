package w07.ex02;

import javax.swing.*;
import java.awt.*;

public
    class GridLayoutPanel
    extends JPanel {

    public GridLayoutPanel() {
        this.setLayout(new GridLayout(3, 4));

        for(int i=0; i<12; i++)
            this.add(
                new JButton("B"+i)
            );
    }
}
