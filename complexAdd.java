
class Complex
{
	int r, i;
	Complex(int real, int img)
	{
		r=real;
		i=img;
	}
	Complex add(Complex c)
	{
		Complex b = new Complex(r+c.r, i+c.i);
		return b;
	}
	Complex subtract(Complex c)
	{
		Complex b = new Complex(r-c.r, i-c.i);
		return b;
	}
}

public class complexAdd {
	public static void main(String args[])
	{
		Complex c1 = new Complex(1, 2);
		Complex c2 = new Complex(2, 1);
		Complex c3 = c1.add(c2);
		Complex c4 = c1.subtract(c2);
		System.out.println("Addition : "+c3.r+" "+c3.i+"i");
		System.out.println("Subtraction : "+c4.r+" "+c4.i+"i");
	}
}
