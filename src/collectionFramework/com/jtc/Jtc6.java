package collectionFramework.com.jtc;
/*
Jtc 6:Example using Linked.HashMap,TreeMap,Hashtable .
*/
import java.util.*; 
public class Jtc6 {
public static void main(String as[])
{
LinkedHashMap hm=new LinkedHashMap(); 
hm.put("sid",new Integer(99));
hm.put("sname","Som");
hm.put("fee",new Double(9000.99)); 
System.out.println(hm); hm.put("x","10");
hm.put(new Integer(99),"10"); 
System.out.println(hm); hm.put("x","20"); 
System.out.println(hm); 
hm.put(null,null); 
System.out.println(hm);
Hashtable ht=new Hashtable(); 
ht.put("sid",new Integer(99));
ht.put("sname","Som");
ht.put("fee",new Double(9000.99)); 
System.out.println(ht); 
ht.put("x","10");
ht.put(new Integer(99),"10"); 
System.out.println(ht); 
ht.put("x","20"); 
System.out.println(ht);
/*
ht.put("z",null); System.out.println(ht);
*/
/*
ht.put(null," s"); System.out.println(ht);
*/
TreeMap tm=new TreeMap(); 
tm.put("sid",new Integer(99));
tm.put("sname","Som");
tm.put("fee",new Double(9000.99)); 
System.out.println(tm); 
tm.put("x","10");
//tm.put(new Integer(99),"10"); 
System.out.println(tm); 
tm.put("x","20"); 
System.out.println(tm); 
tm.put("z",null); 
System.out.println(tm);
/*
tm.put(null,"s"); 
System.out.println(tm);
*/
}
}