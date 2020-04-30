// Step 1: First import the IO java.io package.
import java.io.*;
class FOSDemo{
	public static void main(String[] args) throws FileNotFoundException, IOException{
		//Step 2: Create FileOutputStrem class object
		//Step 3: no need to pass, file name automatic created by JVM file name from where we want to read the file.
		FileOutputStream fos = new FileOutputStream("shweta.txt");
		//step 4: calls the write() method to write data into file.
		fos.write(5);
		System.out.println("data is saved");
		//step 5: close the stream connection between java program from file.
		fos.close();
	}
}
