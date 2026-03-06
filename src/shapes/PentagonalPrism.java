package shapes;

public class PentagonalPrism extends Prism
{
	private double edgeLength;

	public PentagonalPrism(double h, double edge)
	{
		super(h, edge);
		edgeLength = edge;
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



	@Override
	public double getBaseArea() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return 0;
	}
}