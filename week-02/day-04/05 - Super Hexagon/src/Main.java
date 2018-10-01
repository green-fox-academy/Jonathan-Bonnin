import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        drawHexagons(8, 40, HEIGHT/2, WIDTH/2,  graphics);

    }
    public static void drawHexagons(int sideBlocs, int sideAsInt, int xCenter, int yCenter, Graphics graphics){
        double yDelta = Math.pow((sideAsInt*sideAsInt)-((sideAsInt/2)*(sideAsInt/2)), 0.5);
        double startingCenterY = yCenter - (yDelta * 2 * (sideBlocs -1));
        double middleCenterY = startingCenterY;

        //draws middle line
        for (int i = 0; i < sideBlocs*2-1; i++) {
            drawOneHexagon(xCenter, (int) middleCenterY , sideAsInt, graphics);
            middleCenterY  +=  2 * (int) yDelta;
        }
        //draws left lines
        int xLeftCenter = xCenter;
        int numberOfSideBlocs = sideBlocs*2-2;
        int numberOfLeftBlocs = numberOfSideBlocs;


        for (int i = 1; i < sideBlocs; i++) {
            xLeftCenter -= (int) (sideAsInt * 1.5);
            int yLeftCenter = (int) startingCenterY + i * (int) yDelta;
            for (int j = 0; j < numberOfLeftBlocs; j++) {
                drawOneHexagon(xLeftCenter, yLeftCenter, sideAsInt, graphics);
                yLeftCenter +=  2 * (int) yDelta;
            }
            numberOfLeftBlocs--;
        }

        int numberOfRightBlocs = numberOfSideBlocs;
        int xRightCenter = xCenter;

        for (int i = 1; i < sideBlocs; i++) {
            xRightCenter += (int) (sideAsInt * 1.5);
            int yRightCenter = (int) startingCenterY + i * (int) yDelta;
            for (int j = 0; j < numberOfRightBlocs; j++) {
                drawOneHexagon(xRightCenter, yRightCenter, sideAsInt, graphics);
                yRightCenter +=  2 * (int) yDelta;
            }
            numberOfRightBlocs--;
        }
    }

    public static void  drawOneHexagon(int xCenter, int yCenter, int sideAsInt, Graphics graphics){
        double yDelta = Math.pow((sideAsInt*sideAsInt)-((sideAsInt/2)*(sideAsInt/2)), 0.5);
        int[] xPoints = {xCenter-sideAsInt, xCenter-sideAsInt/2, xCenter+sideAsInt/2, xCenter+sideAsInt, xCenter+sideAsInt/2, xCenter-sideAsInt/2};
        int[] yPoints = {yCenter, yCenter+(int) yDelta, yCenter+(int) yDelta, yCenter, yCenter-(int) yDelta, yCenter-(int) yDelta};
        graphics.setColor(new Color((int) Math.floor(Math.random()*256),(int) Math.floor(Math.random()*256),(int) Math.floor(Math.random()*256)));
        graphics.fillPolygon(xPoints,yPoints,6);
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
