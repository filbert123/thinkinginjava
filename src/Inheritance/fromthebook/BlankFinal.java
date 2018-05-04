package Inheritance.fromthebook;

public class BlankFinal {
    private final int i;
    private final BlankFinal b;
    BlankFinal(){
        i = 123;
        b = new BlankFinal();
    }



    public static void main(String[] args) {
        BlankFinal bf = new BlankFinal();
        System.out.println(bf.i);
    }



}



final class Final{
    int i = 0;
    int j = 1;

    public static void main(String[] args) {
        Final f= new Final();

        System.out.println(f.i);
    }
}

//class Finalz extends Final{}
