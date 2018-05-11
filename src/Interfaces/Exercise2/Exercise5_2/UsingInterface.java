package Interfaces.Exercise2.Exercise5_2;
import Interfaces.Exercise2.Exercise5_1.MyInterface;

public class UsingInterface implements MyInterface {
    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void cont() {
        System.out.println("Continue");

    }
}
