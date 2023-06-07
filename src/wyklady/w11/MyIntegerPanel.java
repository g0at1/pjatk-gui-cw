package wyklady.w11;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public
    class MyIntegerPanel
    extends JPanel
    implements TableCellRenderer {

    protected JLabel jLabel;
    protected JSlider jSlider;

    public MyIntegerPanel() {
        this.setBackground(Color.CYAN);
        this.jLabel = new JLabel();
        this.jSlider = new JSlider(0, 30000);
        this.add(jLabel);
        this.add(jSlider);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        jLabel.setText(value.toString());
        int val = (Integer)value;
        jSlider.setValue(val);
        return this;
    }
}
