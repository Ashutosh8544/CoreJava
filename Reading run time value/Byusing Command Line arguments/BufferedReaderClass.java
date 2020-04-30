import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class BufferedReaderClass{
	public static void main(String[] args) throws IOException{
		BufferedReader br = 
			new BufferedReader(
				new InputStreamReader(System.in));
		System.out.print("Enter Employee Id");
		int id = Integer.parseInt(br.readLine());
		System.out.print("Enter Employee name");
		String name = br.readLine();
		System.out.print("Enter Department");
		String dept = br.readLine();
		System.out.print("Enter Grnder");
		char gender = br.readLine().charAt(0);
		System.out.print("Enter Salary");
		double sal = Double.parseDouble(br.readLine());
		System.out.println("Employee Id\t\t :" + id);
		System.out.println("Employee Name\t\t:" + name);
		System.out.println("Employee Depatment\t:" + dept);
		System.out.println("Employee Gender\t\t:" + gender);
		System.out.println("Employee Salary\t\t:" + sal);
	}
}
