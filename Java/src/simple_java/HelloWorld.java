package simple_java;

import java.util.*;

public class HelloWorld {
	
	    public static void main(String[] args) {
	      HelloWorld obj = new HelloWorld();
	                 obj.code();
	    }
	    
	    public void code()
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter string");
	        String s = sc.nextLine();
	        
	        System.out.println(s);
	        
	        char c = 'a';
	        boolean f = false;
	        for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)==c)
	            {
	                f = true;
	                System.out.println("present");
	            }
	            
	        }
	        
	        if(f==false)
	        {
	            System.out.println("NOT present");
	        }
	        
	        
	    }
	}


