package rakshith;

abstract class Shape
{
	int a, b;
	abstract void printArea();
	Shape(int x, int y)
	{
		a = x;
		b = y;
	}
}

class Recta extends Shape
{
	Recta(int x, int y)
	{
		super(x, y);
	}
	void printArea()
	{
		System.out.println("Area of Rectangle is : "+a*b);
	}
}
class Triang extends Shape
{
	Triang(int x, int y)
	{
		super(x, y);
	}
	void printArea()
	{
		System.out.println("Area of Triangle is : "+0.5*a*b);
	}
}
class Circ extends Shape
{
	Circ(int x)
	{
		super(x, x);
	}
	void printArea()
	{
		System.out.println("Area of Circle is : "+3.14*a*a);
	}
}
public class Shapes {

	public static void main(String[] args) {
		Recta r = new Recta(10, 20);
		Triang t = new Triang(10, 20);
		Circ c = new Circ(10);
		r.printArea();
		t.printArea();
		c.printArea();

	}

}
