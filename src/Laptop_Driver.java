import java.util.Scanner;

public class Laptop_Driver {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double price = sc.nextDouble();
		String name = sc.next();
		String brand = sc.next();
		String colour = sc.next();
		
		Laptop l1 = new Laptop(price);
		Laptop l2 = new Laptop(price,name);
		Laptop l3 = new Laptop(price,name,brand);
		Laptop l4 = new Laptop(price,name,brand,colour);
		System.out.println("System Detais are:");
		l1.printDetails();
		System.out.println();
		l2.printDetails();
		System.out.println();
		l3.printDetails();
		System.out.println();
		l4.printDetails();

	}

}
