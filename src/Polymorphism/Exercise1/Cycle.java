package Polymorphism.Exercise1;

public class Cycle {
    public void ride(){

        System.out.println("Bike is riding "+wheels()+" wheels");
    }

    public int wheels(){
        return 2;
    }

    public static void checkriding(Cycle c){
        c.ride();
    }

    public static void main(String[] args) {
      /*  Cycle c = new Cycle();
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        checkriding(c);
        checkriding(b);
        checkriding(t);
        checkriding(u);*/
      checkriding(new Unicycle());
      checkriding(new Cycle());
      checkriding(new Bicycle());
      checkriding(new Tricycle());

      Cycle c= new Cycle();
    }
}

