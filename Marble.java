import java.awt.Color;

public class Marble extends PhysicalSphere {
	public String manufacturer = "default";

	public int x = 0;
	public int y = 0;
	public int z = 0;

	public String hello = "Hello";
	public String goodbye = "Goodbye";

	public Marble(double a_radius, double a_density, Color a_color, String a_manufacturer) {
		super(a_radius, a_density);
		setColor(a_color);
		manufacturer = a_manufacturer;
	}
	
	public void setManufacturer(String a_manufacturer) {
		manufacturer = a_manufacturer;
	}
}
