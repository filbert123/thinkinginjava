package access;
import access.AccessTest.*;
import debugoff.Dbg;
import access.Collisions.List;

import static debugoff.Dbg.*;
public class AcessTest2 extends AccessTest3{
    int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    public static void main(String[] args) {
        AccessTest n = new AccessTest();
        //System.out.println(n.i);
        AcessTest2 ac2 = new AcessTest2();
        ac2.setI(4321);
        Dbg db = new Dbg();
        debug();
        List l = new List();
        //l.print();
        AcessTest2 acc = new AcessTest2();
        System.out.println(acc.prot);
        System.out.println(acc.pub);
        //System.out.println(acc.prv);
        System.out.println(acc.pkg);
    }
}
