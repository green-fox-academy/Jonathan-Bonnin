import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GameOfLife {

    static int GRID_WIDTH = 400;
    static int GRID_HEIGHT = GRID_WIDTH/2;
    static boolean[][] IS_ALIVE = new boolean[GRID_WIDTH][GRID_HEIGHT];
    static boolean SEEDER = true;
    static int WIDTH = 1600;
    static int HEIGHT = WIDTH/2;
    static int FREQUENCY = 500;

    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);

        if(SEEDER){
//            for (int i = 0; i < IS_ALIVE.length; i++) {
//                for (int j = 0; j < IS_ALIVE[i].length; j++) {
//                    if(Math.random() < 0.5){
//                        IS_ALIVE[i][j] = true;
//                    }
//                }
//            }
            IS_ALIVE[3][3] = true;
            IS_ALIVE[3][5] = true;
            IS_ALIVE[4][4] = true;
            IS_ALIVE[4][5] = true;
            IS_ALIVE[5][4] = true;
            IS_ALIVE[300][100] = true;
            IS_ALIVE[300][99] = true;
            IS_ALIVE[300][98] = true;
            SEEDER = false;
        }

        for (int i = 0; i < IS_ALIVE.length; i++) {
            for (int j = 0; j < IS_ALIVE[i].length; j++) {
                if (IS_ALIVE[i][j]) {
                    graphics.setColor(Color.black);
                } else {
                    graphics.setColor(Color.white);
                }
                graphics.fillRect(WIDTH / GRID_WIDTH * i, HEIGHT / GRID_HEIGHT * j, WIDTH / GRID_WIDTH, HEIGHT / GRID_HEIGHT);
            }
        }

        //draws grid
        graphics.setColor(Color.lightGray);
        for (int i = 0; i < HEIGHT; i += HEIGHT / GRID_HEIGHT) {
            graphics.drawLine(0, i, WIDTH, i);;
        }

        for (int i = 0; i < WIDTH; i += WIDTH / GRID_WIDTH) {
            graphics.drawLine(i, 0, i, HEIGHT);
        }

        //creates next generation of cells
        boolean nextGeneration[][] = new boolean[GRID_WIDTH][GRID_HEIGHT];

        for (int i = 0; i < IS_ALIVE.length; i++) {
            for (int j = 0; j < IS_ALIVE[i].length; j++) {
                int aliveNeighborCells = 0;
                if (i > 0 && i < GRID_WIDTH-1 && j > 0 && j < GRID_HEIGHT-1) {
                    if (IS_ALIVE[i - 1][j - 1]) {
                        aliveNeighborCells++;
                    }
                    if (IS_ALIVE[i - 1][j]) {
                        aliveNeighborCells++;
                    }
                    if (IS_ALIVE[i - 1][j + 1]) {
                        aliveNeighborCells++;
                    }
                    if (IS_ALIVE[i][j - 1]) {
                        aliveNeighborCells++;
                    }
                    if (IS_ALIVE[i][j + 1]) {
                        aliveNeighborCells++;
                    }
                    if (IS_ALIVE[i + 1][j - 1]) {
                        aliveNeighborCells++;
                    }
                    if (IS_ALIVE[i + 1][j]) {
                        aliveNeighborCells++;
                    }
                    if (IS_ALIVE[i + 1][j + 1]) {
                        aliveNeighborCells++;
                    }
                }
                if (IS_ALIVE[i][j]) {
                    nextGeneration[i][j] = aliveNeighborCells == 2 || aliveNeighborCells == 3;
                } else {
                    nextGeneration[i][j] = aliveNeighborCells == 3;
                }
            }
        }
        for (int i = 0; i < nextGeneration.length; i++) {
            for (int j = 0; j < nextGeneration[i].length; j++) {
                IS_ALIVE[i][j] = nextGeneration[i][j];
            }
        }
    }


    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();

        while (true) {
            try {
                Thread.sleep(FREQUENCY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            panel.repaint();
        }
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }

}
