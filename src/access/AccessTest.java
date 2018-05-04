package access;


import java.util.ArrayList;

public class AccessTest {
    access.AcessTest2 m = new access.AcessTest2();
    int i = m.i = 123;
    public static void main(String[] args) {
        java.util.ArrayList list = new java.util.ArrayList();
        ArrayList li = new ArrayList();
        li.add("123");
        li.add(123);
        //System.out.println(li.isEmpty());
        access.AcessTest2 m = new access.AcessTest2();
        int i = m.i = 123;
        m.setI(333);
        System.out.println(m.i);

    }
}
