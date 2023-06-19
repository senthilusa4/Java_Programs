package user_defined_object;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Shoes  {
	
	private String brand_name;
	private String color;
	private int arraival_year;
	private double price;
	private double offer;
	
	// Constructor
	public Shoes(String brand_name, String color, int arraival_year, double price, double offer) 
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

		
		@SuppressWarnings("unchecked")
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
			
					switch(n)
					{
						case 1: {
									c = new BrandName_sort();
									break;
						        }
						
						case 2: {
							        c = new Color_sort();
							        break;
				                }
				
						case 3: {
									c = new ArraivalYear_sort();
									break;
				                }
				
						case 4: {
									c = new Price_sort();
									break;
		                		}
						
						case 5: {
									c = new Offer_sort();
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