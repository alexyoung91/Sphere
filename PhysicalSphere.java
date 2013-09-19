/*
 * Incomplete, not functional yet
 */

public class PhysicalSphere extends Sphere {
	private double density;
	private double mass;
	private Color color;
	
	public PhysicalSphere(double a_radius, double a_density) {
		super(a_radius);
		setDensity(a_density);
	}
	
	public void setDensity(double a_density) {
		density = a_density;
		mass = volume * density;
	}
	
	public void setColor(Color a_color) {
		color = a_color;
	}
	
	public double getDensity() {
		return density;
	}
	
	public double getMass() {
		return mass;
	}
	
	
}