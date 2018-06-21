package saurabh.fifth.staticKeyword;
//Reference: https://stackoverflow.com/questions/413898/what-does-the-static-keyword-do-in-a-class
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
		StaticExample se1 = new StaticExample();//1
		StaticExample se2 = new StaticExample();//1
		StaticExample se3 = new StaticExample();//1
			StaticExample2 se21 = new StaticExample2();//1
			StaticExample2 se22 = new StaticExample2();//2
			StaticExample2 se23 = new StaticExample2();//3
			/*It means that only one instance of a static field exists[1] even if you create
			 * a million instances of the class or you don't create any. It will be shared 
			 * by all instances.*/
			StaticExample3 se31 = new StaticExample3();//0
			StaticExample3 se32 = new StaticExample3();//0
			StaticExample3 se33 = new StaticExample3();//0
		}
}