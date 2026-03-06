package shapes;

public abstract class Prism extends Shape
{
	protected double side;

	public Prism(double h, double s)
	{
		super(h);
		side = s;
	}

	public double getSide()
	{
		return side;
	}

	public void setSide(double s)
	{
		side = s;
	}

	// volume = base area * height [for all prisms]
	@Override
	public double calcVolume()
	{
		return calcBaseArea() * height;
	}
}