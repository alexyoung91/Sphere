public class Sphere {
	private double radius;
	private double volume;

	public Sphere() {
		radius = volume = 0.0;
	}
	
	public Sphere(double a_radius) {
		radius = a_radius;
	}
	
	public void setRadius(double a_radius) {
		radius = a_radius;
	}
	
	public double getRadius() {
		return radius;
	}
}
