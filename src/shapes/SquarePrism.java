package shapes;
// i changed this whole part. class was for a different shape.
public class SquarePrism extends Shape
{
	private double edgeLength;

	public SquarePrism(double h, double edge)
	{
		super(h);
		edgeLength = edge;
	}

	@Override
	public double calcVolume()
	{
		double base = edgeLength * edgeLength;
		double volume = base * height;

		return volume;
	}

	@Override
	public double calcBaseArea()
	{
		double area = edgeLength * edgeLength;
		return area;
	}
}