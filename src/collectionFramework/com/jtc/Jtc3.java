package collectionFramework.com.jtc;

/*
Jtc 3: Example using Vector and LinkedList.
 */
import java.util.*;

public class Jtc3 {
	public static void main(String as[]) {
		Vector v = new Vector();
		v.add("99");
		v.add("som");
		v.addElement("som@jtc");
		v.addElement("som");
		System.out.println(v);
		Enumeration e = v.elements();
		System.out.println("forward order");
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		Iterator it = v.iterator();
		System.out.println("forward order");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		LinkedList ll = new LinkedList(v);
		ll.addFirst("11");
		ll.addLast("22");
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
	}
}
