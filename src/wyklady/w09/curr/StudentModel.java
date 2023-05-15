package wyklady.w09.curr;

import javax.swing.*;
import wyklady.w09.data.Student;

import java.util.ArrayList;
import java.util.List;

public
    class StudentModel
    extends AbstractListModel<Student>
    implements ComboBoxModel<Student> {

    private List<Student> studentList;

    public StudentModel() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student){
        this.studentList.add(student);
    }

    @Override
    public int getSize() {
        return this.studentList.size();
    }

    @Override
    public Student getElementAt(int index) {
        return this.studentList.get(index);
    }

    private Object obj;

    @Override
    public void setSelectedItem(Object anItem) {
        this.obj = anItem;
    }

    @Override
    public Object getSelectedItem() {
        return this.obj;
    }
}
