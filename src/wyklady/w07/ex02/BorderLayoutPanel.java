package wyklady.w07.ex02;

import javax.swing.*;
import java.awt.*;

public
    class BorderLayoutPanel
    extends JPanel {

    public BorderLayoutPanel() {
        this.setLayout(new BorderLayout());

        this.add(
            new JButton("PS"), BorderLayout.PAGE_START
        );
        this.add(
            new JButton("PE"), BorderLayout.PAGE_END
        );
        this.add(
            new JButton("LS"), BorderLayout.LINE_START
        );
        this.add(
            new JButton("LE"), BorderLayout.LINE_END
        );
        this.add(
            new JButton("Click me"), BorderLayout.CENTER
        );



    }
}
