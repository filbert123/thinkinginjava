package Inheritance.fromthebook;

public class Human {
void makeasound(String sound){
    System.out.println(sound);
}
void makeasound(char c){
    System.out.println(c);
}

    void makeasound(Language lang){
        System.out.println(lang);
    }


}

class Language{}

class Baby extends Human{
    void makeasound(char c, char b){
        System.out.println("agu");
    }

}

class TestAll{
    public static void main(String[] args) {
        Baby b = new Baby();
        b.makeasound(new Language());
        b.makeasound('f');
        b.makeasound("dasdasdd");
        b.makeasound('d','s');
    }
}
