import java.awt.Color;

public class Marble extends PhysicalSphere {
	public String manufacturer = "";

	public Marble(double a_radius, double a_density, Color a_color) {
		super(a_radius, a_density);
		setColor(a_color);
	}
	
	public void setManufacturer(String a_manufacturer) {
		manufacturer = a_manufacturer;
	}
}