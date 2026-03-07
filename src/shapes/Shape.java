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
	
	//default display height
	private static char displayType = 'h';
	
	//lets display type be changed
	public static void setDisplayType(char type) {
		displayType = type;
	}
	
	//multiple toStrings called on in same method, code in driver sets type
	@Override
    public String toString() {

        switch (displayType) {
            case 'a':
                return this.getClass().getSimpleName() +
                       " Area: " + this.calcBaseArea();

            case 'v':
                return this.getClass().getSimpleName() +
                       " Volume: " + this.calcVolume();

            case 'h':
            default:
                return this.getClass().getSimpleName() +
                       " Height: " + height;
        }
    }
}
