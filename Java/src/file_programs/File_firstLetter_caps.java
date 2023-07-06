package file_programs;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_firstLetter_caps {
	
	public static void main(String args[]) throws IOException
	{
		File_firstLetter_caps obj = new File_firstLetter_caps();
		                      obj.firstLetter_caps();
	}
	
	public void firstLetter_caps() throws IOException
	{
		File f = new File("/home/senthilkumar/Documents/File_IO/second.txt");
		File uf = new File("/home/senthilkumar/Documents/File_IO/FirstLetter_UpperCase.txt");
		
		uf.createNewFile();
		
		FileReader fr = new FileReader(f);
		
		String s = "";
		int a = fr.read();
		boolean flag = true;
		while(a!=-1)
		{
			if((a!=32)&&(flag == true))
			{
				char z = Character.toUpperCase((char)a);
				s = s + z;
				flag = false;
			}
			
			else if((a!=32)&&(flag==false))
			{
				char z = (char)a;
				s = s + z;
			}
			
			else if(a==32)
			{
				char z = (char)a;
				s=s+z;
				flag = true;
			}
			a = fr.read();
		}
		
		fr.close();
		
		FileWriter fw = new FileWriter(uf);
		fw.write(s);
		fw.close();
		
		System.out.println(f.getName());
		System.out.println(uf.getName());
	
		
	}

}
