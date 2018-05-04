package Inheritance.fromthebook;

public class SimpleClass {
    LazyClass lazyClass;

    public SimpleClass() {
        lazyClass = new LazyClass();
        System.out.println(lazyClass + " has been created inside " + this);
    }

    public String toString() {
        return "SimpleClass";
    }
}

class Test{
    public static void main(String[] args) {
        SimpleClass sc = new SimpleClass();
    }
}
