import java.util.Scanner;
public class Student{
	private int sno;
	private String sName;
	private String course;
	
	Scanner sc = new  Scanner(System.in);
	System.out.print("Enter sno:  ");
	sno = sc.nextInt();
	System.out.print("Enter sName");
	sName = sc.nextInt();
	System.out.println("Enter course");
	course = sc.nextInt();
	
	public void setSno(int sno){
		this.sno = sno;
	}
	public int getSno(){
		return sno;
	}
	public void setSname(String sName){
		this.sName = sName;
	}
	public String getSname(){
		return sName;
	}	
	public void setCourse(String course){
		this.course = course;
	}
	public String getCourse(){
		return course;
	}
	@Override
		public int hashCode(){
			return sno;	
		}
}