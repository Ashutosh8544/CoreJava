// Java program to illustrate the concept 
// of Autoboxing and Unboxing 
import java.io.*; 
  
class AutoBoxingAndUnBoxing 
{ 
    public static void main (String[] args) 
    { 
        // creating an Integer Object 
        // with value 10. 
        Integer io1 =  new Integer(10); 
		Integer io2 = 10 ;
        // unboxing the Object 
        int i1 = io1;
		int i2 = io2;

  
        System.out.println("Value of io1: " + io1);
		System.out.println("Value of io2: " + io2);
        System.out.println("Value of i1: " + i1);
        System.out.println("Value of i2: " + i2); 
  
        //Autoboxing of char 
        Character gfg = 'a'; 
  
        // Auto-unboxing of Character 
        char ch = gfg; 
        System.out.println("Value of ch: " + ch); 
        System.out.println("Value of gfg: " + gfg); 
  
    } 
} 