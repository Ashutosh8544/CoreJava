public class Test{
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student();
		s1.getSno();
		s1.getSname();
		s1.getCourse();

		s2.getSno();
		s2.getSname();
		s2.getCourse();

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
