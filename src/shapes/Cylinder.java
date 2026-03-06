package shapes;

public class Cylinder extends Shape
{
	private double radius;

	public Cylinder(double h, double r)
	{
		super(h);
		radius = r;
	}

	public double getRadius()
	{
		return radius;
	}

	@Override
	public double calcVolume()
	{
		// volume = base area * height
		double baseArea = Math.PI * radius * radius;
		double volume = baseArea * height;

		return volume;
	}

	@Override
	public double calcBaseArea()
	{
		double area = Math.PI * radius * radius;
		return area;
	}
}