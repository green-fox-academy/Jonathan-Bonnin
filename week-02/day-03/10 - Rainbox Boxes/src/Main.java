import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        String[] rainbowTable = {"Violet","Indigo","Blue","Green","Yellow","Orange","Red"};
        int tableLooper = 0;
        for (int size = 304; size >0; size-=21) {
            rainbowSquare(size, rainbowTable[tableLooper%7], graphics);
            tableLooper++;
            }
    }

    public static void rainbowSquare(int size, String color, Graphics graphics){
        HashMap<String, int[]> rainbowMap = new HashMap<>();
        int[] Violet = {148, 0, 211};
        int[] Indigo = {75, 0, 130};
        int[] Blue = {0, 0, 255};
        int[] Green = {0, 255, 0};
        int[] Yellow = {255, 255, 0};
        int[] Orange = {255, 127, 0};
        int[] Red = {255, 0, 0};
        rainbowMap.put("Violet", Violet);
        rainbowMap.put("Indigo", Indigo);
        rainbowMap.put("Blue", Blue);
        rainbowMap.put("Green", Green);
        rainbowMap.put("Yellow", Yellow);
        rainbowMap.put("Orange", Orange);
        rainbowMap.put("Red", Red);

        graphics.setColor(new Color(rainbowMap.get(color)[0],rainbowMap.get(color)[1],rainbowMap.get(color)[2]));
        graphics.fillRect((304-size)/2, (304-size)/2, size, size);

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
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}