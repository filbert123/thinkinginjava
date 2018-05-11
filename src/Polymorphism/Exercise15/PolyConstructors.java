package Polymorphism.Exercise15;

class Glyph {
    void draw() { System.out.println("Glyph.draw()"); }
    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}
class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}
class RectangularGlyph extends Glyph{
    private int number;

    public RectangularGlyph(int number) {
        this.number = number;
        System.out.println("RectangularGlyph.RectangularGlyphh(), number = " + number);
    }

    @Override
    void draw() {
        System.out.println("RectangularGlyph.draw(), number = " + number);
    }
}
public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(7);
    }
}
    