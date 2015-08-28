import java.util.Scanner;

public class AreaCalc {

	public static void main(String[] args) {

		System.out
				.println("Which shape's area is to be calculated? (circle, square, triangle)");
		Scanner s = new Scanner(System.in);
		String type = s.next();
		Shape shape = null;
		switch (type) {
		case "circle":
			shape = new Circle();
			break;
		case "square":
			shape = new Square();
			break;
		case "triangle":
			shape = new Triangle();
			break;
		default:
			System.out.println("Invalid choice");
			System.exit(0);
		}
		shape.displayArea();

	}
}

abstract class Shape {
	String unit;

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public void setUnit() {
		unit = "unit";
	}

	public void displayArea() {
		System.out.print("\nThe area is: " + calcArea() + " " + unit + " sq.");
	}

	abstract public void setDim();

	abstract public double calcArea();

}

class Square extends Shape {
	double side;

	Square() {
		setDim();
	}

	public void setDim() {

		System.out
				.println("Enter the side of the square and unit of measurement(put . if unit unspecified)");
		Scanner s = new Scanner(System.in);
		side = s.nextDouble();
		String unit = s.next();
		if (unit.equals(".")) {
			setUnit();
		} else {
			setUnit(unit);
		}

		s.close();

	}

	public double calcArea() {
		double area = side * side;
		return area;

	}
}

class Circle extends Shape {
	double radius;

	Circle() {
		setDim();
	}

	public void setDim() {

		System.out
				.println("Enter the radius of the circle and unit of measurement(put . if unit unspecified)");
		Scanner s = new Scanner(System.in);
		radius = s.nextDouble();
		String unit = s.next();
		if (unit.equals(".")) {
			setUnit();
		} else {
			setUnit(unit);
		}
		s.close();
	}

	public double calcArea() {
		double area = Math.PI * radius * radius;
		return area;
	}
}

class Triangle extends Shape {
	double base;
	double height;

	Triangle() {
		setDim();
	}

	public void setDim() {

		System.out
				.println("Enter the base and height of the triangle and unit of measurement(put . if unit unspecified)");
		Scanner s = new Scanner(System.in);
		base = s.nextDouble();
		height = s.nextDouble();
		String unit = s.next();
		if (unit.equals(".")) {
			setUnit();
		} else {
			setUnit(unit);
		}
		s.close();
	}

	public double calcArea() {
		double area = (1 / 2.0) * base * height;
		return area;
	}
}
