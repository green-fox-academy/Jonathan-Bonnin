package com.company;

import java.util.Scanner;

public class DrawDiamond {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfLines = input.nextInt();
        if (numOfLines > 0){
            String line = "";
            // creates the first line
            for (int i = 1; i < numOfLines; i++) {
                line += " ";
            }
            line += "*";
            System.out.println(line);
            // creates all other top lines by removing the first char if it's a blank space and then adding "**"
            for (int i = 1; i < numOfLines/2; i++) {
                line += "**";
                line = line.startsWith(" ") ? line.substring(1) : line;
                System.out.println(line);
            }
            // prints middle line if numOfLines is even
            if (numOfLines % 2 == 1 && numOfLines > 1){
                line += "**";
                line = line.startsWith(" ") ? line.substring(1) : line;
                System.out.println(line);
            }

            // creates all other bottom lines
            if (numOfLines % 2 == 0) {
                for (int i = numOfLines / 2; i < numOfLines; i++) {
                    System.out.println(line);
                    line = " " + line;
                    line = line.substring(0, line.length() - 2);
                }
            } else {
                for (int i = numOfLines / 2+1; i < numOfLines; i++) {
                    line = " " + line;
                    line = line.substring(0, line.length() - 2);
                    System.out.println(line);
                }
            }
        } else {
            System.out.println("Please give me a integer superior to 0");
        }
    }
}
