package collectionFramework.com.jtc;

/*
 * Jtc 7: Example using Comparator and Comparable .
 * */
import java.util.*;

class Student implements Comparable {
	int sid;
	String sname;
	String email;

	Student(int sid, String sname, String email) {
		this.sid = sid;
		this.sname = sname;
		this.email = email;
	}

	public String toString() {
		return "" + sid + "\t" + sname + "\t" + email;
	}

	public boolean equals(Object o) {
		Student s = (Student) o;
		if (this.sid == s.sid)
			return true;
		return false;
	}

	public int compareTo(Object o) {
		Student s = (Student) o;
		return this.sid - s.sid;
	}
}

class SnameComparator implements Comparator {
	public int compare(Object ol, Object o2) {
		Student sl = (Student) ol;
		Student s2 = (Student) o2;
		return sl.sname.compareTo(s2.sname);
	}
}

class EmailComparator implements Comparator {
	public int compare(Object ol, Object o2) {
		Student sl = (Student) ol;
		Student s2 = (Student) o2;
		return sl.email.compareTo(s2.email);
	}
}

class Jtc7 {
	public static void main(String as[]) {
		ArrayList al = new ArrayList();
		Student sl = new Student(22, "dd", "cc@jtc");
		Student s2 = new Student(44, "aa", "bb@jtc");
		Student s3 = new Student(11, " cc", " dd@jtc");
		Student s4 = new Student(33, "bb", "aa@jtc");
		al.add(sl);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println("No Sorting");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s);
		}
		System.out.println("Sorting by Sid");
		Collections.sort(al);
		it = al.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s);
		}
		System.out.println("Sorting by Sname");
		Collections.sort(al, new SnameComparator());
		it = al.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s);
		}
		System.out.println("Sorting by Email");
		Collections.sort(al, new EmailComparator());
		it = al.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s);
		}
	}
}
