class ParameterizedConstructor {
	ParameterizedConstructor (){
		System.out.println("No Parameterized Constructor ");
	}
	ParameterizedConstructor (int x){
		System.out.println("Parameterized Constructor ");
	}
	public static void main(String [] args){
	ParameterizedConstructor  npc1 = new ParameterizedConstructor ();
	ParameterizedConstructor  npc2 = new ParameterizedConstructor (20);
	}
}