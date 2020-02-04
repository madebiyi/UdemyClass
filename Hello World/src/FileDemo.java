import java.io.File;
import java.io.IOException;

//import java.io.File;
public class FileDemo {
	public static void main(String [] args) throws IOException {
		{
			//File file = new File("C:\\Users\\madebiyi\\eclipse-workspace\\filetest\\StudyEasy.txt"); //src/ is the relative path
			File directory = new File("MyFiletest\\author\\Moruf"); //Creating directory
			directory.mkdirs(); //for multiple directories 
			System.out.println("Directory Created");
			File file = new File("MyFiletest\\\\author\\Moruf\\Studyeasy.txt");
			file.createNewFile();
			System.out.println("File Created");
		}
	}

}
