package string_programs;

public class Student_toString {
	
	private String name;
	private int sslc_mark;
	private long aadhar_no;
	final private static String standard = "10-th Result ";
	
	Student_toString(String name,int sslc_mark)
	{
		this.name = name;
		this.sslc_mark = sslc_mark;
	}
	
	Student_toString(String name,int sslc_mark,long aadhar_no)
	{
		this.name = name;
		this.sslc_mark = sslc_mark;
		this.aadhar_no = aadhar_no;
	}
	
			// getter method sslc_mark
			public String get_sslc_mark()
			{
				return name;
			}
			// // setter method sslc_mark
			public void set_sslc_mark(int s)
			{
				this.sslc_mark = s;
				//return sslc_mark;
			}
			
			       // getter method name
					public String get_name()
					{
						return name;
					}
					// setter method name
					public void set_name(String s)
					{
						this.name = s;
						//return name;
					}
					
					        // getter method aadhar_no
							public long get_aadhar_no()
							{
								return aadhar_no;
							}
							// setter method aadhar_no
							public void set_aadhar_no(long s)
							{
								aadhar_no = s;
								//return aadhar_no;
							}
							

							@Override
							public String toString() {
								return "Student_toString [standard=" + standard + ", name=" + name + ", sslc_mark=" + sslc_mark + ", aadhar_no="
										+ aadhar_no + "]";
							}
							
		

							@Override
							public boolean equals(Object obj) {
								
								Student_toString o = (Student_toString)obj;
								
								if (this.get_aadhar_no() ==  o.get_aadhar_no())
									return true;
								if (obj == null)
									return false;
								if (getClass() != obj.getClass())
									return false;
								Student_toString other = (Student_toString) obj;
								return aadhar_no == other.aadhar_no;
							}
							

							
		// Given 3 Details_of_object any duplicate came means 
		// In output can't shown without duplicate object(Based on Aadhar_detail)
		public static void main(String[] args) 
		{
			Student_toString dolu = new Student_toString("dolu",480);
			Student_toString bolu = new Student_toString("bolu",470,732101253695l);
			Student_toString bheem = new Student_toString("bheem",470,732101253695l);
			dolu.set_aadhar_no(737010140800l);
			
		//	System.out.println(bolu);
		    System.out.println(dolu.toString());
		    System.out.println(bolu.toString());
			System.out.println(bheem.toString());
			
			
			System.out.println("After remove duplicate  :");
			
			System.out.println(dolu);
			if(false == dolu.equals(bheem)&&false == bolu.equals(bheem))
			{
				System.out.println(bheem);
			}
			
			if(false == bolu.equals(dolu))
			{
				System.out.println(bolu);
			}
			
		}				
						
		
	
	

}
