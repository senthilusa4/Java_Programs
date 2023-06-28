package user_defined_object;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// COMPARATOR
public class Shoes_with_lambda  {
	
	private String brand_name;
	private String color;
	private int arraival_year;
	private double price;
	private double offer;
	
	// Constructor
	public Shoes_with_lambda(String brand_name, String color, int arraival_year, double price, double offer) 
	{
		super();
		this.brand_name = brand_name;
		this.color = color;
		this.arraival_year = arraival_year;
		this.price = price;
		this.offer = offer;
	}

	// SETTER | GETTER METHOD FOR brand_name
	public String getBrand_name()
	{
		return brand_name;
	}

		public void setBrand_name(String brand_name) 
		{
			this.brand_name = brand_name;
		}

		           // SETTER | GETTER METHOD FOR color
					public String getColor() 
					{
						return color;
					}
				
						public void setColor(String color) 
						{
							this.color = color;
						}

						            // SETTER | GETTER METHOD FOR arraival_year
									public int getArraival_year() 
									{
										return arraival_year;
									}
								
										public void setArraival_year(int arraival_year) 
										{
											this.arraival_year = arraival_year;
										}

										            // SETTER | GETTER METHOD FOR price
													public double getPrice()
													{
														return price;
													}
												
													    public void setPrice(double price) 
													    {
															this.price = price;
														}
												
												                    // SETTER | GETTER METHOD FOR offer
																	public double getOffer()
																	{
																		return offer;
																	}
																
																		public void setOffer(double offer) 
																		{
																			this.offer = offer;
																		}

        // toString method																		
		public String toString() {
			return "Shoes [brand_name=" + brand_name
		+ ", color=" + color
		+ ", arraival_year=" + arraival_year
		+ ", price=" + price 
		+ ", offer="+ offer + "]";
		}

		
		//@SuppressWarnings("unchecked")
		public static void main(String[] args)
		{
			Shoes s1 = new Shoes("SG","WHITE",2023,10000.50,25.00);
			Shoes s2 = new Shoes("NIKE","GREEN",2021,12750.50,17.00);
			Shoes s3 = new Shoes("PUMA","WHITE",2020,21000.50,12.00);
			Shoes s4 = new Shoes("REEBOK","WHITE_WITH_BLUE",2018,8000.50,5.00);
			Shoes s5 = new Shoes("NB","BLACK",2022,17500.75,15.00);
			Shoes s6 = new Shoes("ADIDAS","GREY",2023,17500.75,18.00);
			
			Shoes ss[] = {s1,s2,s3,s4,s5,s6};
			
					System.out.println("Before sorting");
					for(Shoes a : ss)
					{
						System.out.println(a);
			        }
					System.out.println();
					
			
			System.out.println("--1-- Brandname based SORT");
			System.out.println("--2-- Colorname based SORT");
			System.out.println("--3-- Arraival Year based SORT");
			System.out.println("--4-- Price_Amount based SORT");
			System.out.println("--5-- Offer based SORT");		
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter which based sort Do you want : ");
			int n = sc.nextInt();
			
			sc.close();
			
			/*
			 * 		In Arrays.sort(array,comparator) parameter Should pass
			 * 
			 *    ### So Arrays.sort expect one array type parameter | one comparator type parameter
			 *        
			 *         So only we create comparator data-type. 
			 */
			Comparator<Object> c = null;
			
			
					/*
					 * 		Each state have each class That must implements the COMPARE method
					 * 
					 * 		Each class have only one method so its called @Functional_interface anatation
					 *   so we go LAMBDA-EXPRESSION || (concise-code)
					 *   
					 *      memory management || time || can't create class (for only one method contain class || functional_interface)   
					 *      
					 *      it concise code so don't want method signature 
					 *      
					 *      parameter ->
					 *      {
					 *      body || logic 
					 *      };
					 * 
					 * 
					 */
			
					switch(n)
					{
						case 1: {
							
									c = (o1,o2) ->
									{
											Shoes ss1 = (Shoes)o1;
											Shoes ss2 = (Shoes)o2;
											return ss1.getBrand_name().compareTo(ss2.getBrand_name());
									};
									break;
						         }
						
						case 2: {
							        c = (o1,o2) ->
							       	{
							        	Shoes ss1 = (Shoes)o1;
							    		Shoes ss2 = (Shoes)o2;
							    		
							    		return ss1.getColor().compareTo(ss2.getColor());
							    		
					        		};
							       break;
				                }
				
						case 3: {
									c = (o1,o2) ->
											{
										Shoes ss1 = (Shoes)o1;
										Shoes ss2 = (Shoes)o2;
										
										if(ss1.getArraival_year()>ss2.getArraival_year())
										{
											return -1;
										}
										
										else if(ss1.getArraival_year()<ss2.getArraival_year())
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
				
						case 4: {
									c = (o1,o2) ->
									{
										Shoes ss1 = (Shoes)o1;
										Shoes ss2 = (Shoes)o2;
										
										if(ss1.getPrice()>ss2.getPrice())
										{
											return -1;
										}
										
										else if(ss1.getPrice()<ss2.getPrice())
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
						
						case 5: {
									c = (o1,o2) ->
									{
										Shoes ss1 = (Shoes)o1;
										Shoes ss2 = (Shoes)o2;
										
										if(ss1.getOffer()>ss2.getOffer())
										{
											return -1;
										}
										
										else if(ss1.getOffer()<ss2.getOffer())
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
			
			// Comparator based Sorting (Why|Because) In-time we can decide which sorting based output we want
			Arrays.sort(ss, c);  // Comparator(array,Comparator)
			
			System.out.println("After sorting");
			for(Shoes a : ss)
			{
				System.out.println(a);
			}	
			
		}
		
}
