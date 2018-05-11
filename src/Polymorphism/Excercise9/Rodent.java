package Polymorphism.Excercise9;
public class Rodent {
    public void info(){
        System.out.println("This is rodent"+individualfeature());
    }

    public String individualfeature(){
        return ", it has long teeth";
    }
}

class Mouse extends Rodent {
    @Override
    public void info(){
        System.out.println("This is mouse"+individualfeature());
    }

    @Override
    public String individualfeature() {
        return super.individualfeature()+" and live in the house";
    }
}

class Gerbil extends Rodent{
    @Override
    public void info(){
        System.out.println("This is gerbil"+individualfeature());
    }

    @Override
    public String individualfeature() {
        return super.individualfeature()+" and live in the fields";
    }
}

class Hamster extends Rodent{
    @Override
    public void info(){
        System.out.println("This is hamster"+individualfeature());
    }

    @Override
    public String individualfeature() {
        return super.individualfeature()+" and big cheeks";
    }
}

class RodentTest{
    public static void main(String[] args) {
        Rodent [] rodent = {new Mouse(),new Gerbil(),new Hamster(), new Rodent()};
        for (Rodent r:rodent
             ) {
            r.info();
        }

    }
}
