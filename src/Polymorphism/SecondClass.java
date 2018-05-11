package Polymorphism;

public class SecondClass extends FirstClass {
    public SecondClass(String name, int num) {
        super(name, num);
    }

    public void sendmessage(){

        System.out.println(getNum()+" "+getName());
    }
}

class TestClasses{
    public static void main(String[] args) {
        FirstClass second = new FirstClass("Andrew",29);
        second.sendmessage();
    }
}
