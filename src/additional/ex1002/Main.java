package additional.ex1002;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public
    class Main
    extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }

    public Main(){
        RightPanel rightPanel = new RightPanel();
        this.getContentPane().add(rightPanel, BorderLayout.LINE_END);

        LeftPanel leftPanel = new LeftPanel();
        this.getContentPane().add(leftPanel, BorderLayout.LINE_START);

        leftPanel.addColorSetListener(rightPanel);

        this.setSize(640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
