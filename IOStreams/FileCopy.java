// Step 1: First import the IO java.io package.
import java.io.*;
class FileCopy{
	public static void main(String[] args) throws FileNotFoundException, IOException{
		//Step 2: Create FileOutputStrem class object
		//Step 2: Create FileinputStrem class object
		FileInputStream fis = new FileInputStream("ashu.txt");
		FileOutputStream fos = new FileOutputStream("shweta.txt");
		int data;
		while((data= fis.read())!=-1){
			fos.write(data);//coping ashu file data to shweta file.
		}
		System.out.println("File copied");
		//step 5: close the stream connection of FileInputStream between java program from file.
		//step 5: close the stream connection of FileInputStream between java program from file.

		fis.close();
		fos.close();
	}
}
