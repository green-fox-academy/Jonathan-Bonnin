import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        int boardSize = 304;
        //width and height is 304, 304/8 =
        for (int x = 0; x <= boardSize; x += boardSize/8) {
            for (int y = 0; y <= boardSize; y += boardSize/8) {
                if((x+y) % (boardSize/8*2) == 0){
                    graphics.setColor(Color.white);
                } else {
                    graphics.setColor(Color.black);
                }
                graphics.fillRect(x, y, boardSize/8,boardSize/8);
            }
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