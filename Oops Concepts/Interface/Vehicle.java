// #RULE 7

interface Vehicle{
	void engine();
	void breaks();
}

abstract class Bus implements Vehicle{
	// # RULE 8: method must override with public access modifier
	public void breaks(){
		System.out.println("Bus has two breaks");
	}
}

class RedBus extends Bus{
	public void engine(){
		System.out.println("Red bus engine capicity is 40 kmph");
	}
}

class Volvo extends Bus{
	public void engine(){
		System.out.println("Volvo engine capicity is 110 kmph");
	}
}