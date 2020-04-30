//BankAccount.java
class BankAccount{
	//class variables
		//ststic variables
	static String bankName;
	static String branchName;
	static String ifsc;

		//Non ststic variable
	long accountNumber;
	String accountHolderName;
	double balance;

		//method level variable
		void deposite(double amt){
			balance=balance+amt;
		}

		void withraw(double amt){
			balance=balance-amt;
		}

		void currentBalance(){
			System.out.println(balance);
		}

}
