package Polymorphism.Exercise2and3and4;

import java.util.Random;

public class Shape {
    public void draw() {}
    public void erase() {}
    public void printmessage(){
        System.out.println("Shape message");
    }
} 
class Circle extends Shape {
    @Override
    public void draw() { System.out.println("Circle.draw()"); }
    @Override
    public void erase() { System.out.println("Circle.erase()"); }

    @Override
    public void printmessage() {
        System.out.println("Circle message");
    }
}

class Square extends Shape {
    @Override
    public void draw() { System.out.println("Square.draw()"); }
    @Override
    public void erase() { System.out.println("Square.erase()"); }

    @Override
    public void printmessage() {
        System.out.println("Square message");
    }
}
class Triangle extends Shape {
    @Override
    public void draw() { System.out.println("Triangle.draw()"); }
    @Override
    public void erase() { System.out.println("Triangle.erase()"); }

    @Override
    public void printmessage() {
        System.out.println("Triangle message");
    }
}
class Hexagon extends Shape {
    @Override
    public void draw() {
        System.out.println("Hexagon.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Hexagon.erase()");
    }

    @Override
    public void printmessage() {
        System.out.println("Hexagon message");
    }
}
 class RandomShapeGenerator {
    private Random rand = new Random();
    public Shape next() {
        switch(rand.nextInt(4)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Hexagon();
        }
    }
}
class Shapes {
    private static RandomShapeGenerator gen =
            new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
// Fill up the array with shapes:
        for(int i = 0; i < s.length; i++)
            s[i] = gen.next();
// Make polymorphic method calls:
        for(Shape shp : s) {
            shp.draw();
            shp.printmessage();
        }
    }
}
