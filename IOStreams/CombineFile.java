import java.io.*;
 
/**
 * This program demonstrates how to combine two files to a 3rd file
 * using the FileInputStream and FileOutputStream classes.
 * @author www.codejava.net
 */
public class CombineFile {
    private static final int BUFFER_SIZE = 4096;
 
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide file1, file2, and output files");
            System.exit(0);
        }
 
        String inputFile1 = args[0];
        String inputFile2 = args[1];
        String outputFile = args[2];
 
 
        try (
            InputStream inputStream1 = new FileInputStream(inputFile1);
            InputStream inputStream2 = new FileInputStream(inputFile2);
            OutputStream outputStream = new FileOutputStream(outputFile);
        ) {
 
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;
 
            while ((bytesRead = inputStream1.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
 
            while ((bytesRead = inputStream2.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}