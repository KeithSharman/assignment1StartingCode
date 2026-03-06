package shapes;

public class TriangularPrism extends Prism
{
	private double edgeLength;

	public TriangularPrism(double h, double edge)
	{
		super(h, edge);
		edgeLength = edge;
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