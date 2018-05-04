package ChapterFourObjects;

public class Test {
    public Test() {
        System.out.println("This is def constructor");
    }
    public Test(String s){
        System.out.println("This is overloaded constructor with string "+s);
    }

    public static void main(String[] args) {
        Test t = new Test();
        Test t2 = new Test("123");

    }
}

class Dog{
    public Dog() {
        //this("123",23);
        System.out.println("Dog is barking by default");
        this.finalize();

    }
    public Dog(int i){
        System.out.println("Dog is barking differently with int");
    }
    public Dog (char c){
        System.out.println("Dog is barking differently with char");
    }
    public Dog (String s){
        System.out.println("Dog is barking differently with string "+s);
    }

    public Dog (String s, int i){
        System.out.println("Dog is barking differently with string and int");
    }
    public Dog (int i, String s){
        System.out.println("Dog is barking differently with int and string");
    }
    public void bark(){
        bark2();
        this.bark2();
    }
    public void bark2(){
        System.out.println("Bark!");
    }
    protected void finalize(){
        System.out.println(this+"Finalized");
    }

    @Override
    public String toString() {
        return "Dog{}";
    }

    public static void main(String[] args) {
////        Dog d1 = new Dog();
////        Dog d2 = new Dog(1);
////        Dog d3 =new Dog('g');
//       Dog d4 =new Dog("dasdad");
////        Dog d5 =new Dog(1,"dasd");
////        Dog d6 = new Dog("dasdasd",55);
////        new Dog();
////        System.gc();
////        //new Dog().bark2();
//        String [] s = new String[]{
//                "123",
//                "43242",
//                "124214",
//        };
//
//        Dog[] d = new Dog[]{
//          new Dog("123"),
//          new Dog("4214214"),
//          new Dog("21312"),
//        };
//        //System.out.println(s.length);
//
//        for (int i =0 ;i<s.length;i++){
//            System.out.println(s[i]);
//
        for (Enums e:Enums.values()
             ) {
            System.out.println(e+" ordinal "+e.ordinal());
        }



    }
    enum Money {
        ONE_DOLLAR, TWO_DOLLAR, FIVE_DOLLAR, TEN_DOLLAR, TWENTY_DOLLAR;

        public void choose(Money money) {
            switch (money) {
                case ONE_DOLLAR:
                    System.out.println("One Dollar");
                    break;
                case TWO_DOLLAR:
                    System.out.println("Two Dollars");
                    break;
                case FIVE_DOLLAR:
                    System.out.println("Five Dollars");
                    break;
                case TEN_DOLLAR:
                    System.out.println("Ten Dollars");
                    break;
                case TWENTY_DOLLAR:
                    System.out.println("Twenty Dollars");
            }
        }


    }
}
