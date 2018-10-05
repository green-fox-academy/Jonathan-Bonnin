import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EndlessHexagons {
    public static void mainDraw(Graphics graphics) {

        // reproduce this:
        //  https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/recursion/drawing/graphic2.png
        graphics.setColor(Color.white);
        graphics.fillRect(0,0,WIDTH,HEIGHT);
        graphics.setColor(Color.black);
        drawHexagon(WIDTH / 2., WIDTH / 2, HEIGHT / 2, graphics);


    }

    static void drawHexagon(double n, double xCenter, double yCenter, Graphics graphics) {
        if (n < 9) {
            return;
        }

        drawOneHexagon(xCenter, yCenter, n, graphics);

        drawHexagon(n/2., xCenter + n / 2., yCenter, graphics);
        drawHexagon(n/2., xCenter - n / 4., yCenter - n * Math.pow(3, 0.5) / 4, graphics);
        drawHexagon(n/2., xCenter - n / 4., yCenter + n * Math.pow(3, 0.5) / 4, graphics);
        return;

    }

    public static void drawOneHexagon(double xCenter, double yCenter, double hexagonLength, Graphics graphics) {

        // draws one hexagon based on its center coordinates and length
        int[] xPoints = getPointsFor("x", xCenter, hexagonLength);
        int[] yPoints = getPointsFor("y", yCenter, hexagonLength);
        graphics.setColor(new Color(getRandomColor(),getRandomColor(),getRandomColor()));
        graphics.fillPolygon(xPoints, yPoints, 6);
    }

    public static int getRandomColor() {

        // returns a number between 0 and 255
        return (int) (Math.random() * 256);
    }

    public static int[] getPointsFor(String point, double center, double hexagonLength) {

        // returns x coordinates points of an hexagon based on its center and its length
        if (point.equals("x")) {
            int[] points = {(int) (center - hexagonLength), (int) (center - hexagonLength / 2), (int) (center + hexagonLength / 2), (int) (center + hexagonLength),(int) (center + hexagonLength / 2), (int) (center - hexagonLength / 2)};
            return points;
        } else {
            // returns y coordinates points of an hexagon based on its center and its length
            double yDeltaDouble = hexagonLength * Math.pow(3, 0.5) / 2;
            int[] points = {(int)center, (int)(center + yDeltaDouble), (int)(center + yDeltaDouble), (int)center, (int)(center - yDeltaDouble), (int)(center - yDeltaDouble)};
            return points;
        }
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
//        while(true){
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            panel.repaint();
//        }
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }

}
