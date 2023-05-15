package wyklady.w09.curr;

import javax.swing.*;
import java.awt.*;

public
    class ColorView
    extends JPanel
    implements ListCellRenderer<String> {

    private JLabel jl;
    private JPanel jp;

    public ColorView(){
        jl = new JLabel();
        jp = new JPanel();
        jp.setPreferredSize(new Dimension(15, 15));
        this.add(jl);
        this.add(jp);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends String> list, String value, int index, boolean isSelected, boolean cellHasFocus) {
        if(value != null) {
            jl.setText(value);
            String[] arr = value.split(" ");
            Color c = new Color(
                (Integer.parseInt(arr[0])*10)%255,
                (Integer.parseInt(arr[1])*10)%255,
                (Integer.parseInt(arr[2])*10)%255
            );
            jp.setBackground(c);
        }
        return this;
    }
}
