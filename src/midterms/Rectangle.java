package midterms;

public class Rectangle {
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {
		return 2*(height+width);
	}
}
