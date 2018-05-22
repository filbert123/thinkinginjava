package inner_classes;


class Outered{
	private String label;	//Private String field (initialized by the constructor)
	Outered(){
		label="Outered label";
	}
	class Innered{
		Innered(){
			System.out.println("Innered class created");
			
		}
		public String toString(){		//toString( ) that displays private String field
			return label;
		}
	}
	public Innered getInnered(){
		return new Innered();
	}
}

public class Exercise3 {
	public static void main(String[] args) {
		Outered outered = new Outered();
		Outered.Innered i = outered.getInnered();
		System.out.println(i.toString());
	}
}