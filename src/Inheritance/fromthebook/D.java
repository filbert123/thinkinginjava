package Inheritance.fromthebook;

public class D {
    public D(int i) {
        System.out.println("This is D constructor with i param = "+i);
    }
}

class E extends D{
    public E(int i) {
        super(i);
        System.out.println("This is E constructor with i param = "+i);
    }
    public E() {
        super(10);
        System.out.println("This is E constructor with i param 10");
    }
    public E(int i, char c) {
        super(i);
        System.out.println("This is E constructor with params = "+i+ " "+c);
    }

    public static void main(String[] args) {
        D d = new D(123);
        E e = new E();
        E e2 = new E(987);
        E e3 = new E(456,'v');
    }
}
