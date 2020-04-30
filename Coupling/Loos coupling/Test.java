class Animal{
	
	void animalSound(){
		System.out.println("Animal sound");
	}
	void animalEat(){
		System.out.println("Animal food");	
	}
}

class Tiger extends Animal{

	void animalSound(){
		System.out.println("Tiger sound");
	}
	void animalEat(){
		System.out.println("Tiger food");
	}
}

class Horse extends Animal{

	void animalSound(){
		System.out.println("Horse sound");
	}
	void animalEat(){
		System.out.println("Horse food");
	}
}

class Party{

	void eat(Animal a){
		a.animalEat();
	}
}

class Test{

	public static void main(String [] args){
//		Animal a1 = new Animal();
		Animal a2 = new Tiger();
		Animal a3 = new Horse();
		
		Party p = new Party();
		p.eat(a2);
		p.eat(a3);

	}
}