import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadFileData {
	public static void main(String[] args) {
		//demo1();
		readingLine();
	}
	
	private static void readingLine() {
		try {
			//Creatiing reader obj
			Reader reader = new FileReader("./input.txt");
			//Creating BufferedReaader obj
			BufferedReader bufferedReader = new BufferedReader(reader);
			//Reading the line
			String line = bufferedReader.readLine();
			
			
			//Reading multiple characters
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void demo1() {
		try {
			
			Reader reader = new FileReader("input.txt");
			//Reading single character
			int character = reader.read();
			
			//Reading multiple characters
			while(character != -1) {
				System.out.println((char)character);
				character = reader.read();
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
