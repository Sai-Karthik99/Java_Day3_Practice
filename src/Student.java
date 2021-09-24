public class Student 
{
	private String sname;
	private int sid;
	private String sbranch;
	private  long sphoneno;
	/*public void printDetails()
	{
		System.out.println(sname);
		System.out.println(sid);
		System.out.println(sbranch);
		System.out.println(sphoneno);
	}*/
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public  int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid=sid;
	}
	public String getSbranch() {
		return sbranch;
	}
	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
	}
	public double getSphoneno() {
		return sphoneno;
	}
	public void setSphoneno(long sphoneno) {
		this.sphoneno = sphoneno;
	}
	Student(String sname,int sid,String sbranch,long sphoneno){
		this.sname=sname;
		this.sid=sid;
		this.sbranch=sbranch;
		this.sphoneno=sphoneno;
	}

}
