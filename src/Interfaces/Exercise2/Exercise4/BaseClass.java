package Interfaces.Exercise2.Exercise4;

public abstract class BaseClass {
    public abstract void print();
}

class DerivedClass extends BaseClass{
    public void print(){
        System.out.println("Print");
    }
    public static void method(BaseClass baseClass){
        ((DerivedClass) baseClass).print();
    }

    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass();
        method(derivedClass);
    }
}
