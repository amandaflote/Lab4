package cr;

import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;


public class SearchString {
	
	public SearchString() {}
	
	public void printLines(String pattern, String fileName) throws FileNotFoundException{

			File file = new File(fileName);
			Scanner read = new Scanner(file);
			
			while (read.hasNextLine()) {
				String line = read.nextLine();		
				if(line.toLowerCase().indexOf(pattern.toLowerCase()) != -1) {
					System.out.println(line);
				}
			}
			
			read.close();
			
		}
		
		public static void main(String args[]) throws FileNotFoundException{
			
			SearchString search = new SearchString();
			String pattern = args[1];
			String fileName = args[2];
			search.printLines(pattern, fileName);
		
		}

}
