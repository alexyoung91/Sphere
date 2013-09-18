public class Sphere {
	private double radius;
	private double volume;
	private double surfaceArea;

	public Sphere() {
		radius = volume = surfaceArea = 0.0;
	}
	
	public Sphere(double a_radius) {
		radius = a_radius;
		volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
	}
	
	public void setRadius(double a_radius) {
		radius = a_radius;
		volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
	}
	
	public void setVolume(double a_volume) {
		volume = a_volume;
		radius = Math.cbrt(volume / ((4.0 / 3.0) * Math.PI));
		surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
	}
	
	public void setSurfaceArea(double a_surfaceArea) {
		surfaceArea = a_surfaceArea;
		radius = Math.sqrt(surfaceArea / (4 * Math.PI));
		volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getVolume() {
		return volume;
	}
	
	public double getSurfaceArea() {
		return surfaceArea;
	}
}
