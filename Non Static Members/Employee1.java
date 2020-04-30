class Employee1{
	int eId;
	String eName;
	String company;
	//overriding toString()method to print object data.
	public String toString(){
		return "eId:"+           eId + "\n"+
					"eName:" +    eName + "\n"+
					"Company:" + company +"\n";
	}
	public static void main(String[] args) 
	{
		Employee1 e1 = new Employee1();
		System.out.println(e1);
		e1.eId = 7279;
		e1.eName = "Ashu";
		e1.company = "Naresh I Technology";
		System.out.println(e1);
		System.out.println(e1);
		Employee1 e2 = null;
		//	Employee1 e2 = 'null'; // CE: unclosed character literal
		//Employee1 e2 = "null"; // CE: incompatible types: String cannot be converted to Employee1
		System.out.println(e2);
	//	System.out.println(null); // CE:  reference to println is ambiguous
		e2.eId = 7279;
		e2.eName = "Ashu";
		e2.company = "Naresh I Technology";
	}
}