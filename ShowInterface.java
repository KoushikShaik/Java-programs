interface Shape
{
	float pi=3.14F;
	float computeArea(int x,int y);
	float computePerimeter(int r);
	
}
class Rectangle implements Shape
{
	public float computeArea(int x,int y)
	{
		return(x*y);
	}
	public float computePerimeter(int r)
	{
		return (4*r);
	}
}
class Circle implements Shape
{
	public float computeArea(int x,int y)
	{
		return (pi*x*x);
	}
	public float computePerimeter(int r)
	{
		return (2*pi*r);
		
	}
}
class ShowInterface
{
	public static void main(String k[])
	{
		Rectangle rect=new Rectangle();
		Circle cir=new Circle();
		Shape a;
		a=rect;
		System.out.println("Area of Rectangle:"+a.computeArea(5,10));
		System.out.println("Perimeter of rectangle"+a.computePerimeter(5));
		a=cir;
		System.out.println("Area of Circle:"+a.computeArea(5,10));
		System.out.println("Perimeter of Circle"+a.computePerimeter(5));

		
		
	}
}