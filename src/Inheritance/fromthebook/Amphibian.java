package Inheritance.fromthebook;

public class Amphibian {
    protected void run(){
        System.out.println("I am running");
    }
    protected void makesound(){
        System.out.println("I am making sound");
    }
}

class Frog extends Amphibian{
    void jump(){
        System.out.println("I am jumping");
    }

    protected void run(){
        System.out.println("I am frog and I'm runing");
    }
    public static void main(String[] args) {
        Amphibian frog  = new Frog();
        frog.makesound();
        frog.run();
        //frog.jump();
    }
}
