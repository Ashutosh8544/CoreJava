class MethodsDefinitions{
    void m1(){}
	
	void m2()
	{
		return;
	}
	void m3()
	{
	//	return 10;   // CE:  incompatible types: unexpected return value return 10;
	}
    
	int m4(){
		return 10;
	}

	int m5(){
		//return;   // CE:  incompatible types: missing return value

		return 20;
   	}
	
	int m6(){
		return 'a';
	}

	int m7(){
	//	return 10.345;    //CE:  incompatible types: possible lossy conversion from double to int
	 return 10;
	}

	int m8(){
//		return true;		// CE:   incompatible types: boolean cannot be converted to int
	  return(20);
	}


}
