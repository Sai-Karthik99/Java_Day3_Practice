
public class Laptop
{
	double price;
	String name;
	String brand;
	String colour;
	public void printDetails()
	{
		System.out.println(price);
		System.out.println(name);
		System.out.println(brand);
		System.out.println(colour);
	}
	Laptop(double price)
	{
		this.price=price;
	}
	Laptop(double price,String name)
	{
		this(price);
		this.name=name;
		
		
	}
	Laptop(double price,String name,String brand)
	{
		this(price,name);
		this.brand=brand;
		
		
	}
	
	Laptop(double price,String name,String brand,String colour)
	{
		this(price,name,brand);
		this.colour=colour;
		
	}

}
