package Inheritance.fromthebook;

class Art {
    Art() { System.out.println("Art constructor"); }
}
class Drawing extends Art {
    Drawing() { System.out.println("Drawing constructor"); }
}
public class Cartoon extends Drawing {
    //public Cartoon() { System.out.println("Cartoon constructor"); }
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}

class A{
    @Override
    public String toString() {
        return "A{}";
    }

    public A(int i) {
        System.out.println("A Constructor");
        System.out.println(this);
    }
}

class B{
    @Override
    public String toString() {
        return "B{}";
    }

    public B() {
        System.out.println("B Constructor");
    }
}

class C extends A{
    C(){
        super(11);
    }
    public B b;

    @Override
    public String toString() {
        return "C{" +
                "b=" + b +
                '}';
    }

    public static void main(String[] args) {
        B b1 = new B();
        C c = new C();
    }
}