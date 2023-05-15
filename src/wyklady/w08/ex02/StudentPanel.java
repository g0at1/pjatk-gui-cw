package wyklady.w08.ex02;

import wyklady.w08.data.Student;

import javax.swing.*;
import java.awt.*;

public
    class StudentPanel
    extends JPanel {

    protected JLabel lName;
    protected JTextField tName;
    protected JLabel lIndex;
    protected JTextField tIndex;

    public StudentPanel(Student stud) {
        this.lName = new JLabel("Name: ");
        this.tName = new JTextField(stud.getName());
        this.lIndex = new JLabel("Index: ");
        this.tIndex = new JTextField(""+stud.getIndexNumber());

        this.tName.setEditable(false);

        setLayout(
            new GridLayout(2,2)
        );

        this.add(lName);
        this.add(tName);
        this.add(lIndex);
        this.add(tIndex);
        this.setPreferredSize(
            new Dimension( 300, 100)
        );
    }
}
