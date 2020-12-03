package GUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Iterators {

	void printPairs(HashSet<Integer> vals) {
		System.out.println(vals.iterator());
		Iterator<Integer> vals2 = vals.iterator();
		int v = vals2.next();
		while (vals2.hasNext()) {
			v += vals2.next();
			System.out.println(v);
		}
	}

	public static void main(String[] args) {

		HashSet<Integer> vals = new HashSet<Integer>();
		vals.add(3);
		vals.add(4);
		vals.add(5);

		Iterator one = vals.iterator();
		Iterator two;
		Object blah;

		while (one.hasNext()) {
			blah = one.next();
			two = vals.iterator();
			while (two.hasNext()) {
				System.out.println(blah + ", " + two.next());
			}
		}

	}

}
