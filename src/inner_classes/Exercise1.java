package inner_classes;
class Outer{
	class Inner{
		Inner(){
			System.out.println("Inner class created");
		}
	}
	public Inner getInner(){
		return new Inner();
	}
}

public class Exercise1 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.getInner();
		Outer.Inner i = outer.getInner();	//Alternate usage
	}
}