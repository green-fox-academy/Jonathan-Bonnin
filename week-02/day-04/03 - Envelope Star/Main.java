import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
 import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Main {
    static int CANVAS_SIDE = 512;
     public static void mainDraw(Graphics graphics) {
         Scanner input = new Scanner(System.in);
        System.out.println("How many quarters do you want? (1, 4, 16 or 64)");
         int numQuarters = input.nextInt();
        while (numQuarters != 1 && numQuarters != 4 &&
                numQuarters !=  16 && numQuarters !=  64){
            numQuarters = input.nextInt();
        }
         drawManyLines(numQuarters, graphics);
     }
     public static void drawManyLines(int quarters, Graphics graphics){
         int subCanvas = CANVAS_SIDE;
        int rows = 1;
        for (int i = 1; i < quarters; i = i*4) {
            subCanvas /= 2;
            rows *= 2;
        }
        int columns = rows;
         int subCanvasHorizontal = subCanvas;
        int subCanvasVertical = subCanvas;
        for (int i = 0; i <= columns; i++) {
            for (int j = 0; j <= rows; j++) {
                graphics.setColor(new Color(128,0,128));
                for (int x = 0; x < subCanvas; x += subCanvas/16) {
                    graphics.drawLine(x + j * subCanvas,0 + i * subCanvas,subCanvas + j * subCanvas,x + i * subCanvas);
                }
                 graphics.setColor(Color.GREEN);
                for (int y = 0; y < subCanvas; y += subCanvas/16) {
                    graphics.drawLine(0 + j * subCanvas,y + i * subCanvas,y + j * subCanvas ,subCanvas + i * subCanvas);
                }
            }
        }
     }
    // Don't touch the code below
    static int WIDTH = 512;
    static int HEIGHT = 512;
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