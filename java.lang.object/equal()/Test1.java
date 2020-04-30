 class Test1{
	public static void main(String[] args){
		Student s1 = new Student(101,"Ashu","java");
		Student s2 = new Student(102,"Shweta","php");
		Student s3 = new Student(101,"Prem",".net");
		Student s4 = s2;
		System.out.println(s1 == s2);// false
		System.out.println(s1.equals(s2)); //false
		System.out.println();

		System.out.println(s1 == s3); //false
		System.out.println(s1.equals(s3)); //false
		System.out.println();

		System.out.println(s2 == s4); //true
		System.out.println(s2.equals(s4)); //true
		System.out.println();

		Address add =new Address();

	//	System.out.println(s1 == add); //CE: incomparable types: Student and Address
		System.out.println(s1.equals(add)); //false
		System.out.println(add.equals(s1)); //false
		System.out.println();

		//comaparing two null values
		System.out.println(null == null); //true
		//System.out.println(null.equals(null)); //CE: <null> cannot be dereferenced

		Address a1 = null;
		Address a2 = null;

		//compararing null with null using(==) operator always return true
		//but equals() method return false
		System.out.println(a1 == a2); //true
		//System.out.println(a1.equals(a2)); //RE: java.lang.NullPointerException
		System.out.println();0

		Address a3 = new Address(); 
		System.out.println(a3 == a2); //false
		System.out.println(a3.equals(a2)); //false

		System.out.println(s2.equals(a2));//false






	}
}