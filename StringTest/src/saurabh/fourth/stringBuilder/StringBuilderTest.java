package saurabh.fourth.stringBuilder;

public class StringBuilderTest {
public static void main(String[] args) {
	StringBuilder sb = new StringBuilder("Hello ");
	sb.append("World!");
	System.out.println(sb);
	sb.setLength(154);
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	
	//Calling insert method
	StringBuilder sb2 = new StringBuilder("HellWorld!");
	sb2.insert(4, "o ");
	System.out.println(sb2.hashCode() == sb.hashCode());
	System.out.println(sb2);
	//calling reverse method
	sb2.reverse();
	System.out.println(sb2);
	
	//calling delete method
	StringBuilder sb3 = new StringBuilder("My name is anthony gonjalvis");
	sb3.delete(5, 9);
	System.out.println(sb3);
	
	//checking the role of capacity method
	StringBuilder sb4 = new StringBuilder();
	System.out.println(sb4.capacity());
	sb4.append("I am using string bulider class for the first time");
	System.out.println(sb4.capacity());
	
	//calling the ensureCapacity method
	System.out.println();
	StringBuilder sb5 = new StringBuilder();
	System.out.println(sb5.capacity());
	sb5.append("Java StringBuilder Class!");
	System.out.println(sb5.capacity());
	sb5.ensureCapacity(12);
	System.out.println(sb5.capacity());
	sb5.ensureCapacity(60);
	System.out.println(sb5.capacity());
}
}
