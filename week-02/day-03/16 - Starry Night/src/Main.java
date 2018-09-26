import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        //Note from student:
        //Code changed to fill screen resolution

        Scanner input = new Scanner(System.in);
        System.out.println("Hey sexy, how many stars in the skies for you?");
        int numOfStars = input.nextInt();
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, 1980, 1080);

        for (int i = 0; i < numOfStars; i++) {
            int rgb = (int) Math.floor(Math.random() * 256);
            int size = (int) Math.floor(Math.random() * 7);
            graphics.setColor(new Color(rgb, rgb, rgb));
            graphics.fillRect((int) Math.floor(Math.random() * 1980), (int) Math.floor(Math.random() * 1080), size, size);
        }
    }

    // Don't touch the code below
    static int WIDTH = 1920;
    static int HEIGHT = 1080;

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