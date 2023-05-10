package w07.ex01;

import javax.swing.*;

public
    class Main {

    public static void main(String[] args) {
//        Frame f = new Frame();
//        f.setSize(640, 480);
//        f.setVisible(true);

        SwingUtilities.invokeLater(
            ()->{
                JFrame jFrame = new JFrame();
                jFrame.setSize( 640, 480);
                jFrame.setVisible(true);
            }
        );
    }
}
