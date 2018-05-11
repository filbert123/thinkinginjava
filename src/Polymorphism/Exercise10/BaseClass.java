package Polymorphism.Exercise10;

public class BaseClass {
    public void showmessage(){
        System.out.println("This is BaseClass message");
        showanothermessage();
    }
    public void showanothermessage(){
        System.out.println("Another message from BaseClass");
    }
}

class DerivedClass extends BaseClass{
    public void showanothermessage(){
        System.out.println("Another message from DerivedClass");
    }
}

class TestClasses{
    public static void main(String[] args) {
        BaseClass d = new DerivedClass();
        d.showmessage();

    }
}