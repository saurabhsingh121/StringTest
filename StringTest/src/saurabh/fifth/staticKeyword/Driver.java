package saurabh.fifth.staticKeyword;

class StaticExample {
	int count = 0;
	StaticExample() {
		count++;
		System.out.println(count);
	}
}
class StaticExample2{
	static int count = 0;
	StaticExample2() {
		count++;
		System.out.println(count);
	}
}
class StaticExample3{
	static final int count = 0;
	StaticExample3() {
		//Remove final modifier to do increment on count
		//count++;
		System.out.println(count);
	}
}
public class Driver{
	public static void main(String[] args) {
		StaticExample se1 = new StaticExample();
		StaticExample se2 = new StaticExample();
		StaticExample se3 = new StaticExample();
			StaticExample2 se21 = new StaticExample2();
			StaticExample2 se22 = new StaticExample2();
			StaticExample2 se23 = new StaticExample2();
			StaticExample3 se31 = new StaticExample3();
			StaticExample3 se32 = new StaticExample3();
			StaticExample3 se33 = new StaticExample3();
		}
}