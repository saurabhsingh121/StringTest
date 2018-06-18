package saurabh.sixth.abstraction;

public class Circle extends Shape{
	
	double radius;
	public Circle(String color, double radius) {
		super(color);
		System.out.println("Circle constructor is called");
		this.radius = radius;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(this.radius, 2);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle color is "+ super.color+ " and area is: "+ area();
	}

}
