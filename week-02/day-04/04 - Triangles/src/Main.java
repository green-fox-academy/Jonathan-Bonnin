import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    static int CANVAS_SIDE = 512;
    public static void mainDraw(Graphics graphics) {

        drawTriangles(40, 20,  graphics);
    }

    public static void drawTriangles(int lines, int sideAsInt, Graphics graphics){

        double x1 = 400;
        double y1 = 0;
        double x2 = 400;
        double y2 = 0;
        double side = sideAsInt;
        double yDelta = Math.pow((side*side-(side/2)*(side/2)), 0.5);

        for (int i = 0; i < lines; i++) {
            x1 -= side/2;
            x2 += side/2;
            y1 += yDelta;
            y2 += yDelta;
            graphics.drawLine((int) x1,(int) y1, (int)x2, (int) y2);
        }

        x1 = x2;
        y1 = y2;

        for (int i = 0; i < lines; i++){
            x1 -= side;
            x2 -= side/2;
            y2 -= yDelta;
            graphics.drawLine((int) x1,(int) y1, (int)x2, (int) y2);
        }

        x2 = x1;
        y2 = y1;

        for (int i = 0; i < lines; i++){
            x1 += side;
            x2 += side/2;
            y2 -= yDelta;
            graphics.drawLine((int) x1,(int) y1, (int)x2, (int) y2);
        }

    }

    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;
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