class College{
	public static void main(String[] args) 	{

		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		
		//Initializing first student information
		s1.sno =		1001;
		s1.sName="Ashu";
		s1.courses = new String[]{"Core Java", "UI","Oracle"};
		s1.address=new Address();
		s1.address.houseNo="2-1/205";
		s1.address.landmark="Ameerpet";
		s1.address.pinCode=500016;

		
		System.out.println("First student information");
		System.out.println("_____________________");
		System.out.println(s1.sno);
		System.out.println(s1.sName);
		System.out.println(s1.courses[0]);
		System.out.println(s1.courses[1]);
		System.out.println(s1.courses[2]);
		System.out.println(s1.address.houseNo);
		System.out.println(s1.address.landmark);
		System.out.println(s1.address.pinCode);
		
		//Initializing second student information
		s2.sno =		1001;
		s2.sName="Shweta";
		s2.courses = new String[]{"Core Java", "UI","Oracle"};
		s2.address=new Address();
		s2.address.houseNo="3-1/206";
		s2.address.landmark="Bhopal";
		s2.address.pinCode=462023;

		System.out.println("Second student information");
		System.out.println("_____________________");
		System.out.println(s2.sno);
		System.out.println(s2.sName);
		System.out.println(s2.courses[0]);
		System.out.println(s2.courses[1]);
		System.out.println(s2.courses[2]);
		System.out.println(s2.address.houseNo);
		System.out.println(s2.address.landmark);
		System.out.println(s2.address.pinCode);

				//Initializing first student information
		s3.sno =		1003;
		s3.sName="Ruchi";
		s3.courses = new String[]{"Python", "UI","Oracle"};
		s3.address=new Address();
		s3.address.houseNo="4-1/207";
		s3.address.landmark="Ashoka garden";
		s3.address.pinCode=462025;

		System.out.println("Third student information");
		System.out.println("_____________________");
		System.out.println(s3.sno);
		System.out.println(s3.sName);
		System.out.println(s3.courses[0]);
		System.out.println(s3.courses[1]);
		System.out.println(s3.courses[2]);
		System.out.println(s3.address.houseNo);
		System.out.println(s3.address.landmark);
		System.out.println(s3.address.pinCode);
		


	}
}
