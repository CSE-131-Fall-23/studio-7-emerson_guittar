package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class objectPractice {
	
	private double width;
	private double length;
	
	
	public objectPractice(double width, double length) {
		this.width = width;
		this.length = length;
	}
	public double Area() {
		return this.width * this.length;
	}
	public double Perimeter() {
		return 2*this.width + 2*this.length;
	}
	public boolean isSquare() {
		boolean isSquare;
		if (width == length) {
			isSquare = true;
		}
		else {
			isSquare = false;
		}
		return isSquare;
	}
	public boolean isSmaller(objectPractice x) {
		boolean isSmaller;
		if(x.Area() < this.Area()) {
			isSmaller = false;
		}
		else {
			isSmaller = true;
		}
		return isSmaller;
	}
	public void Draw() {
		StdDraw.filledRectangle(0.5, 0.5, width/2, length/2);
	}
	public static void main(String[] args) {
		objectPractice rectangle = new objectPractice(5,8);
		System.out.println("Area:"+ rectangle.Area());
		System.out.println("Perimeter:"+ rectangle.Perimeter());
		System.out.println("Is it a Square?:"+ rectangle.isSquare());
		System.out.println("Is it smaller?:"+ rectangle.isSmaller(new objectPractice(3,4)));
	}
		
	

}
