import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]

        int coordinates = 0;
        for (int i = 1; i < 7; i++) {
            graphics.setColor(new Color(186, 85, 211));
            graphics.fillRect((i*(i-1)/2 + 1)*12,(i*(i-1)/2 + 1)*12,i*12,i*12);
            graphics.setColor(new Color(128, 0, 128));
            graphics.drawRect((i*(i-1)/2 + 1)*12,(i*(i-1)/2 + 1)*12,i*12,i*12);
            graphics.drawRect((i*(i-1)/2 + 1)*12+1,(i*(i-1)/2 + 1)*12+1,i*12-2,i*12-2);
        }

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}

