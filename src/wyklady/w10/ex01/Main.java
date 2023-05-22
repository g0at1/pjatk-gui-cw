package wyklady.w10.ex01;

import javax.swing.*;
import java.awt.*;

public
    class Main
    extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }

    public Main(){
        MyFigurePanel myFigurePanel1 = new MyFigurePanel(Color.GREEN, FigureType.OVAL);
        MyFigurePanel myFigurePanel2 = new MyFigurePanel(Color.RED, FigureType.RECT);

        MyMultiFigurePanel myMultiFigurePanel = new MyMultiFigurePanel(Color.LIGHT_GRAY, FigureType.OVAL);

        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(myFigurePanel1);
        this.getContentPane().add(myFigurePanel2);
        this.getContentPane().add(myMultiFigurePanel);

        this.setSize( 640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
