package saurabh.third.stringbuffer;

public class StringBufferTest {
	public static void main(String[] args) {
		//java.lang.StringBuffer extends or inherits from Object class
		//All Implemented Interfaces of StringBuffer class:Serializable, Appendable, CharSequence.
		
		StringBuffer sb = new StringBuffer("");
		StringBuffer sb1 = new StringBuffer(25);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		//Testing append method
		StringBuffer sb3 = new StringBuffer("Saurabh ");
		sb3.append("Singh");
		System.out.println(sb3);
		//Testing insert method
		sb3.insert(8, "Kumar ");
		System.out.println(sb3);
		sb3.insert(8, 41.35f);
		System.out.println(sb3);
		char char_arr[] = { 'g', 'o', 'l', 'u', 'a' };
		sb3.insert(24, char_arr);
		System.out.println(sb3);
		//Calling reverse method
	    sb3.reverse();
	    System.out.println(sb3);
	    sb3.reverse();
	    //Calling delete and deletecharAt method
	    sb3.delete(0, 5);
	    System.out.println(sb3);
	    sb3.deleteCharAt(16);
	    System.out.println(sb3);
	    //Calling replace method
	    sb3.replace(5, 6, "Great");
	    System.out.println(sb3);
	    sb3.ensureCapacity(24);
	    System.out.println(sb3.capacity());
		/*
		 * StringBuilder: J2SE 5 adds a new string class to Java’s already powerful
		 * string handling capabilities. This new class is called StringBuilder. It is
		 * identical to StringBuffer except for one important difference: it is not
		 * synchronized, which means that it is not thread-safe. The advantage of
		 * StringBuilder is faster performance. However, in cases in which you are using
		 * multithreading, you must use StringBuffer rather than StringBuilder.
		 */
	}
}
