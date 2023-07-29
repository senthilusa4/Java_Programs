package string_programs;

import java.util.Scanner;

public class Dup_word_presence {
	
	public static void main(String[] args) 
	{
		Dup_word_presence obj = new Dup_word_presence();
		                  String sentence = obj.input();
		                  System.out.println(sentence);
		                  String word = obj.find();
		                  System.out.println("FIND WORD = " + word);
		                  
		                  System.out.println();
		                  
		                  obj.dup_presence(sentence,word);
		                  
	}
	
	public String input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence or Paragraph");
		String s = sc.nextLine();
		
		return s;
	}
	
		public String find()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the find word");
			String s = sc.next();
			
			return s;
		}
		
		
				public void dup_presence(String sentence, String word)
				{
					String str[] = sentence.split(" ");
					
					/*
					 * System.out.println("Spliting the word"); for(int i=0;i<str.length;i++) {
					 * System.out.println(str[i]); }
					 */
					
							int count = 0;
							for(int i=0;i<str.length;i++)
							{
								if(str[i].equals(word))
								{
									count++;
								}
							}
							
							System.out.println();
							System.out.println("Duplicate WORD COUNT IS : " + count);
					
					
					
				}

}
