package collectionFramework.com.jtc;
import java.util.*;
import java.io.*;
/* Jtc 14: Example using ResourceBundle and properties.
 */
public class Jtc14 {
public static void main(String[] args) throws Exception, IOException { 
	Properties p = new Properties();
FileInputStream fis = new FileInputStream("data.properties"); 
p.load(fis);
Enumeration en= p.propertyNames(); 
while (en.hasMoreElements()) {
String key = (String) en.nextElement(); 
System.out.println(key + "\t" + p.getProperty(key));
}
fis.close();
System.out.println("H\tHindi"); 
System.out.println("E\tEnglish"); 
System.out.println("Enter Language Code"); 
char ch= (char) System.in.read();
ch= Character.toUpperCase(ch); 
Locale loc = new Locale("en", "IN"); 
if (ch == 'H')
loc = new Locale("hi", "IN"); 
else if (ch== 'E')
loc = new Locale("en", "IN"); 
else
System.out.println("Not valid Option, Reading English Language");
System.out.println("\n---- Resource Bundle----");
System.out.println(loc);
ResourceBundle rb = ResourceBundle.getBundle("data", loc); Enumeration enl = rb.getKeysQ;
while (enl.hasMoreElements()) { String ky = (String) enl.nextElement();
System.out.println(ky + "\t" + rb.getString(ky));
}
System.out.println("\n---- Reading specific key value--"); String val = rb.getString("sid"); 
System.out.println("Value o:t\t:" + val);
}
}

		data.properties
		sid=9876 [ENG]
		name=SomPrakash [ENG] 
		email=som@jtcindia.org [ENG] 
		phone=45133258 [ENG]

		data hi.properties
		sid=9876 [HND]
		name=SomPrakash [HND] 
		email=som@jtcindia.org [HND] 
		phone=45133258[HND]
}

