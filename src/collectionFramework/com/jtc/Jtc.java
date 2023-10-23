package collectionFramework.com.jtc;

/* Jtc 1: Example using Collection interface. */

import java.util.*;

public class Jtc {
	public static void main(String as[]) {
		ArrayList al = new ArrayList();
		System.out.println(al);

		System.out.println(al.size());
		System.out.println(al.isEmpty());
		al.add(new Integer(99));
		al.add("som");
		al.add("som@jtc");
		al.add(new Long(11111));
		System.out.println(al);
		System.out.println(al.size());
		al.add("123");
		al.add(new Double(999.99));
		System.out.println(al.isEmpty());
		Object[] obj = al.toArray();
		System.out.println(obj.length);
		System.out.println("printing directly");
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		System.out.println("checking and casting");
		for (int i = 0; i < obj.length; i++) {
			Object o = obj[i];
			if (o instanceof String) {
				String str = (String) o;
				System.out.println(str);
			} else if (o instanceof Integer) {
				Integer in = (Integer) o;
				System.out.println(in);
			} else if (o instanceof Double) {
				Double d = (Double) o;
				System.out.println(d);
			}
		}
		Iterator it = al.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		System.out.println(al.contains("som"));
		System.out.println(al.contains(" jtc"));
		System.out.println(al);
		al.add("l23");
		System.out.println(al);
		al.remove("123");
		System.out.println(al);

		ArrayList all = new ArrayList();
		all.add("aa");
		all.add("bb");
		all.add("cc");
		all.add("dd");
		System.out.println(all);
		System.out.println(al);
		System.out.println(al.size());
		// al.add(all);
		al.addAll(all);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.containsAll(all));
		System.out.println(al);
		/*
		 * al.removeAII(all); System.out.println(al);
		 */
		al.retainAll(all);
		System.out.println(al);
		al.clear();
		System.out.println(al);
	}
}
