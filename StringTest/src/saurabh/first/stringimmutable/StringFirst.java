package saurabh.first.stringimmutable;

import java.util.HashMap;

public class StringFirst {
 public static void main(String[] args) {
	String a = new String("Saurabh");
	String b = new String("Saurabh");
	System.out.println(a.equals(b));
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	HashMap<String, String> map = new HashMap<String, String>();
	map.put(new String("name"), "saurabh");
	System.out.println(new String("name").hashCode());
	String str = map.get(new String("name"));
	System.out.println(new String("name").hashCode());
	System.out.println(str);
	
			
}
}
