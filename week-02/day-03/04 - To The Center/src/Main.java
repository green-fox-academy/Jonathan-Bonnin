import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.
        Scanner input = new Scanner(System.in);
        System.out.println("How many lines to the center would you like to draw?");
        int numLines = input.nextInt();

        for (int i = 0; i < numLines; i++) {
            int x = (int) Math.floor(Math.random()*303);
            int y = (int) Math.floor(Math.random()*303);
            goTo152152(x , y, graphics);
        }
    }

    public static void goTo152152(int startX, int startY, Graphics graphics){
        graphics.setColor(new Color((int) Math.floor(Math.random()*256),(int) Math.floor(Math.random()*256),(int) Math.floor(Math.random()*256)));
        graphics.drawLine(startX, startY, 152, 152);
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