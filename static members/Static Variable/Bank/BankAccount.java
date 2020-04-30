class BankAccount{
	//class level variable or static variables declarations.
	static String bankName;
	static String branch;
	static String ifsc;

	//Non static variable
	long accountNum;
	String aHName;
	double balance;
	
	void deposite(double amt){
		balance = balance + amt;
	}

	void withdraw(double amt){
		balance = balance - amt;
	}

	void currentBalance(){
		System.out.println("Current Balance is: "+ balance);
	}

}
