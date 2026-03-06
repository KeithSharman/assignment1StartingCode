package shapes;
// i changed this whole part. class was for a different shape.
public class SquarePrism extends Prism
{
	private double edgeLength;

	public SquarePrism(double h, double edge)
	{
		super(h, edge);
		edgeLength = edge;
	}

	
	@Override
	public double calcBaseArea()
	{
		double area = edgeLength * edgeLength;
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