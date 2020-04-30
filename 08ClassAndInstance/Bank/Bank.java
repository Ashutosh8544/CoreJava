class Bank{
		public static void main(String[] args){
			Account A1= new Account();
			Account A2= new Account();
			System.out.println("First account information");
			System.out.println("_______________________");
			A1.ano=1199001500062020L;
			A1.aHolderName="Ashutosh kumar";
			A1.branchName=new String[]{"Ameerpet","Balkampet","SR Nagar"};
			A1.balance=50000;
			A1.ifscCode= new String[]{"Pnb51151615L", "Pnb51151614","Pnb51151616"};
			A1.address = new Address();
			A1.address.houseNo="1-2/105";
			A1.address.landmark="AmeerPet";
			A1.address.pinCode=500006;
			
			System.out.println("Account Number:				"+A1.ano);
			System.out.println("Account holder name:			"+A1.aHolderName);
			System.out.println("Branch Name:				"+java.util.Arrays.toString(A1.branchName));
			System.out.println("Bank balance:				"+A1.balance);
			System.out.println("Address:				"+A1.address.houseNo);
			System.out.prinlnt("Landmark:			"+A1.address.landmark);
			System.out.println("Pincode				\n"+A1.address.pinCode);






			System.out.println("Second account information");
			System.out.println("_______________________");
			A2.ano=1199001500062020L;
			A2.aHolderName="Ashutosh kumar";
			A2.branchName=new String[]{"Ameerpet","Balkampet","SR Nagar"};
			A2.balance=50000;
			A2.ifscCode= new String[]{"Pnb51151615L", "Pnb51151614","Pnb51151616"};
			A2.address = new Address();
			A2.address.houseNo="1-2/105";
			A2.address.landmark="AmeerPet";
			A2.address.pinCode=500006;

			System.out.println("Account Number:"+A2.ano);
			System.out.println("Account holder name"+A2.aHolderName);
			System.out.println("Branch Name"+java.util.Arrays.toString(A2.branchName));
			System.out.println("Bank balance"+A2.balance);
			System.out.println("Address"+A1.address.houseNo);
			System.out.println("Bank balance"+A1.address.landmark);
			System.out.println("Bank balance"+A1.address.pinCode);


				
		}
		}
