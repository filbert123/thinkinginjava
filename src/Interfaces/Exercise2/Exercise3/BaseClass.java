package Interfaces.Exercise2.Exercise3;

public abstract class BaseClass {
    private int i;
    public abstract void  print(int i);

    public BaseClass() {
        print(i);
    }
}

class DerivedClass extends BaseClass{
    @Override
    public void print(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass();
        derivedClass.print(6);
    }
}
