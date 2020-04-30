class Example1{
	private int x;
	Example1(int x){
		this.x = x;
	}
	@Override
	public int hashCode(){
		return x;
	}
	public int JvmHashCode(){
		return super.hashCode();
	}
}

class IdentityHashCodeTest{
	public static void main(String[] args){
		Example1 e1 = new Example1(5);
		Example1 e2 = new Example1(5);
		Example1 e3 = new Example1(6);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());

		System.out.println();
		System.out.println(System.identityHashCode(e1));
		System.out.println(System.identityHashCode(e2));
		System.out.println(System.identityHashCode(e3));

		System.out.println();
		System.out.println(e1.JvmHashCode());
		System.out.println(e2.JvmHashCode());
		System.out.println(e3.JvmHashCode());
	}
}
