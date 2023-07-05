package collection_programs;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class List_Student_object {
	
	private int stu_roll_no;
	private String stu_name;
	private int sslc_mark;
	private int hsc_mark;
	
	
	public List_Student_object(int stu_roll_no, String stu_name, int sslc_mark, int hsc_mark) {
		super();
		this.stu_roll_no = stu_roll_no;
		this.stu_name = stu_name;
		this.sslc_mark = sslc_mark;
		this.hsc_mark = hsc_mark;
	}


	public int getStu_roll_no() {
		return stu_roll_no;
	}

	public void setStu_roll_no(int stu_roll_no) {
		this.stu_roll_no = stu_roll_no;
	}


				public String getStu_name() {
					return stu_name;
				}
			
				public void setStu_name(String stu_name) {
					this.stu_name = stu_name;
				}


							public int getSslc_mark() {
								return sslc_mark;
							}
						
							public void setSslc_mark(int sslc_mark) {
								this.sslc_mark = sslc_mark;
							}


										public int getHsc_mark() {
											return hsc_mark;
										}
									
										public void setHsc_mark(int hsc_mark) {
											this.hsc_mark = hsc_mark;
										}


			@Override
			public String toString() {
				return "List_Student_object [stu_roll_no=" + stu_roll_no + ", stu_name="
						+ stu_name + ", sslc_mark=" + sslc_mark + ", hsc_mark=" + hsc_mark
						+ "]";
			}
			
			
			public static void main(String[] args) 
			{
				List_Student_object s1 = new List_Student_object(101,"SACHIN",365,987);
				List_Student_object s2 = new List_Student_object(102,"VIRAT",450,1013);
				List_Student_object s3 = new List_Student_object(104,"DHONI",480,899);
				List_Student_object s4 = new List_Student_object(108,"YUVARAJ",499,1100);
				List_Student_object s5 = new List_Student_object(105,"ROHIT",280,680);
				List_Student_object s6 = new List_Student_object(107,"RAINA",300,700);
				List_Student_object s7 = new List_Student_object(106,"RAINA",175,420);
				List_Student_object s8 = new List_Student_object(103,"JADEJA",450,1013);
				
				
				List<List_Student_object> l = new LinkedList<List_Student_object>();
				
				l.add(s1);
				l.add(s2);
				l.add(s3);
				l.add(s4);
				l.add(s5);
				l.add(s6);
				l.add(s7);
				l.add(s8);
				
				for(List_Student_object o : l)
				{
					System.out.println(o);
				}
				
				System.out.println("---------------------------------------");
				System.out.println("--1-- STUDENT ROLL_NUMBER based SORT");
				System.out.println("--2-- STUDENT NAME based SORT");
				System.out.println("--3-- STUDENT SSLC MARK based SORT");
				System.out.println("--4-- STUDENT HSC MARK based SORT");
				System.out.println("---------------------------------------");
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Which based sort DO YOU WANT? ");
				int n = sc.nextInt();

					Comparator<List_Student_object> c = null;
					
					switch(n)
					{
					case 1:{
						
								c = (o1,o2) ->
								{
									List_Student_object ss1 = (List_Student_object)o1;
									List_Student_object ss2 = (List_Student_object)o2;
							
									if(ss1.getStu_roll_no()>ss2.getStu_roll_no())
									{
										return -1;
									}
									
									else if(ss1.getStu_roll_no()<ss2.getStu_roll_no())
									{
										return 1;
									}
									else
									{
										return 0;
									}
								};
								break;	
								   }
							
					case 2:{
								c = (o1,o2) ->
								{
									List_Student_object ss1 = (List_Student_object)o1;
									List_Student_object ss2 = (List_Student_object)o2;
										return ss1.getStu_name().compareTo(ss2.getStu_name());
								};
								break;
	     				   }
					
					case 3:{
						
								c = (o1,o2) ->
								{
										List_Student_object ss1 = (List_Student_object)o1;
										List_Student_object ss2 = (List_Student_object)o2;
								
										if(ss1.getSslc_mark()>ss2.getSslc_mark())
										{
											return -1;
										}
										
										else if(ss1.getSslc_mark()<ss2.getSslc_mark())
										{
											return 1;
										}
										else
										{
											return 0;
										}
								};
									break;	
	    				     }
					
					case 4:{
								
								c = (o1,o2) ->
								{
										List_Student_object ss1 = (List_Student_object)o1;
										List_Student_object ss2 = (List_Student_object)o2;
								
										if(ss1.getHsc_mark()>ss2.getHsc_mark())
										{
											return -1;
										}
										
										else if(ss1.getHsc_mark()<ss2.getHsc_mark())
										{
											return 1;
										}
										else
										{
											return 0;
										}
								};
							    break;	
	     				   }
					
						   default : {
							         System.out.println("Please enter valid sort");
					                 }
			
                       }
					
					Collections.sort(l, c);
					
					for(List_Student_object z : l)
					{
						System.out.println(z);
					}
					
			sc.close();		
			}
							
}