import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class FileAttSample {

	public static void main(String[] args) {
		
		Path filePath = Paths.get("C:\\Java\\Chapter8\\example2.txt");
		
		try {
			BasicFileAttributes fileAtt = Files.readAttributes(filePath, BasicFileAttributes.class);
			System.out.println("Size " + fileAtt.size() + " bytes");
			System.out.println("Creation time " + fileAtt.creationTime());
			System.out.println("Last modified time " + fileAtt.lastModifiedTime());
			
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
	}

}
