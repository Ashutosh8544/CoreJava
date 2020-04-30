class A{
	public static void main(String[] args){
		static void m1(Object obj){
			String name = obj.getClass().getName();
			System.out.println("The passed object is of type:  " + name);
		}
	}
}
class B{
}
class C{
}
