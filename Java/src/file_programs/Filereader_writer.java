package file_programs;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filereader_writer {
	
	// FileWriter ||  Write whole string to the Respective file
	
	public static void main(String[] args) throws IOException 
	{
		File f = new File("/home/senthilkumar/Documents/File_IO/third.txt");
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.getName());
		
		String s = "Think positive and stay positive";
		
		FileWriter w = new FileWriter(f);
		w.write(s);  // This method write as a whole string 
		w.close();
		
				FileReader r = new FileReader(f);
				
				int c = r.read();
				while(c!=-1)
				{
					System.out.print((char)c);
					c = r.read();
				}
				
				r.close();
	}
}
