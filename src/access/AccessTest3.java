package access;

public class AccessTest3 {
    private int prv = 1;
    protected int prot = 999;
    public int pub = 123;
    int pkg = 7;

}

class AccessTest4{
    public static void main(String[] args) {
        AccessTest3 act3 = new AccessTest3();
        act3.prot = 128;
        System.out.println(act3.prot);
    }
}
