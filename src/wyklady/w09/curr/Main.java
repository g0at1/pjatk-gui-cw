package wyklady.w09.curr;

import javax.swing.*;

public
    class Main
    extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                ()-> new Main()
        );
    }

    public Main(){

        DefaultComboBoxModel<String> cbm = new DefaultComboBoxModel<>(){
            @Override
            public int getSize() {
                return 15*15*15;
            }

            @Override
            public String getElementAt(int index) {
                return ""+((index >> 0) & 0b1111)
                         +" "+((index >> 4) & 0b1111)
                        +" "+((index >> 8) & 0b1111);
            }
        };

        JComboBox<String> jComboBox = new JComboBox<>();
        jComboBox.setModel(cbm);
        jComboBox.setRenderer(new ColorView());


        JPanel jPanle = new JPanel();
        jPanle.add(jComboBox);

        this.getContentPane().add(jPanle);

        this.setSize( 320, 240);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
