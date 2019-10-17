import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class BacaFile {
	public static void main(String[] args) throws FileNotFoundException{

			//Input file
			Scanner	scanner	= new Scanner(System.in);
			System.out.print("Input File : ");
			String infileName = scanner.next();

			//Output file
			System.out.print("Output File : ");
			String outfileName = scanner.next();

			//Baca file
			File inFile = new File(infileName);
			Scanner	in = new Scanner(inFile);
			PrintWriter out = new PrintWriter(outfileName);

			//Baca input dan tulis output
			int a = 1;
			while (in.hasNextLine()){
				String value = in.nextLine();
				out.print("/* " + a + " */");
				out.printf("%s", value + "\n");
				a++;
			}

			in.close();
			out.close();
	}
}