import java.io.File;
	//import java.io.FileNotFoundException;
	//import java.util.Scanner;
		
public class FileDeletion {
				
	public static void main(String [] args) {
		File file = new File("src/StudyEast.txt");
			if(file.delete()) {
				System.out.println("Deleting file");
			} else {
				System.out.println("Deletion not successful");
			}

	}

}
