class MainOverload{
	public static void main(String args) {
		System.out.println("in main(String )");
	}
	public static void main(String[] args) {
		System.out.println("in main(String[] )");
		main("ashu");
		main(new int[]{5,6,7});
	
	}
	public static void main(int[] args) {
		System.out.println("in main(int[] )");
		System.out.println(java.util.Arrays.toString(args));
	}
}

