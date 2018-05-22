package holding_your_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
public class Exercise12 {
	
	public static void fill(List<Integer> c){
		Random rand = new Random();
		for(int i = 0; i <5; i++)
			c.add(rand.nextInt(9));
	}	
	
	public static void reversefill(List<Integer> from, List<Integer> to){
		ListIterator<Integer> liFrom = from.listIterator(from.size());
				while(liFrom.hasPrevious())
					to.add(liFrom.previous());
	}
	public static void main(String[] args) {
		
		/*List<Integer> linteger1 = new ArrayList<Integer>();
		fill(linteger1);
		List<Integer> linteger2 = new ArrayList<Integer>(5);

		reversefill(linteger1, linteger2);
		System.out.println(linteger1);
		System.out.println(linteger2);*/

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for(int i = 0; i<10; i++){
			list.add(i);
		}
		//System.out.println(list.size());
		ListIterator<Integer> li = list.listIterator(list.size());

		while(li.hasPrevious())
			list2.add(li.previous());
		System.out.println(list);
		System.out.println(list2);
	}
}