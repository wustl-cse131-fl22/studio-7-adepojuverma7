package studio7;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getArea() {
		double area = length * width;
		return area;
	}
	
	public Boolean isSquare() {
		if (length == width) {
			return true;
		}
		else {
			return false;
		}
	}

public static void main(String[] args) {
	Rectangle test = new Rectangle(5,5);
	System.out.println(test.getArea());
	System.out.println(test.isSquare());
	}
}
