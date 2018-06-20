package saurabh.first.stringimmutable;

import java.lang.reflect.Field;

public class StringImmutabilityExample {
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		String string = "Jansatta";
		System.out.println("HashCode before Manipulation"+string.hashCode());
		Class<String> type = String.class;
		Field field = type.getDeclaredField("value");
		field.setAccessible(true);
		
		char[] value = (char[]) field.get(string);
		value[0] = 'M';
		System.out.println(string);
		System.out.println("HashCode after Manipulation"+string.hashCode());
	}

}
