class  Example{
	int x = 10;
	int y = 20;
}

class Test{
}

class Comparasion{
	public static void main(String[] args){
		int x =10;
		int y = 20;
		int z = 10;
		
		//Comparasion by  using (==) operator
		System.out.println(x == y);	//false
		System.out.println(x == z);	//true
		System.out.println();

		//Comparasion object by using (==) operator
		Example e1 = new Example();
		Example e2 = new Example();
		Example e3 = e2;
		System.out.println();

		System.out.println(e1==e2);	  //false
		System.out.println(e2==e3);	//true
		System.out.println();

		boolean bo = true;
		//System.out.prntln(x == bo);	//CE: incomparable types: int and boolean
		System.out.println();

		Test t1 = new Test();
		//System.out.println(e1 = t1);	  //CE:  incompatible types: Test cannot be converted to Example
		//System.out.prntln(x == bo);  //CE: incomparable types: int and boolean
		
		////Comparasion object ny using equal method
		System.out.println();

		System.out.println(e1.equals(e2));	//false
		System.out.println(e2.equals(e3));	//true
		System.out.println(e1.equals(t1));	//no CE
		System.out.println();

		//comparing null by using (==) method
		System.out.println(null == null);	//true
		Example e4 = null;
		System.out.println(null == e4); //true
		Example e5 = new Example();	
		System.out.println(null == e5);	//false
		
		//comparing null by using equals(-) method
		//System.out.println(null.equals(null));	//CE: <null> cannot be dereferenced
		Example e6 = null;
		//	System.out.println(e6.equals(null)); //NPE
		System.out.println();
		Example e7 = new Example();
		System.out.println(e7.equals(null));	//false
	}
}
