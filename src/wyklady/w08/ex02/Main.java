package wyklady.w08.ex02;

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

        StudentPanel studPanel = new StudentPanel(jan);

        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(studPanel);

        this.setSize( 640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
