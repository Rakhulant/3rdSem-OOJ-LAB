
class Area
{
	int a,b;
	Area(int x, int y)
	{
		a=x;
		b=y;
	}
	double Area()
	{
		System.out.println("Area not defined");
		return 0;
	}
}
class Rect extends Area{
	Rect(int x, int y)
	{
		super(x,y);
	}
	double Area() {
		return a*b;
	}
}
class Triangle extends Area{
	Triangle(int x,int y)
	{
		super(x,y);
	}
	double Area()
	{
		return (0.5*a*b);
	}
}


public class Dispatch {

	public static void main(String[] args) {
		Area a1 = new Area(0,0);
		Rect r1 = new Rect(15,30);
		Triangle t1 = new Triangle(20,30);
		Area r;
		r = a1;
		System.out.println("Area of Area is :"+r.Area());
		r=r1;
		System.out.println("Area of Rectanlge is :"+r.Area());
		r=t1;
		System.out.println("Area of Triangle is :"+r.Area());
		
	}

}
