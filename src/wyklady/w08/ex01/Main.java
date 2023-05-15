package wyklady.w08.ex01;

import wyklady.w08.data.Student;

import javax.swing.*;
import java.awt.*;

public
    class Main
    extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                ()-> new Main()
        );
    }

    public Main(){
        Student jan = new Student("Jan", 1701);

        JLabel lName = new JLabel("Name: ");
        JTextField tName = new JTextField(jan.getName());
        JLabel lIndex = new JLabel("Index: ");
        JTextField tIndex = new JTextField(""+jan.getIndexNumber());

        tName.setEditable(false);

        JPanel studPanel = new JPanel();
        studPanel.setLayout(
            new GridLayout(2,2)
        );

        studPanel.add(lName);
        studPanel.add(tName);
        studPanel.add(lIndex);
        studPanel.add(tIndex);
        studPanel.setPreferredSize(
            new Dimension( 300, 100)
        );

        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(studPanel);

        this.setSize( 640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
