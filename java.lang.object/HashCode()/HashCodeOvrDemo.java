class Example{
	int x = 10;
	int y = 20;

	@Override
	public int hashCode(){
		return x+y;
	}
}


class  HashCodeOvrDemo{
	public static void main(String[] args){
		Example e1 = new Example();
		Example e2 = new Example();

		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}
