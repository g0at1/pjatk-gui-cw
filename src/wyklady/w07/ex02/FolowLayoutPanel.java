package wyklady.w07.ex02;

import javax.swing.*;

public
    class FolowLayoutPanel
    extends JPanel {

    public FolowLayoutPanel(){
        for(int i=0; i<10; i++)
            this.add(
                new JButton("B"+i)
            );
    }
}
