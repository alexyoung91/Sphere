public class Main {
	public static void main(String args[]) {
		Sphere s = new Sphere();
		s.setRadius(2.5);
		System.out.println("Radius of sphere: " + s.getRadius());
		System.out.println("Volume of sphere: " + s.getVolume());
		System.out.println("Area of sphere: " + s.getSurfaceArea());
		System.out.println("=");
		s.setRadius(s.getRadius() - 0.5);
		System.out.println("Radius of sphere: " + s.getRadius());
		System.out.println("Volume of sphere: " + s.getVolume());
		System.out.println("Area of sphere: " + s.getSurfaceArea());
	}
}
