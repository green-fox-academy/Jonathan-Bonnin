import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon_v2 {
    public static void mainDraw(Graphics graphics) {

        // this function will draw something similar to
        // https://github.com/green-fox-academy/teaching-materials/blob/master/project/drawing/r6.gif
        // you can change the length of the hexagon as well as the number of hexagons per side

        drawHexagonWithHexagons(4, 60, graphics);
    }

    public static void drawHexagonWithHexagons(int hexagonsPerSide, int hexagonLength, Graphics graphics) {

        // the yDelta is the value of half the height of an hexagon (also called In-circle Radius, more at:
        // https://rechneronline.de/pi/hexagon.php)
        double yDeltaDouble = hexagonLength * Math.pow(3, 0.5) / 2;
        int yDelta = (int) yDeltaDouble;
        int height = yDelta * 2;

        // calculates the x coordinate of top left-most hexagon
        int xCenter = (int) (HEIGHT / 2 - (hexagonLength * 1.5 *(hexagonsPerSide - 1)));

        // this first loop draws lines of hexagons from left to right,
        // it runs a total of: (hexagonsPerSide * 2 -1) times
        for (int i = (-hexagonsPerSide + 1); i < hexagonsPerSide; i++) {

            // this calculates how many hexagons in the line the next loop should draw, based on i
            int hexagonsPerVerticalLine = (hexagonsPerSide * 2) - 1 - Math.abs(i);

            // yCenter is calculated every time before a new line is drawn
            int yCenter = ((WIDTH / 2) - (yDelta * (hexagonsPerVerticalLine))) + yDelta;
            for (int j = 0; j < hexagonsPerVerticalLine; j++) {
                drawOneHexagon(xCenter, yCenter, hexagonLength, graphics);

                // the yCenter shifts down by 1 height of hexagon every time an hexagon is drawn
                yCenter += height;
            }
            // after each vertical line, the x coordinate shifts to the right by 1.5 hexagon
            xCenter += hexagonLength * 1.5;
        }
    }

    public static void drawOneHexagon(int xCenter, int yCenter, int hexagonLength, Graphics graphics) {

        // draws one hexagon with a random color, based on its center coordinates and length
        int red = getRandomColor();
        int green = getRandomColor();
        int blue = getRandomColor();

        int[] xPoints = getPointsFor("x", xCenter, hexagonLength);
        int[] yPoints = getPointsFor("y", yCenter, hexagonLength);

        graphics.setColor(new Color(red, green, blue));
        graphics.fillPolygon(xPoints, yPoints, 6);
    }

    public static int getRandomColor() {

        // returns a number between 0 and 255
        return (int) (Math.random() * 256);
    }

    public static int[] getPointsFor(String point, int center, int hexagonLength) {

        // returns x coordinates points of an hexagon based on its center and its length
        if (point.equals("x")) {
            int[] points = {center - hexagonLength, center - hexagonLength / 2, center + hexagonLength / 2, center + hexagonLength, center + hexagonLength / 2, center - hexagonLength / 2};
            return points;
        } else {
            // returns y coordinates points of an hexagon based on its center and its length
            double yDeltaDouble = hexagonLength * Math.pow(3, 0.5) / 2;
            int yDelta = (int) yDeltaDouble;
            int[] points = {center, center + yDelta, center + yDelta, center, center - yDelta, center - yDelta};
            return points;
        }
    }

    // Don't touch the code below
    static int WIDTH = 1000;
    static int HEIGHT = 1000;

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
