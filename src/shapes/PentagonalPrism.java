package shapes;

public class PentagonalPrism extends Shape
{
	private double edgeLength;

	public PentagonalPrism(double h, double edge)
	{
		super(h);
		edgeLength = edge;
	}

	@Override
	public double calcVolume()
	{
		double base = calcBaseArea();
		double volume = base * height;

		return volume;
	}

	@Override
	public double calcBaseArea()
	{
		// from formula sheet
		double sideSquared = edgeLength * edgeLength;
		double t = Math.tan(Math.toRadians(54));

		double area = (5 * sideSquared * t) / 4.0;

		return area;
	}
}