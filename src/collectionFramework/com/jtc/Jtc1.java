package collectionFramework.com.jtc;

import java.util.Collection;

public class Jtc1 {
	class Inner_Class implements Runnable{
		public void run() {System.out.println("Run method inside Inner_Class implementing Runnable interface");
		Runnable r1=new Runnable(){
			public void run(){
				System.out.println("Run Method inside method local inner class Inner_Class$1");
			}
		};
		System.out.println(r1);
		r1.run();
		//run(); /* Recursion */
		System.out.println(r1.getClass().getName());
		}
	}
	Inner_Class ic=new Inner_Class();
	static class Static_Inner_Class{
		public void main() {
			class Method_Local_Inner_Class{
				public void run() {
					class Nested_Method_Local_Inner_Class{
						Thread t1=new Thread("Hello");
					}
					Nested_Method_Local_Inner_Class nmic=new Nested_Method_Local_Inner_Class();
					Class c=nmic.t1.getClass();
					//System.out.println(c);
				}
				private Method_Local_Inner_Class(){}
			}
			Method_Local_Inner_Class mlic=new Method_Local_Inner_Class();
			mlic.run();
		}
	}

	public static void main(String[] args) {
		Static_Inner_Class sic=new Static_Inner_Class();
		sic.main();
		Jtc1 j=new Jtc1();
		j.ic.run();
		//System.out.println(j.ic);
	}

}
