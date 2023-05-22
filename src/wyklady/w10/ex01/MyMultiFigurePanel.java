package wyklady.w10.ex01;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public
    class MyMultiFigurePanel
    extends MyFigurePanel{

    protected List<Figure> figures;

    public MyMultiFigurePanel(Color color, FigureType type) {
        super(color, type);

        this.figures = new ArrayList<>();

        this.addMouseListener(
            new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    figures.add(
                        new Figure( e.getX(), e.getY())
                    );
                }
            }
        );
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(Figure figure : figures)
            g.drawOval( figure.getX(), figure.getY(), 20, 20);
    }
}
