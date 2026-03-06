package shapes;

public class Cone extends Shape
{
	private double radius;

	public Cone(double h, double r)
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
		// volume = (1/3) * pi * r^2 * h
		// changed this to match formula sheet
		double base = Math.PI * radius * radius;
		double volume = (base * height) / 3.0;  // corrected calculation

		return volume;
	}

	@Override
	public double calcBaseArea()
	{
		double area = Math.PI * radius * radius;
		return area;
	}
}