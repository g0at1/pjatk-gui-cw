package wyklady.w11;

import wyklady.w11.data.Student;

import javax.swing.table.AbstractTableModel;
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
        return true;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 -> this.students.get(rowIndex).setName((String) aValue);
            case 1 -> this.students.get(rowIndex).setIndexNumber((Integer) aValue);
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex == 1)
            return Integer.class;
        return super.getColumnClass(columnIndex);
    }
}
