package testScenarios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class ThruTextFile {
	File fc;  // set file name
	FileWriter fw;    //set file writer
	BufferedWriter bw;  // set buffered writer
	FileReader fr;  // set file reader
	BufferedReader br; // set buffered reader
	String src="C:\\Selenium\\workspace\\Data.txt";   // set source as string
	
	@Test
	public void readFrmTextFile() throws IOException {
		fc=new File(src);
		fc.createNewFile();
		fw=new FileWriter(src);
		bw=new BufferedWriter(fw);
		bw.write("this is my first line");
		bw.newLine();
		bw.write("This is my second line");
		bw.newLine();
		bw.write("This is my third line");
		bw.newLine();
		bw.close();   // Always close buffered writer
		fr=new FileReader(src);
		br=new BufferedReader(fr);
		String cont=null;
		while((cont=br.readLine())!=null) {
			System.out.println(cont);
			
		}
		
		
		
	}
	
	
}
