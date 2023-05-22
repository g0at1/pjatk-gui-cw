package wyklady.w10.curr;

import wyklady.w10.curr.data.Student;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public
    class StudentModel
    extends AbstractTableModel {

    private ArrayList<Student> students;

    public StudentModel() {
        Student s1 = new Student("Jan", 1701);
        Student s2 = new Student("Ola", 534);
        Student s3 = new Student("Kazik", 27162);
        Student s4 = new Student("Anastazja", 98765);

        this.students = new ArrayList<>();
        this.students.add(s1);
        this.students.add(s2);
        this.students.add(s3);
        this.students.add(s4);
    }

    @Override
    public int getRowCount() {
        return this.students.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex){
            case 0 -> students.get(rowIndex).getName();
            case 1-> students.get(rowIndex).getIndexNumber();
            default -> null;
        };
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 0;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        this.students.get(rowIndex).setName((String) aValue);
    }
}
