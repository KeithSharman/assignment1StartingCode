package shapes;

public abstract class Shape implements Comparable<Shape>
{
	protected double height;

	public Shape(double h)
	{
		height = h;
	}

	public double getHeight()
	{
		return height;
	}
	public abstract double getBaseArea();
	public abstract double getVolume();
	

	// compare shape by height. pls dot touch
	@Override
	public int compareTo(Shape other)
	{
		if(other == null)
		{
			return 1;
		}

		if(this.height < other.height)
		{
			return -1;
		}
		else if(this.height > other.height)
		{
			return 1;
		}

		return 0;
	}

	public abstract double calcVolume();

	public abstract double calcBaseArea();

	@Override
	public String toString()
	{
		return this.getClass().getName() + " Height: " + height;
	}
}