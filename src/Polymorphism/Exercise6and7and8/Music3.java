package Polymorphism.Exercise6and7and8;

import java.util.Random;

class Instrument {
    void play(Note n) { System.out.println("Instrument.play() " + n); }
    String what() { return "Instrument"; }
    void adjust() { System.out.println("Adjusting Instrument"); }
}
class Wind extends Instrument {
    void play(Note n) { System.out.println("Wind.play() " + n); }
    String what() { return "Wind"; }
    void adjust() { System.out.println("Adjusting Wind"); }
}
class Percussion extends Instrument {
    void play(Note n) { System.out.println("Percussion.play() " + n); }
    String what() { return "Percussion"; }
    void adjust() { System.out.println("Adjusting Percussion"); }
}
class Stringed extends Instrument {
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    String what() {
        return "Stringed";
    }

    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Keyboard extends Instrument {
    void play(Note n) {
        System.out.println("Keyboard.play() " + n);
    }

    String what() {
        return "Keyboard";
    }

    void adjust() {
        System.out.println("Adjusting Keyboard");
    }
}
    class Brass extends Wind {
        void play(Note n) {
            System.out.println("Brass.play() " + n);
        }

        void adjust() {
            System.out.println("Adjusting Brass");
        }
    }
    class Woodwind extends Wind {
        void play(Note n) { System.out.println("Woodwind.play() " + n); }
        String what() { return "Woodwind"; }
    }
    public class Music3 {

        public static void tune(Instrument i) {
// ...
            i.play(Note.MIDDLE_C);
        }
        public static void tuneAll(Instrument[] e) {
            for(Instrument i : e)
                tune(i);
        }
        public static void main(String[] args) {
// Upcasting during addition to the array:
            Instrument[] orchestra = {
                    new Wind(),
                    new Percussion(),
                    new Stringed(),
                    new Brass(),
                    new Woodwind(),
                    new Keyboard()
            };
            //tuneAll(orchestra);
            RandomInstrumentGenerator randomInstrumentGenerator = new RandomInstrumentGenerator();
            Instrument [] ins = new Instrument[10];
            for(int i = 0;i<ins.length;i++){
                ins [i] = randomInstrumentGenerator.next();
            }
            for (Instrument i:
                 ins) {
                i.play(Note.C_SHARP);
                i.adjust();
            }
            for (Instrument instrument : orchestra) {
                //System.out.println(instrument.what());
            }
        }
    }
class RandomInstrumentGenerator {
    private Random rand = new Random(47);
    public Instrument next() {
        switch(rand.nextInt(6)) {
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Brass();
            case 4: return new Woodwind();
            case 5: return new Keyboard();
        }
    }
}
enum Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}