package Polymorphism.Exercise1and17;

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
        //Cycle c = new Cycle();
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        Cycle[] cycles = {u,b,t};
        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
        cycles[2].ride();
        //checkriding(c);
        //checkriding(b);
        //checkriding(t);
        //checkriding(u);
      /*checkriding(new Unicycle());
      checkriding(new Cycle());
      checkriding(new Bicycle());
      checkriding(new Tricycle());*/
    }
}

