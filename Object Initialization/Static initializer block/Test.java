class Test{
	public static void main(String[] args){
		//initializing the static variable b which is available in the StaticBlock class.
		StaticBlock.b = 20;

		//initializing the setter method which is availlable in the StaticBlock
		//value 40 is initialized in the static variable d(class level variable)
		StaticBlock.setD(40);

		//Reading and displaying the value of static variables.
		System.out.println(StaticBlock.a);  
		System.out.println(StaticBlock.b);
		System.out.println(StaticBlock.c);
		System.out.println(StaticBlock.d);
	}
}
