package Polymorphism.Excercise11;

class Meal {
    Meal() { System.out.println("Meal()"); }
}
class Bread {
    Bread() { System.out.println("Bread()"); }
}
class Cheese {
    Cheese() { System.out.println("Cheese()"); }
}
class Lettuce {
    Lettuce() { System.out.println("Lettuce()"); }
}
class Pickle {
    Pickle() { System.out.println("Pickle()"); }
}
class Lunch extends Meal {
    Lunch() { System.out.println("Lunch()"); }
}
class PortableLunch extends Lunch {
    PortableLunch() { System.out.println("PortableLunch()");}
}
public class Sandwich extends PortableLunch implements FastFood {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Pickle p = new Pickle();
    private Lettuce l = new Lettuce();
    private Bread b2 = new Bread();
    public Sandwich() { System.out.println("Sandwich()"); }
    public static void main(String[] args) {
       Sandwich sandwich = new Sandwich();
       sandwich.eat();
       sandwich.fasteat();
       sandwich.mmm();
    }

    @Override
    public void eat() {
        System.out.println("Eating sandwich");
    }

    @Override
    public void fasteat() {
        System.out.println("Fast Eating sandwich");
    }

    @Override
    public void mmm() {
        System.out.println("Mmm, so delicious");
    }
}
