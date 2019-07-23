package section4_2;

public abstract class Shape implements MyComparable{
	public String shapeName;

	public Shape(String name) {
		shapeName = name;
	}

	public int CompareTo(Object o) {
		double myArea = computerArea();
		double yourArea = ((Shape)o).computerArea();
		if (myArea < yourArea) return -1;
		else if (myArea == yourArea) return 0;
		else return -1;
	}


	public abstract double computerArea();
	public abstract double computerPerimeter();


}
