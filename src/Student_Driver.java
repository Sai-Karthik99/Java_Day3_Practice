import java.util.Scanner;

public class Student_Driver 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		String sname = sc.next();
		int sid = sc.nextInt();
		String sbranch = sc.next();
		long sphoneno = sc.nextLong();
		
		Student s1 = new Student(sname,sid,sbranch,sphoneno);
		//s1.printDetails();
		System.out.println(s1.getSname()+s1.getSname());
		s1.setSname("Ram");
		System.out.println(s1.getSid()+s1.getSid());
		s1.setSid(9);
		System.out.println(s1.getSbranch()+s1.getSbranch());
		s1.setSbranch("ECE");
		System.out.println(s1.getSphoneno()+s1.getSphoneno());
		s1.setSphoneno(95504146);
		System.out.println("Student1 Details");
		

	}

}
