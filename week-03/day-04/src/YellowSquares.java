import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class YellowSquares {
    public static void mainDraw(Graphics graphics) {

        // reproduce this:
        //https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/recursion/drawing/graphic.png
        graphics.setColor(Color.yellow);
        graphics.fillRect(0, 0, 729, 729);
        graphics.setColor(Color.black);
        drawFourSquares(WIDTH / 3., WIDTH/2, HEIGHT/2, graphics);
    }

    static int drawFourSquares(double n, double xCenter, double yCenter, Graphics graphics) {
        if (n < 3) {
            return 0;
        }

        graphics.drawLine((int) (xCenter - n/2), (int) (yCenter - n * 1.5), (int) (xCenter - n/2), (int) (yCenter + n * 1.5));
        graphics.drawLine((int) (xCenter + n/2), (int) (yCenter - n * 1.5), (int) (xCenter + n/2), (int) (yCenter + n * 1.5));
        graphics.drawLine((int) (xCenter - n * 1.5), (int) (yCenter - n / 2), (int) (xCenter + n * 1.5), (int) (yCenter - n / 2));
        graphics.drawLine((int) (xCenter - n * 1.5), (int) (yCenter + n / 2), (int) (xCenter + n * 1.5), (int) (yCenter + n / 2));


        return drawFourSquares(n/3, xCenter, yCenter-n, graphics) + drawFourSquares(n/3, xCenter, yCenter+n, graphics)
        + drawFourSquares(n/3, xCenter-n, yCenter, graphics) + drawFourSquares(n/3, xCenter+n, yCenter, graphics);

    }

    static int WIDTH = 729;
    static int HEIGHT = 729;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }

}
