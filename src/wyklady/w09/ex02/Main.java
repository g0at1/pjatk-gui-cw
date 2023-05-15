package wyklady.w09.ex02;

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
        JPanel panel = new JPanel();

        for(int i=0; i<10; i++){
            String str = "";
            for(int j=0; j<(int)(Math.random()*20); j++)
                str += (char)('a'+(Math.random()*('z'-'a')));
            JTextField jl = new JTextField(str);
            panel.add(jl);
        }

        this.getContentPane().add(panel);

        this.setSize( 320, 240);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
