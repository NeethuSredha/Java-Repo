package assignment4;

public class AreaOfFigures {

	public double area(float radius) {
		double areaOfCircle = 3.14 * radius * radius;
		return areaOfCircle;
	}

	public double area(double length, double breadth) {
		double areaOfRectangle = length * breadth;
		return areaOfRectangle;
	}

	public double area(double side) {
		double areaOfSquare = side * side;
		return areaOfSquare;
	}

	public static void main(String[] args) {
		AreaOfFigures areaOfFigures = new AreaOfFigures();
		double area1 = areaOfFigures.area(5.5f);
		System.out.println("Area of circle with radius 5.5 is : " + area1 + "\n");
		double area2 = areaOfFigures.area(10.0, 5.0);
		System.out.println("Area of rectangle with length 10.0 and breadth 5.0 is : " + area2 + "\n");
		double area3 = areaOfFigures.area(10.0);
		System.out.println("Area of square with side 10.0 is : " + area3);
	}

}
