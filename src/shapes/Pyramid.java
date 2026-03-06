package shapes;

public class Pyramid extends Shape
{
	private double edgeLength;

	public Pyramid(double h, double edge)
	{
		super(h);
		edgeLength = edge;
	}

	@Override
	public double calcVolume()
	{
		// volume = (1/3) * base * height - from formula sheet
		double base = edgeLength * edgeLength;
		double volume = (base * height) / 3.0; //corrected this one too.

		return volume;
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