package user_defined_object;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class Run_Cricket_Bat {

public static List<Cricket_Bat> sort1() {
		
		Cricket_Bat s1 = new Cricket_Bat("SG", "Kashmir-Willow", "Profile Xtreme", 1101, 15999.99);
		Cricket_Bat s2 = new Cricket_Bat("SG", "Kashmir-Willow", "Profile Xtreme", 1201, 10999.99);
		Cricket_Bat s3 = new Cricket_Bat("SG", "Kashmir-Willow", "RSD Xtreme", 1102, 29999.99);
		Cricket_Bat s4 = new Cricket_Bat("SG", "English-Willow", "RSD Xtreme", 1103, 49999.99);
		Cricket_Bat s5 = new Cricket_Bat("SG", "Kashmir-Willow", "RSD Xtreme", 1104, 39999.99);
		Cricket_Bat s6 = new Cricket_Bat("SG", "English-Willow", "Profile Xtreme", 1105, 19999.99);
		Cricket_Bat s7 = new Cricket_Bat("SG", "English-Willow", "Profile Xtreme", 1106, 11999.99);
		Cricket_Bat s8 = new Cricket_Bat("SG", "English-Willow", "Profile Xtreme", 1107, 21000.99);

		Cricket_Bat m1 = new Cricket_Bat("MRF", "English-Willow", "Genius Player SP", 3101, 29999.99);
		Cricket_Bat m2 = new Cricket_Bat("MRF", "Kashmir-Willow", "Genius Limited ET", 3102, 19999.99);
		Cricket_Bat m3 = new Cricket_Bat("MRF", "English-Willow", "Genius Player Sp", 3001, 45999.00);
		Cricket_Bat m4 = new Cricket_Bat("MRF", "Kashmir-Willow", "Genius Player SP", 3101, 29999.99);
		Cricket_Bat m5 = new Cricket_Bat("MRF", "English-Willow", "Genius Player SP", 3103, 29999.99);
		Cricket_Bat m6 = new Cricket_Bat("MRF", "Kashmir-Willow", "Genius Limited ET", 3105, 19999.99);
		Cricket_Bat m7 = new Cricket_Bat("MRF", "English-Willow", "Genius Player Sp", 3002, 45999.00);
		Cricket_Bat m8 = new Cricket_Bat("MRF", "Kashmir-Willow", "Genius Player SP", 3109, 29999.99);

		
		Cricket_Bat n1 = new Cricket_Bat("NB", "English-Willow", "Tc Player SP", 4101, 29999.99);
		Cricket_Bat n2 = new Cricket_Bat("NB", "Kashmir-Willow", "Tc Player SP", 4102, 29999.99);
		Cricket_Bat n3 = new Cricket_Bat("NB", "Kashmir-Willow", "Dc Player Sp", 4203, 19999.99);
		Cricket_Bat n4 = new Cricket_Bat("NB", "English-Willow", "Tc Player SP", 4103, 29999.99);
		Cricket_Bat n5 = new Cricket_Bat("NB", "English-Willow", "Tc Player SP", 4101, 29999.99);
		Cricket_Bat n6 = new Cricket_Bat("NB", "English-Willow", "Dc Player Sp", 4201, 19999.99);
		
		

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
									return ss1.getBrand_name().compareTo(ss2.getBrand_name());
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
	System.out.println(ll);
	return ll;
	
	}
	
	
					public static List<Cricket_Bat> bat_name(List<Cricket_Bat> z)
					{
								
						Scanner sc = new Scanner(System.in);
						System.out.println();
						System.out.println("---------------------------------------");
						System.out.println("--1-- MRF BAT based SORT");
						System.out.println("--2-- SG BAT based SORT");
						System.out.println("--3-- NB BAT based SORT");
						System.out.println("---------------------------------------");
						System.out.println();
						
						List<Cricket_Bat> ll = new ArrayList<Cricket_Bat>(); 
						
								boolean f = true;
								while(f) {
								
								System.out.println("Enter Which Brand_name bat do you want ?");
								int n = sc.nextInt();
								
								ListIterator<Cricket_Bat> itr = z.listIterator();
								
								switch(n)
								{
								
								case 1: {
											while(itr.hasNext())
											{
												Cricket_Bat c = itr.next();
												if(c.getBrand_name().equals("MRF"))
												{
													ll.add(c);
												}
											}
											f= false;
											break;
								        }
								
								case 2 : {
											while(itr.hasNext())
											{
												Cricket_Bat c = itr.next();
												if(c.getBrand_name().equals("SG"))
												{
													ll.add(c);
												}
											}
											f= false;
											break;
								         }
								
								
								case 3: {
											while(itr.hasNext())
											{
												Cricket_Bat c = itr.next();
												if(c.getBrand_name().equals("NB"))
												{
													ll.add(c);
												}
											}
											f= false;
											break;
							        	}
								
								default : {
									System.err.println("Please check your given input");
								}	
							}
						}
					System.out.println(ll);
					return ll;
					}
					
					
					
					            public static List<Cricket_Bat> willow_name(List<Cricket_Bat> z)	
								{
					            	Scanner sc = new Scanner(System.in);
									System.out.println();
									System.out.println("---------------------------------------");
									System.out.println("--1-- ENGLISH WILLOW BAT based SORT");
									System.out.println("--2-- KASHMIR WILLOW BAT based SORT");
									System.out.println("---------------------------------------");
									System.out.println();
									
									List<Cricket_Bat> ll = new ArrayList<Cricket_Bat>(); 
									
											boolean f = true;
											while(f) {
											
											System.out.println("SELECT WHICH WILLOW DO YOU WANT?");
											int n = sc.nextInt();
											
											ListIterator<Cricket_Bat> itr = z.listIterator();
											
											switch(n)
											{
											
											case 1: {
														while(itr.hasNext())
														{
															Cricket_Bat c = itr.next();
															if(c.getWillow_name().equals("English-Willow"))
															{
																ll.add(c);
															}
														}
														f= false;
														break;
											        }
											
											case 2 : {
														while(itr.hasNext())
														{
															Cricket_Bat c = itr.next();
															if(c.getWillow_name().equals("Kashmir-Willow"))
															{
																ll.add(c);
															}
														}
														f= false;
														break;
											         }
											default : {
												System.err.println("Please check your given input");
											}
										}
								    }
											
									System.out.println(ll);
									return ll;		
								}	
					            
					            
					            
					            public static void rate(List<Cricket_Bat> z)
								{
											
									Scanner sc = new Scanner(System.in);
									System.out.println();
									System.out.println("---------------------------------------");
									System.out.println("--1-- Above the RATE based SORT");
									System.out.println("--2-- Below the RATE based SORT");
									System.out.println("--3-- Between the RATE based SORT");
									System.out.println("---------------------------------------");
									System.out.println();
									
									
									
									List<Cricket_Bat> ll = new ArrayList<Cricket_Bat>(); 
									
									ListIterator<Cricket_Bat> itr = z.listIterator();
									
											boolean f = true;
											while(f) {
											
											System.out.println("SELECT ABOVE | BELOW | BETWEEN RANGE AMOUNT?");
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
									  { 
										  System.out.println(ll); 
									  } 
									  else
									  {
									      System.err.println("No such range of amount bat in a LIST");
									      rate(z);
									  }
									 
								}
								
								
											
			
	public static void main(String[] args)
	{
		List<Cricket_Bat> w = sort1();
		List<Cricket_Bat> v = bat_name(w);
		List<Cricket_Bat> x = willow_name(v);
							  rate(x);						
	}


}


