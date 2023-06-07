package wyklady.w11;

import javax.swing.*;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;

public
    class MyIntegerEditorPanel
    extends JPanel
    implements TableCellEditor {

    protected JSlider jSlider;
    protected JButton jButton;

    private boolean state;

    public MyIntegerEditorPanel() {
        this.state = false;

        this.setBackground(Color.RED);
        this.jSlider = new JSlider(0, 30000);
        this.jButton = new JButton("end");
        this.add(jSlider);
        this.add(jButton);

        this.jButton.addActionListener(
            e -> {
                state = true;
                fireStopEditing();
            }
        );
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.jSlider.setValue((Integer)value);
        return this;
    }

    @Override
    public Object getCellEditorValue() {
        System.out.println("val: "+this.jSlider.getValue());
        return this.jSlider.getValue();
    }

    @Override
    public boolean isCellEditable(EventObject anEvent) {
        System.out.println("isCellEditable");
        return true;
    }

    @Override
    public boolean shouldSelectCell(EventObject anEvent) {
        return false;
    }

    @Override
    public boolean stopCellEditing() {
        System.out.println("stopCellEditing");
        return this.state;
    }

    @Override
    public void cancelCellEditing() {

    }

    private List<CellEditorListener> listeners = new ArrayList<>();

    @Override
    public void addCellEditorListener(CellEditorListener l) {
        System.out.println("addCellEditorListener");
        listeners.add(l);
    }

    @Override
    public void removeCellEditorListener(CellEditorListener l) {
        System.out.println("removeCellEditorListener");
        listeners.remove(l);
    }

    protected synchronized void fireStopEditing(){
        for(CellEditorListener l : listeners)
            l.editingStopped(new ChangeEvent(this));
    }
}
