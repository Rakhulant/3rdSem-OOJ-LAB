
class A{
	void callme()
	{
		System.out.println("Inside A's callme method");
	}
}
class B extends A
{
	void callme()
	{
		System.out.println("Inside B's callme method");
	}
}
class C extends A
{
	void callme()
	{
		System.out.println("Inside C's callme method");
	}
}
class Dynamic{
	public static void main(String args[])
	{
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		A r;
		r = a1;
		r.callme();
		r = b1;
		r.callme();
		r = c1;
		r.callme();
	}
}
