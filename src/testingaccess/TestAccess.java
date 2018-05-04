package testingaccess;
import access.AcessTest2;

public class TestAccess {
    public static void main(String[] args) {
        AcessTest2 ac = new AcessTest2();
        ac.setI(654654);
        System.out.println(ac.getI());
    }
}
