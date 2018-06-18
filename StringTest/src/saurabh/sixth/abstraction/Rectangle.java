package saurabh.sixth.abstraction;

public class Rectangle extends Shape{
	double length;
	double width;
	public Rectangle(String color, double length, double width) {
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}
	@Override
	double area() {
		return this.width * this.length;
	}

	@Override
	public String toString() {
		return "Rectangle color is " + super.color + 
                "and area is : " + area();
	}

}
