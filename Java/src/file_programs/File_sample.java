package file_programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class File_sample {
	
	public static void main(String[] args) throws IOException
	{
		File f = new File("/home/senthilkumar/Documents/File_IO/First.txt");
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.isFile());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.length());
		f.createNewFile();
		
//		String s = "Virat is greatest of all time";
//		String ss = " Thats meaning GOAT";
		
/*		
		FileOutputStream o = new FileOutputStream(f);  // Override the existing details
		byte b[] = s.getBytes();					   // File creation purpose	
		o.write(b);
		o.close();
	
												             // boolean for given file is there(True) or not(False)	
		FileOutputStream oo = new FileOutputStream(f,true);  // Append to existing detail
		byte bb[] = ss.getBytes();							 // If file is there means only it will append 	
		oo.write(bb);
		oo.close();
*/	
		
		FileInputStream i = new FileInputStream(f);
//System.out.println(i.read());  || This read() method will return first character of the existing file (ASCII-value)
//System.out.println(i.read());  read() method RETURN respective each character ASCII-code
		
			int a = i.read();  // Return ASCII-value (Respective-each character)
			while(a!=-1)
			{
				System.out.print((char)a);
				a = (int)i.read();
			}
			i.close();
			
	}

}

