import java.util.Scanner;
import java.nio.file.*;

public class PathSample2 {
	
	public static void main(String[] args) {
		String fileName;
		Scanner s = new Scanner(System.in);
		//"C:\\Users\\osianahv\\Downloads\\Eclipse\\App\\eclipse\\Data\\workspace\\FileIO\\src\\sample.txt");
		
		System.out.println("Enter a filename: ");
		fileName = s.nextLine();
		Path inputPath = Paths.get(fileName);
		Path fullPath = inputPath.toAbsolutePath();
		
		System.out.println("The full path is " + fullPath.toString());
		
	}

}
