import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a 50 long horizontal line from that point.
        // Draw 3 lines with that function. Use loop for that.
        Scanner input = new Scanner(System.in);

        System.out.println("How many horizontal lines with length of 50 do you want?");

        int numOfLines = input.nextInt();

        for (int i = 0; i < numOfLines; i++) {
            drawHorizontalLine((int) Math.floor(Math.random()*305), (int) Math.floor(Math.random()*305), graphics);
        }


    }

    public static void drawHorizontalLine(int x1, int y1, Graphics graphics){
        graphics.setColor(new Color((int) Math.floor(Math.random()*256),(int) Math.floor(Math.random()*256),(int) Math.floor(Math.random()*256)));
        graphics.drawLine(x1, y1, x1+50, y1);
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