package user_defined_object;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class Run_Cricket_Bat{

public static List<Cricket_Bat> sort1() {
		
		Cricket_Bat s1 = new Cricket_Bat("SG", "KASHMIR WILLOW", "GENIUS PLAYER SP", 1101, 15999.99);
		Cricket_Bat s2 = new Cricket_Bat("SG", "KASHMIR WILLOW", "GENIUS LIMITED ET", 1201, 10999.99);
		Cricket_Bat s3 = new Cricket_Bat("SG", "KASHMIR WILLOW", "GENIUS PLAYER SP", 1102, 29999.99);
		Cricket_Bat s4 = new Cricket_Bat("SG", "ENGLISH WILLOW", "GENIUS PLAYER SP", 1103, 49999.99);
		Cricket_Bat s5 = new Cricket_Bat("SG", "KASHMIR WILLOW", "GENIUS PLAYER SP", 1104, 39999.99);
		Cricket_Bat s6 = new Cricket_Bat("SG", "ENGLISH WILLOW", "GENIUS LIMITED ET", 1105, 19999.99);
		Cricket_Bat s7 = new Cricket_Bat("SG", "ENGLISH WILLOW", "GENIUS LIMITED ET", 1106, 11999.99);
		Cricket_Bat s8 = new Cricket_Bat("SG", "ENGLISH WILLOW", "GENIUS LIMITED ET", 1107, 21000.99);

		Cricket_Bat m1 = new Cricket_Bat("MRF", "ENGLISH WILLOW", "GENIUS PLAYER SP", 3101, 29999.99);
		Cricket_Bat m2 = new Cricket_Bat("MRF", "KASHMIR WILLOW", "GENIUS LIMITED ET", 3102, 19999.99);
		Cricket_Bat m3 = new Cricket_Bat("MRF", "ENGLISH WILLOW", "GENIUS LIMITED ET", 3001, 45999.00);
		Cricket_Bat m4 = new Cricket_Bat("MRF", "KASHMIR WILLOW", "GENIUS PLAYER SP", 3101, 29999.99);
		Cricket_Bat m5 = new Cricket_Bat("MRF", "ENGLISH WILLOW", "GENIUS PLAYER SP", 3103, 29999.99);
		Cricket_Bat m6 = new Cricket_Bat("MRF", "KASHMIR WILLOW", "GENIUS LIMITED ET", 3105, 19999.99);
		Cricket_Bat m7 = new Cricket_Bat("MRF", "ENGLISH WILLOW", "GENIUS PLAYER SP", 3002, 45999.00);
		Cricket_Bat m8 = new Cricket_Bat("MRF", "KASHMIR WILLOW", "GENIUS LIMITED ET", 3109, 29999.99);

		
		Cricket_Bat n1 = new Cricket_Bat("NB", "ENGLISH WILLOW", "GENIUS PLAYER SP", 4101, 29999.99);
		Cricket_Bat n2 = new Cricket_Bat("NB", "KASHMIR WILLOW", "GENIUS PLAYER SP", 4102, 39999.99);
		Cricket_Bat n3 = new Cricket_Bat("NB", "KASHMIR WILLOW", "GENIUS LIMITED ET", 4203, 19999.99);
		Cricket_Bat n4 = new Cricket_Bat("NB", "ENGLISH WILLOW", "GENIUS PLAYER SP", 4103, 49999.99);
		Cricket_Bat n5 = new Cricket_Bat("NB", "ENGLISH WILLOW", "GENIUS PLAYER SP", 4101, 29999.99);
		Cricket_Bat n6 = new Cricket_Bat("NB", "ENGLISH WILLOW", "GENIUS LIMITED ET", 4201, 19999.99);
		
		

		List<Cricket_Bat> l = new ArrayList<Cricket_Bat>();
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		l.add(s7);
		l.add(s8);
		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);
		l.add(m5);
		l.add(m6);
		l.add(m7);
		l.add(m8);
		l.add(n1);
		l.add(n2);
		l.add(n3);
		l.add(n4);
		l.add(n5);
		l.add(n6);
		l.add(new Cricket_Bat("NB", "ENGLISH WILLOW", "GENIUS LIMITED ET", 4209, 14999.99));


		Set<Cricket_Bat> s = new LinkedHashSet<Cricket_Bat>(l);
		
		for(Cricket_Bat w : s)
		{
			System.out.print(w);
		}
		
		List<Cricket_Bat> ll = new ArrayList<Cricket_Bat>(s);
		
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("--1-- BAT BRAND_NAME based SORT");
		System.out.println("--2-- BAT WILLOW NAME based SORT");
		System.out.println("--3-- BAT EDITION NAME based SORT");
		System.out.println("--4-- BAT_ID based SORT");
		System.out.println("--5-- BAT RATE based SORT");
		System.out.println("---------------------------------------");
		
		Comparator<Cricket_Bat> c = null;
		
		boolean f = true;
		while(f)
		{
				Scanner sc = new Scanner(System.in);
				System.out.println("Which based sort DO YOU WANT? ");
				int n = sc.nextInt();
					
					switch(n)
					{
						case 1:{
							c = (o1,o2) ->
							{
								Cricket_Bat ss1 = (Cricket_Bat)o1;
								Cricket_Bat ss2 = (Cricket_Bat)o2;
									return (ss1.getBrand_name().compareTo(ss2.getBrand_name()));
							};
							f = false;
							break;
	 				    }					
//------------------------------------------------------------------------------------------------------------------------------
					
						case 2:{
							c = (o1,o2) ->
							{
								Cricket_Bat ss1 = (Cricket_Bat)o1;
								Cricket_Bat ss2 = (Cricket_Bat)o2;
									return ss1.getWillow_name().compareTo(ss2.getWillow_name());
							};
							f = false;
							break;
	 				    }
//------------------------------------------------------------------------------------------------------------------------------
						
						case 3:{
							c = (o1,o2) ->
							{
								Cricket_Bat ss1 = (Cricket_Bat)o1;
								Cricket_Bat ss2 = (Cricket_Bat)o2;
									return ss1.getEdition_name().compareTo(ss2.getEdition_name());
							};
							f = false;
							break;
	 				   }
//-------------------------------------------------------------------------------------------------------------------------------
						case 4 : {
							c = (o1,o2) ->
							{
								Cricket_Bat ss1 = (Cricket_Bat)o1;
								Cricket_Bat ss2 = (Cricket_Bat)o2;
						
								if(ss1.getBat_id()>ss2.getBat_id())
								{
									return 1;
								}
								
								else if(ss1.getBat_id()<ss2.getBat_id())
								{
									return -1;
								}
								else
								{
									return 0;
								}
							};
							f = false;
							break;	
							   }
//---------------------------------------------------------------------------------------------------------------------------------
						case 5:{
							c = (o1,o2) ->
							{
								Cricket_Bat ss1 = (Cricket_Bat)o1;
								Cricket_Bat ss2 = (Cricket_Bat)o2;
						
								if(ss1.getRate()>ss2.getRate())
								{
									return 1;
								}
								
								else if(ss1.getRate()<ss2.getRate())
								{
									return -1;
								}
								else
								{
									return 0;
								}
							};
							f = false;
							break;	
							   }
//---------------------------------------------------------------------------------------------------------------------------------						
						default : {
					        System.err.println("Please enter valid sort");
			                }
					}
	     	}
		
	ll.sort(c);
//	System.out.println(ll);
	return ll;
	
	}
	
	
					public static List<Cricket_Bat> bat_name(List<Cricket_Bat> z)
					{
								
						Scanner sc = new Scanner(System.in);
						System.out.println();
						System.out.println("---------------------------------------");
						System.out.println("---- MRF BAT AVAILABLE");
						System.out.println("---- SG BAT AVAILABLE");
						System.out.println("---- NB BAT AVAILABLE");
						System.out.println("---------------------------------------");
						System.out.println();
						
						List<Cricket_Bat> ll = new ArrayList<Cricket_Bat>(); 
						
								boolean f = true;
								while(f) {
								
								System.out.println("Enter Which Brand_name bat do you want ?");
								String n = sc.nextLine();
								
								String x = n.trim();
								String q = x.toUpperCase();
								
								ListIterator<Cricket_Bat> itr = z.listIterator();
								
											while(itr.hasNext())
											{
												Cricket_Bat c = itr.next();
												if(c.getBrand_name().equals(q))
												{
													ll.add(c);
													f=false;
												}
											}
											
											if(f==false)
											{
												break;
											}
											else
											{
												//f=true;
												System.err.println("Searching brand NOT-AVAILABLE");
											}
									}	
							return ll;		
							}
									
					
					
					            public static List<Cricket_Bat> willow_name(List<Cricket_Bat> z)	
								{
					            	Scanner sc = new Scanner(System.in);
									System.out.println();
									System.out.println("---------------------------------------");
									System.out.println("---- ENGLISH WILLOW BAT AVAILABLE");
									System.out.println("---- KASHMIR WILLOW BAT AVAILABLE");
									System.out.println("---------------------------------------");
									System.out.println();
									
									List<Cricket_Bat> ll = new ArrayList<Cricket_Bat>(); 
									
											boolean f = true;
											while(f) {
											
											System.out.println("SELECT WHICH WILLOW DO YOU WANT?");
											String n = sc.nextLine();
											
											String x = n.trim();
											String q = x.toUpperCase();
											
											
											ListIterator<Cricket_Bat> itr = z.listIterator();
											
												while(itr.hasNext())
												{
													Cricket_Bat c = itr.next();
													if(c.getWillow_name().equals(q))
													{
														ll.add(c);
														f=false;
													}
												}
												
												if(f==false)
												{
													break;
												}
												else
												{
													//f=true;
													System.err.println("Searching WILLOW NOT-AVAILABLE");
												}
											}			
						
								return ll;		
								}	
					            
					            
					            public static List<Cricket_Bat> edition_name(List<Cricket_Bat> z)	
								{	
					            	Scanner sc = new Scanner(System.in);
									System.out.println();
									System.out.println("---------------------------------------");
									System.out.println("---- GENIUS PLAYER SP BAT AVAILABLE");
									System.out.println("---- GENIUS LIMITED ET BAT AVAILABLE");
									System.out.println("---------------------------------------");
									System.out.println();
									
									List<Cricket_Bat> ll = new ArrayList<Cricket_Bat>(); 
									
											boolean f = true;
											while(f) {
											
											System.out.println("SELECT WHICH EDITION BAT DO YOU WANT?");
											String n = sc.nextLine();
											
											String x = n.trim();
											String q = x.toUpperCase();
											
											
											ListIterator<Cricket_Bat> itr = z.listIterator();
											
												while(itr.hasNext())
												{
													Cricket_Bat c = itr.next();
													if(c.getEdition_name().equals(q))
													{
														ll.add(c);
														f=false;
													}
												}
												
														if(f==false)
														{
															break;
														}
														else
														{
															//f=true;
															System.err.println("Searching EDITION BAT NOT-AVAILABLE");
														}
											}	
											
								
								return ll;		
								}	
					            
					            
					            
					            public static List<Cricket_Bat> rate(List<Cricket_Bat> z)
								{
					            	
					            	List<Cricket_Bat> ll = new ArrayList<Cricket_Bat>();
								
									/*
									 * boolean outer = true; while(outer) {
									 */	
									Scanner sc = new Scanner(System.in);
									System.out.println();
									System.out.println("---------------------------------------");
									System.out.println("--1-- Above the RANGE(RATE) based FILTER");
									System.out.println("--2-- Below the RANGE(RATE) based FILTER");
									System.out.println("--3-- Between the RANGE(RATE) based FILTER");
									System.out.println("---------------------------------------");
									System.out.println(); 
									
									ListIterator<Cricket_Bat> itr = z.listIterator();
									
											boolean f = true;
											while(f) {
											
											System.out.println("SELECT WHICH FILTER DO YOU WANT?");
											int n = sc.nextInt();
											
											if(n==1)
											{
												System.out.println("Please enter the amount");
												double o = sc.nextDouble();
												
												while(itr.hasNext())
												{
													Cricket_Bat c = itr.next();
													if(c.getRate()>o)
													{
														ll.add(c);
													}
												}
												f=false;
											}
											
											if(n==2)
											{
												System.out.println("Please enter the amount");
												int o = sc.nextInt();
												
												while(itr.hasNext())
												{
													Cricket_Bat c = itr.next();
													if(c.getRate()<o)
													{
														ll.add(c);
													}
												}
												f=false;
											}
											
											if(n==3)
											{
												System.out.println("Please enter the Till-Till amount");
												int o = sc.nextInt();
												int oo = sc.nextInt();
												
												while(itr.hasNext())
												{
													Cricket_Bat c = itr.next();
													if((c.getRate()>=o)&&(c.getRate()<=oo))
													{
														ll.add(c);
													}
												}
												f=false;
										    }
												
										   }
											
											  if(true != ll.isEmpty())
											  
												 //System.out.println(ll);
												  return ll;
											   
											  else
											  
											      System.err.println("No such range of amount bat in a LIST");
											   //   rate(z);
											    return rate(z);
									  
								}
					            
					            
					            public static void display(List<Cricket_Bat> ll)
					            {
					            	ListIterator<Cricket_Bat> itr = ll.listIterator();
					            	
					            	while(itr.hasNext())
					            	{
					            		Cricket_Bat o = itr.next();
					            		
					            		System.out.println( "ID : " + o.getBat_id() + " || " +
					            		             "BRAND : " + o.getBrand_name() + " || " +	
					            			       "WILLOW : " + o.getWillow_name() + " || " +
					            		         "EDITION : " + o.getEdition_name() + " || " + 
					            			                   "BEST_PRICE : " + o.getRate() );
					            	}
					            }
								
								
											
			
	public static void main(String[] args)
	{
		List<Cricket_Bat> w = sort1();
		display(w);
		
		List<Cricket_Bat> v = bat_name(w);
		display(v);
		
		List<Cricket_Bat> x = willow_name(v);
		display(x);
		
		List<Cricket_Bat> y = edition_name(x);
		display(y);
		
		List<Cricket_Bat> z = rate(y);
		display(z);
	}




}


