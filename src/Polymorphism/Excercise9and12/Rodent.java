package Polymorphism.Excercise9and12;
public abstract class Rodent {
    public Rodent() {
        System.out.println("Create rodent");
    }

   /* public void info(){
        System.out.println("This is rodent"+individualfeature());
    }

    public String individualfeature(){
        return ", it has long teeth";
    }*/
   public abstract void info();

    public String individualfeature(){
        return ", it has long teeth";
    }

    public void dispose(){
        System.out.println("Dispose of Rodent");
    }
}
//public interface Rodent {
//
//    /* public void info(){
//         System.out.println("This is rodent"+individualfeature());
//     }
//
//     public String individualfeature(){
//         return ", it has long teeth";
//     }*/
//    public void info();
//
//    String individualfeature();
//
//    void dispose();
//}
class Mouse extends Rodent {
    public Mouse() {
        System.out.println("Create mouse");
    }

    @Override
    public void info(){
        System.out.println("This is mouse"+individualfeature());
    }

    @Override
    public String individualfeature() {
        return super.individualfeature()+" and live in the house";
    }

    @Override
    public void dispose() {
        System.out.println("Mouse dispose");
        super.dispose();
    }
}

class Gerbil extends Rodent{
    public Gerbil() {
        System.out.println("Create gerbil");
    }

    @Override
    public void info(){
        System.out.println("This is gerbil"+individualfeature());
    }

    @Override
    public String individualfeature() {
        return super.individualfeature()+" and live in the fields";
    }

    @Override
    public void dispose() {
        System.out.println("Gerbil dispose");
        super.dispose();
    }
}

class Hamster extends Rodent{
    public Hamster() {
        System.out.println("Create hamster");
    }

    @Override
    public void info(){
        System.out.println("This is hamster"+individualfeature());
    }

    @Override
    public void dispose() {
        System.out.println("Hamster dispose");
        super.dispose();
    }

    @Override
    public String individualfeature() {
        return super.individualfeature()+" and big cheeks";
    }
}

class NewHamster extends Hamster{

}

class RodentTest{
    public static void main(String[] args) {
        Rodent [] rodent = {new Mouse(),new Gerbil(),new Hamster()};
        for (Rodent r:rodent
             ) {
            r.info();
            //r.dispose();
        }

//        NewHamster newHamster = new NewHamster();
//        newHamster.dispose();

    }
}
