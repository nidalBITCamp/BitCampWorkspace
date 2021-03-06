package ba.bitcamp.lectures.task2;

public class Main {

	public static void main(String[] args) {
		// Declaration new Points
		Point a = new Point(5, 5);
		Point b = new Point(9, -3);
		// Print to console coordinate of points
		System.out.println(a);
		System.out.println(b);
		// Calculated the distance between two point and printing
		System.out
				.println("Distance between two point is: " + a.getDistance(b));
		// Declaration new Point and printing to console
		Point c = new Point(-5, 5);
		System.out.println(c);
		// Calculated the distance between two point and printing
		System.out
				.println("Distance between two point is: " + a.getDistance(c));
		System.out
				.println("Distance between two point is: " + c.getDistance(b));
		// Declaration new circle with point a and radius 4 and printing to
		// console
		Circle c1 = new Circle(a, 4);
		System.out.println(c1);
		// Declaration new circle with point b and radius 5 and printing to
		// console
		Circle c2 = new Circle(b, 2);
		System.out.println(c2);
		// Claim of intersect two circle
		System.out.println("The claim that two entered circle is intersect is "
				+ Circle.Intersect(c1, c2));

	}

}
