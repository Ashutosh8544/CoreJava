class College{
	public static void main(String[] args){
		//static variable creation by using the class name
		Student.institute="Naresh Information Technologies";
		
		//student first object creation.
		Student s1 = new Student();

 		//student first object initialization after object creation.
		s1.sNo=101;
		s1.sName="Ashu";
		s1.address=new Address();
		s1.address.doorNum="1-2/51";
		s1.address.city="Hyderabad";;
		
		//student first object Reading and displaying values.
		System.out.println("s1 Reference Address"+s1);
		System.out.println("s1.institute ====>"+s1.institute);
    	System.out.println("s1.sNo ====>"+s1.sNo);
		System.out.println("s1.sName ====>"+s1.sName);
		System.out.println("s1.address.doorNum ====>"+s1.address.doorNum);
		System.out.println("s1.address.city ====>"+s1.address.city);
		System.out.println("_________________________________________\n");
	
    	//student second object creation.
		Student s2= new Student();
		s2.address = s1.address;//s1 and s2 has same address.

		//student second object initialization after object creation.
		s2.sNo=102;
		s2.sName="Shweta";

		//student Second object Reading and displaying values of same address containinng.
		System.out.println("s2 Reference Address"+s2);
		System.out.println("s2.institute ====>"+s2.institute);
    	System.out.println("s2.sNo ====>"+s2.sNo);
		System.out.println("s2.sName ====>"+s2.sName);
		System.out.println("s2.address.doorNum ====>"+s2.address.doorNum);
		System.out.println("s2.address.city ====>"+s2.address.city);
		System.out.println("_________________________________________\n");

	//	s2 with different address.
		s2.sNo=102;
		s2.sName="Shweta";
		s2.address=new Address();
		s2.address.doorNum="1-3/552";
		s2.address.city="Telangana";

		//student Second object Reading and displaying values od different address containing,
		System.out.println("s2 Reference Address"+s2);
		System.out.println("s2.institute ====>"+s2.institute);
    	System.out.println("s2.sNo ====>"+s2.sNo);
		System.out.println("s2.sName ====>"+s2.sName);
		System.out.println("s2.address.doorNum ====>"+s2.address.doorNum);
		System.out.println("s2.address.city ====>"+s2.address.city);
		System.out.println("_________________________________________\n");


		}
}
