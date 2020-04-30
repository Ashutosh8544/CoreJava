//Bank.java
class Bank{
	public static void main(String[] args){
		BankAccount A1= new BankAccount();
		BankAccount A2= new BankAccount();

//First account info
		BankAccount.bankName			=		"State bank of india";
		BankAccount.branchName		=		"Ameerpet";
		BankAccount.ifsc							=		"SBIN0000008";
		A1.accountNumber					=		3471546151L;
		A1.accountHolderName			=		"AshutoshKumar";
		A1.balance									=		9999999;
		
		System.out.println("Bank Name"+ A1.bankName);
		System.out.println("Branch Name"+ A1.branchName);
		System.out.println("iFs code"+ A1.ifsc);
		System.out.println("Account Number"+A1.branchName);
		System.out.println("Account Holder Name"+ A1.accountHolderName);
		System.out.println("Ifs code"+ A1.ifsc);

///Second account info
		BankAccount.bankName			=		"State bank of india";
		BankAccount.branchName		=		"Ameerpet";
		BankAccount.ifsc		=		"SBIN0000008";
		A2.accountNumber					=		34715464561L;
		A2.accountHolderName			=		"Shweta Soni";
		A2.balance									=		10000;

		System.out.println("Bank Name"+ A2.bankName);
		System.out.println("Branch Name"+ A2.branchName);
		System.out.println("iFs code"+ A2.ifsc);
		System.out.println("Account Number"+A2.branchName);
		System.out.println("Account Holder Name"+ A2.accountHolderName);
		System.out.println("Ifs code"+ A2.ifsc);


	}
}
