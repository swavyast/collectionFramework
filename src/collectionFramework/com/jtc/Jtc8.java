package collectionFramework.com.jtc;

/*
Jtc 8: Example using Collections.
 */
import java.util.*;

public class Jtc8 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("bb");
		al.add("cc");
		al.add("dd");
		al.add("aa");
		// al.add(new Integer(99));
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		Collections.rotate(al, 1);
		System.out.println(al);
		Collections.swap(al, 1, 3);
		System.out.println(al);
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
		Collections.sort(al);
		System.out.println(Collections.binarySearch(al, " cc"));
		Collections.fill(al, "jtc");
		System.out.println(al);
		Vector v = new Vector();
		v.add("99");
		v.add("som");
		v.addElement("abc");
		System.out.println(v);
		Enumeration e = v.elements();
		List al1 = Collections.list(e);
		System.out.println(v);
		System.out.println(al1);
		al1 = Collections.unmodifiableList(al1);
		// al1.add("11");
		/**
		 * Exception in thread "main" java.lang.UnsupportedOperationException at
		 * java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1067)
		 * at collectionFramework.com.jtc.Jtc8.main(Jtc8.java:41)
		 **/
	}
}