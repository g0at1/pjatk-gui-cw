package cwiczenia.c10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private LessonTableModel lessonTableModel;
    private JTable lessonTable;

    public Main() {
        setTitle("Plan Lekcji");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        lessonTableModel = new LessonTableModel();
        lessonTable = new JTable(lessonTableModel);

        JButton addButton = new JButton("Dodaj");
        JButton deleteButton = new JButton("Usuń");
        JButton editButton = new JButton("Edytuj");

        addButton.addActionListener(
            e -> showAddDialog()
        );

        deleteButton.addActionListener(
            e -> deleteSelectedLessons()
        );

        editButton.addActionListener(
            e -> showEditDialog()
        );

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(editButton);

        JScrollPane scrollPane = new JScrollPane(lessonTable);

        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void showAddDialog() {
        JTextField subjectField = new JTextField();
        JTextField classroomField = new JTextField();
        JTextField teacherField = new JTextField();
        JTextField dayOfWeekField = new JTextField();
        JTextField blockNumberField = new JTextField();

        JPanel panel = new JPanel(new GridLayout(5, 2));
        panel.add(new JLabel("Przedmiot:"));
        panel.add(subjectField);
        panel.add(new JLabel("Sala:"));
        panel.add(classroomField);
        panel.add(new JLabel("Nauczyciel:"));
        panel.add(teacherField);
        panel.add(new JLabel("Dzień tygodnia:"));
        panel.add(dayOfWeekField);
        panel.add(new JLabel("Numer bloku:"));
        panel.add(blockNumberField);

        int result = JOptionPane.showConfirmDialog(null, panel, "Dodaj lekcję", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            String subject = subjectField.getText();
            String classroom = classroomField.getText();
            String teacher = teacherField.getText();
            String dayOfWeek = dayOfWeekField.getText();
            int blockNumber;

            try {
                blockNumber = Integer.parseInt(blockNumberField.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Niepoprawny numer bloku. Wprowadź liczbę całkowitą.", "Błąd", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (subject.isEmpty() || classroom.isEmpty() || teacher.isEmpty() || dayOfWeek.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Wszystkie pola są wymagane.", "Błąd", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Lesson lesson = new Lesson(subject, classroom, teacher, dayOfWeek, blockNumber);
            lessonTableModel.addLesson(lesson);
        }
    }


    private void showEditDialog() {
        int selectedRow = lessonTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Wybierz lekcję do edycji.", "Błąd", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Lesson selectedLesson = lessonTableModel.getLesson(selectedRow);

        JTextField subjectField = new JTextField(selectedLesson.getSubject());
        JTextField classroomField = new JTextField(selectedLesson.getClassroom());
        JTextField teacherField = new JTextField(selectedLesson.getTeacher());
        JTextField dayOfWeekField = new JTextField(selectedLesson.getDayOfWeek());
        JTextField blockNumberField = new JTextField(String.valueOf(selectedLesson.getBlockNumber()));

        JPanel panel = new JPanel(new GridLayout(5, 2));
        panel.add(new JLabel("Przedmiot:"));
        panel.add(subjectField);
        panel.add(new JLabel("Sala:"));
        panel.add(classroomField);
        panel.add(new JLabel("Nauczyciel:"));
        panel.add(teacherField);
        panel.add(new JLabel("Dzień tygodnia:"));
        panel.add(dayOfWeekField);
        panel.add(new JLabel("Numer bloku:"));
        panel.add(blockNumberField);

        int result = JOptionPane.showConfirmDialog(null, panel, "Edytuj lekcję", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            String subject = subjectField.getText();
            String classroom = classroomField.getText();
            String teacher = teacherField.getText();
            String dayOfWeek = dayOfWeekField.getText();
            int blockNumber = Integer.parseInt(blockNumberField.getText());

            selectedLesson.setSubject(subject);
            selectedLesson.setClassroom(classroom);
            selectedLesson.setTeacher(teacher);
            selectedLesson.setDayOfWeek(dayOfWeek);
            selectedLesson.setBlockNumber(blockNumber);

            lessonTableModel.fireTableDataChanged();
        }
    }

    private void deleteSelectedLessons() {
        int[] selectedRows = lessonTable.getSelectedRows();
        if (selectedRows.length == 0) {
            JOptionPane.showMessageDialog(null, "Wybierz lekcje do usunięcia.", "Błąd", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int result = JOptionPane.showConfirmDialog(null, "Czy na pewno chcesz usunąć zaznaczone lekcje?", "Usuń lekcje", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            for (int i = selectedRows.length - 1; i >= 0; i--) {
                int selectedRow = selectedRows[i];
                Lesson lesson = lessonTableModel.getLesson(selectedRow);
                lessonTableModel.deleteLesson(lesson);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}




