/*
 * Incomplete, not functional yet
 */

public class PhysicalSphere extends Sphere {
	private double density;
	private double mass;
	private double radius;
	private int color;
	
	public PhysicalSphere(double a_radius, double a_density) {
		super(a_radius);
		setDensity(a_density);
	}
	
	public void setDensity(double a_density) {
		density = a_density;
		mass = volume * density;
	}
	
	public void setRadius(double a_radius) {
		radius = a_radius;
	}
	
	public double getDensity() {
		return density;
	}
	
	public double getMass() {
		return mass;
	}
	
	public void setColor(int a_color) {
		color = a_color;
	}
	
	public void hello()
	{
		System.out.println("Hello");
	}
	
	public void SqeeuzeThatJuiceSir() {
		System.out.println("It has been squeezed!");
	}
	
	public void randomFunction()
	{
		double a = 1;
	}
	
}