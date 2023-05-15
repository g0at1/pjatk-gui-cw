package wyklady.w09.ex01;

import wyklady.w09.data.Student;

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
        //central.add(studPanel);
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

        StudentModel studentModel = new StudentModel();

        studentModel.addStudent(new Student("Jan", 534));
        studentModel.addStudent(new Student("Ola", 1701));
        studentModel.addStudent(new Student("Hieronim", 27563));

        JComboBox<Student> jComboBox = new JComboBox<>();
        jComboBox.setModel(studentModel);
//        jComboBox.setRenderer();
        central.add(jComboBox);

//        JCheckBox jCheckBox = new JCheckBox();
//
//        jCheckBox.addActionListener(
//            (e) -> System.out.println(jCheckBox.isSelected())
//        );

        this.getContentPane().add(central);
        this.getContentPane().add(jButton, BorderLayout.PAGE_END);

        this.setSize( 320, 240);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
