package Polymorphism;

public class FirstClass {
    private String name;
    private int num;

    public FirstClass(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public void sendmessage(){
        System.out.println(getName()+" "+getNum());
    }
}
