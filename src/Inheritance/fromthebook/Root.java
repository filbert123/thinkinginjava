package Inheritance.fromthebook;

public class Root {
    public Root(float f){
        System.out.println("This is root class constructor "+f);
    }
    void dispose(){
        System.out.println("Disposing of "+this);
    }
    Component1 c1 = new Component1(876);
    Component2 c2 = new Component2('v');
    Component3 c3= new Component3(8.98);

    @Override
    public String toString() {
        return "Root";
    }
}

class Component1{
    public Component1(int i) {
        System.out.println("This is component 1 class constructor "+i);
    }
    void dispose(){
        System.out.println("Component 1 disposed");
    }
}

class Component2{
    public Component2(char c) {
        System.out.println("This is component 2 class constructor "+c);
    }
    void dispose(){
        System.out.println("Component 2 disposed");
    }
}

class Component3{
    public Component3(double d) {
        System.out.println("This is component 3 class constructor "+d);
    }
    void dispose(){
        System.out.println("Component 3 disposed");
    }
}

class Stern extends Root{
    public Stern(float f) {
        super(f);
        System.out.println("This is stern class constructor "+f);
    }
    void dispose(){
        System.out.println("Disposing of "+this);
        super.dispose();
    }
    Component1 c1 = new Component1(123);
    Component2 c2 = new Component2('g');
    Component3 c3= new Component3(4.09);
    public static void main(String[] args) {
        Root root = new Root(5.6F);
        Stern stern = new Stern(9.06F);
        try {
            System.out.println();
        }
        finally {
            root.dispose();
            stern.dispose();
        }
    }

    @Override
    public String toString() {
        return "Stern";
    }
}
