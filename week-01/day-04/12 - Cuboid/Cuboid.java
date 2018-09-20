//#TODO
// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

public class Cuboid {

    public static void main(String[] args) {
        double height = 5;
        double width = 10;
        double length = 20;
        double surfaceArea = 2 * height * width + 2 * height * length + 2 * width * length;
        double volume = height * width * length;
        System.out.println("Surface Area: " + Math.round(surfaceArea) + "\nVolume: " + Math.round(volume));
    }
}
