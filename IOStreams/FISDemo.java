
// Step 1: First import the IO java.io package.
import java.io.*;
class  FISDemo{
	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		//Step 2: Create FileInputStrem class object
		//FileInputStream fis = new FileInputStream("ashuu.txt");	 // Exception in thread "main" java.io.FileNotFoundException:
																										// Step 3: must pass file name from where we want to read the file.
		FileInputStream fis = new FileInputStream("ashu.txt");
			int data;
			while(( data = fis.read()) != -1){ // -1is the termination point of read() method
				System.out.println("data: " + data + "\t " + (char)data);
			}
		fis.close(); //Step 4: close the stream connection between java program from file.
	}
}
