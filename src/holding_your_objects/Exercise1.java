package holding_your_objects;
/* Exercise 1: Create a new class called Gerbil with an int gerbilNumber that’s initialized in the constructor. 
 * Give it a method called hop( ) that displays which gerbil number this is, and that it’s hopping. Create an ArrayList 
 * and add Gerbil objects to the List. Now use the get( ) method to move through the List and call hop( ) for each Gerbil.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Gerbil{
	public static int counter = 1;
	public final int gerbilNumber;
	public Gerbil(){
		gerbilNumber = counter++;
	}
	void hop(){
		System.out.println("Gerbil #" + gerbilNumber + " is hopping!");
	}
}

public class Exercise1 {
	public static void main(String[] args) {
		ArrayList<Gerbil> gerbilList = new ArrayList<Gerbil>();
		for (int i=0; i<5; i++){
			gerbilList.add(new Gerbil());
		}
		Collections.addAll(gerbilList, new Gerbil(),new Gerbil(),new Gerbil(),new Gerbil());
		List <Object> obj = Arrays.asList(new Gerbil(),new Gerbil(), new Object());
		for (int i=0; i<gerbilList.size(); i++){
			(gerbilList.get(i)).hop();
			obj.get(i);
		}
	}
}

/* Output:
Gerbil #1 is hopping!
Gerbil #2 is hopping!
Gerbil #3 is hopping!
Gerbil #4 is hopping!
Gerbil #5 is hopping!
*/