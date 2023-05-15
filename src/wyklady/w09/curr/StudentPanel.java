package wyklady.w09.curr;

import wyklady.w09.curr.event.StudentEvent;
import wyklady.w09.curr.event.StudentListener;
import wyklady.w09.data.Student;

import javax.swing.*;
import java.awt.*;

public
    class StudentPanel
    extends JPanel
    implements StudentListener {

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

        stud.addStudentListener(this);
    }

    @Override
    public void indexChanged(StudentEvent evt) {
        tIndex.setText(""+((Student)evt.getSource()).getIndexNumber());
    }

    @Override
    public void nameChanged(StudentEvent evt) {

    }
}
