import java.nio.file.*;

public class PathSample {
	
	public static void main(String[] args) {
		Path filePath = Paths.get("C:\\Users\\osianahv\\Downloads\\Eclipse\\App\\eclipse\\Data\\workspace\\FileIO\\src\\sample.txt");
		int count = filePath.getNameCount();
		
		System.out.println("Path is " + filePath.toString());
		System.out.println("File name is " + filePath.getFileName());
		System.out.println("There are " + count + " elements in the file path");
		
		for(int x=0; x < count; x++) {
			System.out.println("Element "+ x + " is "+filePath.getName(x));
		}
		
	}

}
