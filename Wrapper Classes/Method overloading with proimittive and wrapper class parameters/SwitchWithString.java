class SwitchWithString{
	static void m1(String name){
		switch(name){
			case "pk":
				System.out.println("PK is a hero number 1");
				break;
			case "MB":
				System.out.println("MK is a hero number 2");
				break;
			case "As":
				System.out.println("As is the Two love word");
				break;
			default:
				System.out.println(name+" number is not decided");
		}
	}
	public static void main(String[] args)
	{
		m1("PK");
		m1("MB");
		m1("As");
		m1("Shweta");
		m1("Ashu");
	}
}
