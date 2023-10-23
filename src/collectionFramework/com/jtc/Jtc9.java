package collectionFramework.com.jtc;
/*
 * Jtc 9: Example using Arrays .
 */
import java.util.*; 
public class Jtc9 {
public static void main(String[] args) { 
	int arr[] ={ 10, 45, 25, 6, 78, 12, 21 };
int arrl[] ={10,45,25, 6, 78, 12, 21 };
int arr2[] ={ 10, 45, 85, 45, 12, 78,896 };
for (int i= 0; i < arr.length; i++) { 
	System.out.print(arr[i] + "\t");
}
for (int i = 0; i < arrl.length; i++) { 
	System.out.print(arrl[i] + "\t");
}
for (int i= 0; i < arr2.length; i++) { 
	System.out.print(arr2[i]+ "\t");
}
System.out.println("\n******* arr After sorting******"); 
Arrays.sort(arr);
for (int i= 0; i < arr.length; i++) { 
	System.out.print(arr[i] + "\t");
}
System.out.println(); 
System.out.println(Arrays.binarySearch(arr, 6));
System.out.println(Arrays.binarySearch(arr, 9)); 
System.out.println(Arrays.equals(arr, arrl)); 
System.out.println(Arrays.equals(arr,arr2)); 
Arrays.fill(arr, 32);
for (int i = 0; i < arr.length; i++) { 
	System.out.print(arr[i] + "\t");
}
Object ob[]={ "jtc", "india", "som", "rai", "white", "red"}; 
for(int i= 0; i < ob.length; i++) {
System.out.print(ob[i] + "\t");
}
System.out.println();
List list = Arrays.asList(ob); 
Iterator it= list.iterator(); 
while (it.hasNext()) {
System.out.print(it.next()+ "\t");
}
System.out.println(); 
Arrays.sort(ob);
for (int i=0; i < ob.length; i++) { 
	System.out.print(ob[i] + "\t");
}
System.out.println();
}
}