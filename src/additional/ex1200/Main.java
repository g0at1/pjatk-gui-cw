package additional.ex1200;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public
    class Main
    extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }

    private List<Circle> list;

    public Main(){
        this.list = new ArrayList<>();

        JPanel jPanel = new JPanel(){
            {
                new Thread(
                    ()->{
                        while(true){
                            try {
                                Thread.sleep(1000/30);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            repaint();
                        }
                    }
                ).start();
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                for(Circle circle : list)
                    circle.paint(g);
            }
        };

        this.getContentPane().add(jPanel);

        this.addMouseListener(
            new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    list.add(
                        new Circle(e.getX(), e.getY())
                    );
                }
            }
        );

        this.setSize(640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
