// Step 1: First import the IO java.io package.
import java.util.Scanner;
import java.io.*;
class FileCopyDynamically{
	public static void main(String[] args) throws FileNotFoundException, IOException{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter source file:\t");
		String srcFile = sc.nextLine();

		System.out.print("Enter Destination file:\t");
		String destFile = sc.nextLine();

		//Step 2: Create FileOutputStrem class object
		//Step 2: Create FileinputStrem class object
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(destFile);
		int data;
		while((data= fis.read())!=-1){
			fos.write(data);//coping ashu file data to shweta file.
		}
		System.out.println("data is copied");
		//step 5: close the stream connection of FileInputStream between java program from file.
		//step 5: close the stream connection of FileInputStream between java program from file.

		fis.close();
		fos.close();
	}
}
