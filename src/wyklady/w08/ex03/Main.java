package wyklady.w08.ex03;

import wyklady.w08.data.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        JPanel central = new JPanel();
        central.add(studPanel);
        JButton jButton = new JButton("click me");
        jButton.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jan.setIndexNumber(
                        (int)(Math.random()*25000)
                    );
                    System.out.println(jan);
                }
            }
        );
        this.getContentPane().add(central);
        this.getContentPane().add(jButton, BorderLayout.PAGE_END);

        this.setSize( 640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
