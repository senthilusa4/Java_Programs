package file_programs;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_to_upperCase_file {
	
	// Reading the Existing file and  ||   Existing file content should convert to UPPERCASE.
	
	//		# Reading the file || Each Character of the content wisely read
	//                            That read character should change to UpperCase and store to one STRING
	//                            That Upper-case content STRING is an input of the writer
	//                            Write to the Respective path file
	
	public static void main(String[] args) throws IOException
	{
	File f = new File("/home/senthilkumar/Documents/File_IO/second.txt");
	File uf = new File("/home/senthilkumar/Documents/File_IO/UpperCase.txt");
	
	FileReader fr = new FileReader(f);
	
	String s = "";
	int c = fr.read();  // read() = return-type int(ASCII-value to an Respective character) 
	while(c!=-1)
	{
		char u = (char)c; // Convert (or) TypeCaste to char  ||  int to char  
		char z = Character.toUpperCase(u);  
		s = s + z; // Append
		c = fr.read();
	}
	fr.close();
	
	
		FileWriter fw = new FileWriter(uf);
		fw.write(s);
		fw.close();
		
		System.out.println(f.getName());
		System.out.println(uf.getName());
	
		
	
	}
}
