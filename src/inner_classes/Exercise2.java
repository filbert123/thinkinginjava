package inner_classes;

interface Selector {
	boolean end();
	Object current();
	void next();
}

class Sequence {
	private Object[] items;
	private int next = 0;
	public Sequence(int size) { items = new Object[size]; }
	public void add(Object x) {
		if(next < items.length)
			items[next++] = x;
	}
	private class SequenceSelector implements Selector {
		private int i = 0;
		public boolean end() { return i == items.length; }
		public Object current() { return items[i]; }
		public void next() { if(i < items.length) i++; }
	}
	public Selector selector() {
		return new SequenceSelector();
	}
}


class Holder{
	String name;
	Holder(int name){
		this.name = Integer.toString(name);
	}
	public String toString(){
		return name;
	}
}

public class Exercise2 {
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for(int i = 0; i < 10; i++)
			sequence.add(new Holder(i));	//Changed to pass a new class Holder into the sequence
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.println(selector.current().toString() + " ");
			selector.next();
			}
	}
}