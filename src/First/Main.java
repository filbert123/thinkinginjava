package First;
import java.util.Random;

import static com.company.Print.*;

public class Main {
    public static void main(String[] args) {
        /*ATypeName atn = new ATypeName();
        atn.setI(321);
        atn.setC('d');
        System.out.println(atn.getC());
        System.out.println(atn.getI());

        DataOnly don = new DataOnly();
        int i = don.i=555;
        boolean b = don.b = true;
        char c = don.c = 'd';
        double d = don.d = 2.0;

        System.out.println(i+" "+b+" "+c+" "+d);

        String s = "dasdadasdasd";
        System.out.println(storage(s));
        System.out.println("////////////////////////");
        System.out.println(StaticTest.i);
        Incrementable.incriment();
        System.out.println(StaticTest.i);
        Incrementable inc = new Incrementable();
        Incrementable inc2 = new Incrementable();
        inc2.incriment();
        StaticTest.d++;

        System.out.println(StaticTest.i);*/
/*
        Character ch = 'f';
        System.out.println(ch);
        ch = 'd';
        System.out.println(ch);*/
        //printArguments(6,4.5,'d');
        int a = 10 ; int b;
        System.out.println(a);
        b = a;
        System.out.println(b);

        a--;

        System.out.println(a);

        print("1+2");

        System.out.println(4%7);



    }
    static int storage (String s){
        return s.length()*2;
    }

    static void printArguments(int i, double d, char c){
        System.out.println(i+d+" "+c);
    }

}

class Tank {
    float level;
}
class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = (float) 9.66;
        t2.level = (float) 47.1;
        print("1: t1.level: " + t1.level +
                ", t2.level: " + t2.level);
        t1 = t2;
        print("2: t1.level: " + t1.level +
                ", t2.level: " + t2.level);
        t1.level = 27;
        print("3: t1.level: " + t1.level +
                ", t2.level: " + t2.level);
    }
}

class Letter {
    float c;
}
class PassObject {
    static void f(Letter y) {
        y.c = 'b';
    }
    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        print("1: x.c: " + x.c);
        f(x);
        print("2: x.c: " + x.c);
    }
}

class MathOps {
    public static void main(String[] args) {
// Create a seeded random number generator:
        Random rand = new Random(47);
        int i, j, k;
// Choose value from 1 to 100:
        j = rand.nextInt(100) + 1;
        print("j : " + j);
        k = rand.nextInt(100) + 1;
        print("k : " + k);
        i = j + k;
        print("j + k : " + i);
        i = j - k;
        print("j - k : " + i);
        i = k / j;
        print("k / j : " + i);
        i = k * j;
        print("k * j : " + i);
        i = k % j;
        print("k % j : " + i);
        j %= k;
        print("j %= k : " + j);
// Floating-point number tests:
        float u, v, w; // Applies to doubles, too
        v = rand.nextFloat();
        print("v : " + v);
        w = rand.nextFloat();
        print("w : " + w);
        u = v + w;
        print("v + w : " + u);
        u = v - w;
        print("v - w : " + u);
        u = v * w;
        print("v * w : " + u);
        u = v / w;
        print("v / w : " + u);
// The following also works for char,
// byte, short, int, long, and double:

    }
}

class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        print("i : " + i);
        print("++i : " + ++i); // Pre-increment
        print("i++ : " + i++); // Post-increment
        print("i : " + i);
        print("--i : " + --i); // Pre-decrement
        print("i-- : " + i--); // Post-decrement
        print("i : " + i);
    }
}
class Dog{
    String name;
    String says;
}

class DogTest{
    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        System.out.println(spot==scruffy);
        spot.name = "spot";
        spot.says = "Ruff!";
        scruffy.name="scruffy";
        scruffy.says="Wurf!";
        System.out.println(spot.equals(scruffy));
        Dog bob = scruffy;



        System.out.println("There is a dog named "+spot.name+" who says "+spot.says);
        System.out.println("There is a dog, named "+scruffy.name+" who says "+scruffy.says);
        System.out.println("//////////////");

        System.out.println(bob==scruffy);
    }
}


class CoinFlipping{
public static void main(String[]args){
                coinflipper();
        }
        private static void coinflipper(){

            boolean b = new Random().nextBoolean();
            if(b){
                System.out.println("Орел");
            }
            else {
                System.out.println("Решка");
            }
        }
        }
        class Literalz{
            public static void main(String[] args) {
                long n1 = 200L;
                long n2 = 200;
                //float f1 = 1e-43f;
                System.out.println(Long.toBinaryString(n1)+" "+Long.toBinaryString(n2));
                System.out.println(Float.MAX_VALUE);
                System.out.println(Float.MIN_VALUE);
                System.out.println(Double.MAX_VALUE);
                System.out.println(Double.MIN_VALUE);

            }

        }

        class Bitwise{
            public static void main(String[] args) {
                int a = 60;/* 60 = 0011 1100 */
                int b = 13;	/* 13 = 0000 1101 */
                int c = 0;
                System.out.println(Integer.toBinaryString(a));
                System.out.println(Integer.toBinaryString(b));
                c = a & b;        /* 12 = 0000 1100 */
                System.out.println("a & b = " + Integer.toBinaryString(c));
                c = a | b;        /* 61 = 0011 1101 */
                System.out.println("a | b = " + Integer.toBinaryString(c) );
                c = a ^ b;        /* 49 = 0011 0001 */
                System.out.println("a ^ b = " + Integer.toBinaryString(c) );
                c = ~a;           /*-61 = 1100 0011 */
                System.out.println("~a = " + Integer.toBinaryString(c) );
                c = a << 2;       /* 240 = 1111 0000 */
                System.out.println("a << 2 = " + Integer.toBinaryString(c) );
                c = a >> 2;       /* 15 = 1111 */
                System.out.println("a >> 2  = " + Integer.toBinaryString(c) );
                c = a >>> 2;      /* 15 = 0000 1111 */
                System.out.println("a >>> 2 = " + Integer.toBinaryString(c) );


            }
        }

        class ShiftOperators{
            public static void main(String[] args) {
                int hexValue1 = 0x100;
                int hexValue2 = 0x101;
                System.out.println(Integer.toBinaryString(hexValue1));
                System.out.println(Integer.toBinaryString(hexValue2));
                System.out.println(Integer.toBinaryString(hexValue1<<hexValue2));
                chartobinary('a');
            }
            static void chartobinary(char c){
                int b = (int) c;
                System.out.println(b);
                System.out.println(Integer.toBinaryString(b));
            }
        }

class TernaryIfElse {
    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }
    static int standardIfElse(int i) {
        if(i < 10)
            return i * 100;
        else
            return i * 10;
    }
    public static void main(String[] args) {
        System.out.println(ternary(9));
        System.out.println(ternary(10));
        System.out.println(standardIfElse(9));
        System.out.println(standardIfElse(10));
        String s = "abc";
        String s2 = "abc";
        System.out.println(s==s2);

        int i = 0;

        while(1==1){
            i++;
            if(i==99){
                System.out.println(i);
                break;
            }
        }

    }
}

class LoopsTest {
    static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.print(result + ", ");
        return result;
    }

    static int numofsymbols(String s, char c) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == c) {
                num++;
            }
        }
        return num;
    }

    static void onetohundred() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    static void somerandoms() {
        Random rn = new Random();
        int newInt = 0;
        int oldInt = 0;

        for (int i = 0; i < 25; i++) {
            int num = rn.nextInt();
            if (num > oldInt) {
                oldInt = num;
                newInt = oldInt;
                System.out.println(i + " " + num + " greater than oldInt");
            } else {
                oldInt = newInt;
                newInt = num;
                System.out.println(i + " " + num + " less than oldInt");
            }
        }
    }

    static void somerandomsnew() {
        Random rn = new Random();
        int newInt = 0;
        int oldInt = 0;
        while (true) {
            int num = rn.nextInt();
            if (num > oldInt) {
                oldInt = num;
                newInt = oldInt;
                System.out.println(num + " greater than oldInt");
            } else {
                oldInt = newInt;
                newInt = num;
                System.out.println(num + " less than oldInt");
            }
        }
    }

    static void isprime() {
        for (int i = 1; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }

    static int n1=0,n2=1,n3=0;
    static void Fibonacci(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            Fibonacci(count-1);
        }
    }
    public static void main(String[] args) {
/*        while(condition())
            System.out.println("Inside ‘while’");
        System.out.println("Exited ‘while’");*/

//String s = "abcaabdgggad";
//        System.out.println(numofsymbols(s,'a'));
//        System.out.println("//////////");

        //onetohundred();
        //somerandomsnew();
//        isprime();
//        Random r = new Random();
//        float f[] = new float[10];
//        for (int i = 0;i<10;i++){
//            f[i] = r.nextFloat();
//        }
//
//        for (float x:
//             f) {
//            System.out.println(x);
//        }

//        for(int i = 1;i<=100;i++){
//            if(i==91){
//                return;
//            }
//            System.out.println(i);
//        }
        //System.out.println(1%4);
/*
for (int i = 96;i<=122;i++){
    System.out.println((char)i);
}
*/
        for (int i = 0; i < 3; i++){
            switch (i) {
                case 0:
                    System.out.println("this is i " + i);
                case 1:
                    System.out.println("this is i " + i);
                case 2:
                    System.out.println("this is i " + i);
                    default:
                        System.out.println(i);
            }
        }


        Fibonacci(20);


    }
}