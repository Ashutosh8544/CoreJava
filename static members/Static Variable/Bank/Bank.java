class Bank{
	public static void main(String[] args){
		BankAccount A1 = new BankAccount();
		BankAccount A2 = new BankAccount();
		
		//static variable initialization.
		BankAccount.bankName                           =            "Kotak";
		BankAccount.branch                                  =            "Ameerpet";
		BankAccount.ifsc                                        =            "K0000123456";
	
		//Nonstatic variable Initialization for obj A1.
		A1.accountNum                                          =               12345L;
		A1.aHName                                                 =              "Ashu";
		A1.balance                                                  =               100000;

		
		//Nonstatic variable Initialization for obj A2.
		A2.accountNum                                          =               67891L;
		A2.aHName                                                 =              "shweta";
		A2.balance                                                  =               200000;

		//Depositing amount in account in A1 object.
		A1.deposite(5000);
			
		//Depositing amount in account in A2 object.
		A2.deposite(4000);

		

		//Dispalying all value of Account 1 Object.
		System.out.println(A1.bankName);
		System.out.println(A1.branch);
		System.out.println(A1.ifsc);
		System.out.println(A1.accountNum);
		System.out.println(A1.aHName);
		System.out.println(A1.balance);

		 //Displaying current balance of Amount 1.
	     A1.currentBalance();
		 
		System.out.println("_________________________");

		//Dispalying all value of Account 2 Object.
		System.out.println(A2.bankName);
		System.out.println(A2.branch);
		System.out.println(A2.ifsc);
		System.out.println(A2.accountNum);
		System.out.println(A2.aHName);
		System.out.println(A2.balance);

		//Displaying current balance of Account2.

		A2.currentBalance();
		System.out.println("_________________________");







	}
}
