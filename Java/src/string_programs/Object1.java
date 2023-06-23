package string_programs;

import java.util.Objects;
import java.util.Scanner;

public class Object1 {
	
	private String name;
	private int sslc_mark;
	private int hsc_mark;
	private String degree;
	private double degree_cgpa;
	
	
	public Object1(String name, int sslc_mark, int hsc_mark, String degree, double degree_cgpa) 
	{
		super();
		this.name = name;
		this.sslc_mark = sslc_mark;
		this.hsc_mark = hsc_mark;
		this.degree = degree;
		this.degree_cgpa = degree_cgpa;
	}

	// SETTER | GETTER METHOD FOR NAME
	public String getName() {
		return name;
	}

    public void setName(String name) {
		this.name = name;
	}

	        // SETTER | GETTER METHOD FOR SSLC_MARK
			public int getSslc_mark() {
				return sslc_mark;
			}
		
			public void setSslc_mark(int sslc_mark) {
				this.sslc_mark = sslc_mark;
			}

			        // SETTER | GETTER METHOD FOR HSC_MARK
					public int getHsc_mark() {
						return hsc_mark;
					}
				
					public void setHsc_mark(int hsc_mark) {
						this.hsc_mark = hsc_mark;
					}

					        // SETTER | GETTER METHOD FOR DEGREE
							public String getDegree() {
								return degree;
							}
						
							public void setDegree(String degree) {
								this.degree = degree;
							}

							        // SETTER | GETTER METHOD FOR DEGREE_CGPA
									public double getDegree_cgpa() {
										return degree_cgpa;
									}
								
									public void setDegree_cgpa(double degree_cgpa) {
										this.degree_cgpa = degree_cgpa;
									}

									
		// toString method							
		@Override
		public String toString() {
			return "Object1 [name=" + name + ", sslc_mark=" + sslc_mark + ", "
					+ "hsc_mark="+ hsc_mark + ", degree=" + degree + ", degree_cgpa=" + degree_cgpa	+ "]";
		}
	

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Object1 other = (Object1) obj;
			return Objects.equals(degree, other.degree)
					&& Double.doubleToLongBits(degree_cgpa) == Double.doubleToLongBits(other.degree_cgpa)
					&& hsc_mark == other.hsc_mark && Objects.equals(name, other.name) && sslc_mark == other.sslc_mark;
		}

		public static void main(String[] args)
		{
			System.out.println("How many user details you want enter");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			Object1 o[] = new Object1[n];
			
				for(int i=0;i<n;i++)
				{
					System.out.println("Enter user " + (i+1) + " Detail");
					
					System.out.print("Enter UserName : ");
					String name = sc.next();
					System.out.println();
					
						System.out.print("Enter Your SSLC_mark : ");
						int sslc_mark = sc.nextInt();
						System.out.println();
						
							System.out.print("Enter Your HSC_mark : ");
							int hsc_mark = sc.nextInt();
							System.out.println();
							
								System.out.print("Enter Your degree : ");
								String degree = sc.next();
								System.out.println();
								
									System.out.print("Enter Your DEGREE CGPA");
									double degree_cgpa = sc.nextDouble();
									System.out.println();
									
					Object1 obj = new Object1(name,sslc_mark,hsc_mark,degree,degree_cgpa);
					
						boolean f = false;
						for(int j=0;j<n;j++)
						{
							if(obj.equals(o[j]))
							{
								f = true;
								break;
							}
						}	
						
							if(f == false)
							{
								o[i] = obj; 
							}
							System.out.println();
				}
				
					for(int i=0;i<o.length;i++)
					{
						System.out.println(o[i]);
					}
			}
		
   }															
	

