class StudentArray{
	public static void main(String[] args) {
		String[] saName=new String[3];
		long[] laMobno= new long[3];

		System.out.println("Displaying the default values:");
		System.out.println("saName]==>"+saName[0]);
		System.out.println("saName==>"+saName[1]);
		System.out.println("saName==>"+saName[2]);
		System.out.println("_____________________________________");

		saName[0]="Ashu";
		saName[1]="Ahmed";
		saName[2]="Bachan";

		
		System.out.println("Displaying the initialized Student's name:");
		System.out.println("saName==>"+saName[0]);
		System.out.println("saName==>"+saName[1]);
		System.out.println("saName==>"+saName[2]);
		
		System.out.println("_____________________________________");
		System.out.println("Displaying the default value of student mobile number:");
		System.out.println("laMobno[0]==>"+laMobno[0]);
		System.out.println("laMobno[1]==>"+laMobno[1]);
		System.out.println("laMobno[2]==>"+laMobno[2]);

		laMobno[0]=8507509741L;//integer number too large
		laMobno[1]=9835651076L;//integer number too large
		laMobno[2]=7028103478L;//integer number too large

		System.out.println("_____________________________________");
		System.out.println("Displaying the initialized Mobile number of the student");
		System.out.println("laMobno[0]==>"+laMobno[0]);
		System.out.println("laMobno[1]==>"+laMobno[1]);
		System.out.println("laMobno[2]==>"+laMobno[2]);




	}
}
