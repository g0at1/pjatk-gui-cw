package wyklady.w09.ex03;

import javax.swing.*;
import java.awt.*;

public
    class Main
    extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                ()-> new Main()
        );
    }

    public Main(){
        JTextField jl = new JTextField();

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                for(int i=0; i<10; i++){
                    String str = "";
                    for(int j=0; j<(int)(Math.random()*20); j++)
                        str += (char)('a'+(Math.random()*('z'-'a')));

                    jl.setText(str);
                    jl.paintImmediately( 30, i*40, 100, 30);
                }

            }
        };





        this.getContentPane().add(panel);

        this.setSize( 320, 240);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
