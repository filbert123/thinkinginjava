package Exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

public class Exercise1 {
    public void mainmethod() throws Exception{
        System.out.println("Throwing exception from main");
        throw new Exception("Exception");
    }

    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        try{
            exercise1.mainmethod();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        finally {
            System.out.println("Finally");
        }
    }
}

class Excercise2{
    public static void main(String[] args) {
        Object o = null;
        o.toString();
    }
}

class Exercise3{


    public static void main(String[] args) {
        Integer [] array = new Integer[10];
        for(int i = 0; i<11;i++){
            array[i] = i;
        }
    }
}

class Excercise4{

    public static void exceptiontest() throws MyCustomException{
        System.out.println("Throwing Exception from exeptiontest()");
        throw new MyCustomException("MyCustomException was thrown");
    }

    public static void main(String[] args) {
        try {
            exceptiontest();
        } catch (MyCustomException e) {
            e.printStackTrace();
        }
    }
}

class MyCustomException extends Exception{
    public MyCustomException(String message) {
        super(message);
    }
}

class Excercise5{
    public static void main(String[] args) {
       /* for(int i = 0;i<100;i++){
            try {
                Excercise4.exceptiontest();
            } catch (MyCustomException e) {
                e.printStackTrace();
            }
        }*/
       List<Excercise4> excercise4 = new ArrayList<Excercise4>();
       Iterator iterator = excercise4.iterator();
       for (int i = 1; i<=100;i++){
           excercise4.add(new Excercise4());
       }
        while(iterator.hasNext()) try {
            excercise4.iterator().next().exceptiontest();
            excercise4.remove(iterator());
        } catch (MyCustomException e) {
            e.printStackTrace();

        }
    }
}