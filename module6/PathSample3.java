import java.io.IOException;
import java.nio.file.AccessMode.*;
import java.nio.file.*;

public class PathSample3 {


	public static void main(String[] args) {
		Path filePath = Paths.get("C:\\Java\\Chapter8\\example.txt");
		
		
		final AccessMode EXECUTE = null;
		final AccessMode READ = null;
		
		
		System.out.println("Path is " + filePath.toString());
		
		try {
			filePath.getFileSystem().provider().checkAccess(filePath, READ, EXECUTE);
			System.out.println("The file can be read and executed");
		}catch(IOException e) {
			System.out.println("The file cannot be used.");
		}
		

	}

}
