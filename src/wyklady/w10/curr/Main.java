package wyklady.w10.curr;

import wyklady.w10.curr.data.Student;

import javax.swing.*;
import java.awt.*;

public
    class Main
    extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }

    public Main(){

        JTable jt = new JTable();
        StudentModel sm = new StudentModel();

        jt.setModel(sm);

        this.getContentPane().add(jt);

        this.setSize( 640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
