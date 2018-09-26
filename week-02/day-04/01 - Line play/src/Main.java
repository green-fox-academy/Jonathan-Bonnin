import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Main {
    public static void mainDraw(Graphics graphics) {

        int canvasSide = 512;


        graphics.setColor(new Color(128,0,128));
        for (int x = canvasSide/16; x < canvasSide; x += canvasSide/16) {
            graphics.drawLine(x,0,canvasSide,x);
        }

        graphics.setColor(Color.green);
        for (int y = canvasSide/16; y < canvasSide; y += canvasSide/16) {
            graphics.drawLine(0,y,y,canvasSide);
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