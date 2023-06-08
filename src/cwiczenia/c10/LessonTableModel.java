package cwiczenia.c10;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public
    class LessonTableModel
    extends AbstractTableModel {
    private List<Lesson> lessons;
    private String[] columnNames = {"Dzień", "Numer bloku", "Przedmiot", "Sala", "Nauczyciel"};

    public LessonTableModel() {
        lessons = new ArrayList<>();
    }

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
        fireTableRowsInserted(lessons.size() - 1, lessons.size() - 1);
    }

    public void deleteLesson(Lesson lesson) {
        int index = lessons.indexOf(lesson);
        if (index != -1) {
            lessons.remove(index);
            fireTableRowsDeleted(index, index);
        }
    }

    public Lesson getLesson(int index) {
        return lessons.get(index);
    }

    @Override
    public int getRowCount() {
        return lessons.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Lesson lesson = lessons.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return lesson.getDayOfWeek();
            case 1:
                return lesson.getBlockNumber();
            case 2:
                return lesson.getSubject();
            case 3:
                return lesson.getClassroom();
            case 4:
                return lesson.getTeacher();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}