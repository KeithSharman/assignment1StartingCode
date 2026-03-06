package shapes;

public class TriangularPrism extends Shape
{
	private double edgeLength;

	public TriangularPrism(double h, double edge)
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
		// calculate aree
		double sideSquared = edgeLength * edgeLength;
		double area = (Math.sqrt(3) * sideSquared) / 4.0;

		return area;
	}
}