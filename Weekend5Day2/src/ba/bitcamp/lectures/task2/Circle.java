package ba.bitcamp.lectures.task2;

public class Circle {
	// Attributes of Circle
	private Point points;
	private double radius;

	// Declaration the constructor
	public Circle(Point points, double radius) {
		super();
		this.points = points;
		this.radius = radius;
	}

	/**
	 * Method for get points
	 * 
	 * @return - points with coordinates x and y
	 */
	public Point getPoints() {
		return points;
	}

	/**
	 * Set entered points
	 * 
	 * @param points
	 *            - value of points
	 */
	public void setPoints(Point points) {
		this.points = points;
	}

	/**
	 * Method for get radius of circle
	 * 
	 * @return - radius of circle
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * Set entered radius
	 * 
	 * @param radius
	 *            - value of radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * Checking of intersect of two circle
	 * 
	 * @param c
	 *            - Circle one
	 * @param c1
	 *            - Circle two
	 * @return - boolean true if they intersect
	 */
	public static boolean Intersect(Circle c, Circle c1) {

		if (c.radius + c1.radius < c.getPoints().getDistance(c1.getPoints())) {
			return false;
		} else
			return true;
	}

	/**
	 * Method for printing to console of values of points and radius of circle
	 */
	public String toString() {
		return "Circle with " + points + " Radius of circle is " + radius + ".";
	}

}
