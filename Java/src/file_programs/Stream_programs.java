package file_programs;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream_programs {

	public static void main(String[] args) throws IOException 
	{
		File f = new File("/home/senthilkumar/Documents/File_IO/second.txt");
		f.createNewFile();
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.getPath());
		System.out.println(f.isDirectory());
		System.out.println(f.getName());
	
		DataInputStream d = new DataInputStream(System.in);     // whatever given in console it will read
															  	
		FileOutputStream fos = new FileOutputStream(f,true);    // That read the console contenT write  
		
		BufferedOutputStream b = new BufferedOutputStream(fos); // Load the reading content AND write as whole
		
			int z;
			while((z=d.read())!='~')
			{
				b.write(z);
			}	
	    b.close();			
	}
}
