import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        //Notes from student:
        //I'll do from 19px, because (effective side of canvas % 19) == 0, given default values
        //I'm drawing lines through the center


        for (int x = 0; x <= 304; x += 19) {
            drawLineToCenter(x, 0, graphics);
        }

        for (int y = 0; y <= 304; y += 19) {
            drawLineToCenter(0, y, graphics);
        }



    }

    public static void  drawLineToCenter(int x, int y, Graphics graphics){
        graphics.drawLine(x, y, 304-x , 304-y);
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