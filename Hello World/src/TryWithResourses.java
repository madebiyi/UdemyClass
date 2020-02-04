import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourses {

	public static void main(String [] args) {
		{
			File file = new File("Filetest");
			file.mkdir();
			file = new File("Filetest\\team.text"); /*try { file.createNewFile(); System.out.println(""); 	} catch (IOException e) { 		System.out.println("erro occur"); 	}*/
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(file , true))){ 
				bw.write("chand");
				bw.newLine();
				bw.write("Salim");
				bw.newLine();
				bw.write("Akin");
				bw.newLine();
				bw.write("Moruf");
				bw.newLine();
				bw.write("Adebiyi");
				System.out.println("Writing onto the file completed");
							
			} catch (IOException e) {
				System.out.println("error occured");
			}
			

			try {
				BufferedReader br = new BufferedReader(new FileReader("Filetest\\team.text"));
				String line;
				System.out.println("*****************************************");
				while((line = br.readLine()) != null) {
					System.out.println(line);
				}
				br.close();
			} catch (FileNotFoundException e) {
				System.out.println("FileNotFoundException");
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}