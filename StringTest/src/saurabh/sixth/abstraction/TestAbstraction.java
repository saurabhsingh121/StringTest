package saurabh.sixth.abstraction;

public class TestAbstraction{
	public static void main(String[] args) {
		Shape a = new Circle("Red", 2.2);
		Shape b = new Rectangle("Blue", 5, 3);
		System.out.println(a.toString());
		System.out.println(b.toString());
	}
}
