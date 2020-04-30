abstract class Bank{ // by using abstract keyword we forcing to sub class to use super claass concrete method logics
	void deposit(){
		System.out.println("Deposit() method  of Bank");
	}
	void withdraw(){
		System.out.println("withdraw() method  of Bank");
	}
}

class TestBank{
	// Bank b = new Bank();	// CE:  Bank is abstract; cannot be instantiated

}
