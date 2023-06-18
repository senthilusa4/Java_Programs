package string_programs;

import java.util.Arrays;

public class Object_based_array implements Comparable<Object_based_array> // Generic

 {
	// INSTANCE VARIABLE  
	private int emp_id;
	private String emp_name;
	private char emp_grade;
	private double emp_salary;
	private String emp_city;
	
		// CONSTRUCTOR
	    public Object_based_array(int emp_id, String emp_name, char emp_grade, double emp_salary, String emp_city) 
	    {
			super();
			this.emp_id = emp_id;
			this.emp_name = emp_name;
			this.emp_grade = emp_grade;
			this.emp_salary = emp_salary;
			this.emp_city = emp_city;
	    }
	    
	    
	    // Setter | Getter method for --Emp_id--
		public int getEmp_id() {
			return emp_id;
		}
		
		public void setEmp_id(int emp_id) {
			this.emp_id = emp_id;
		}

		        // Setter | Getter method for --Emp_name--
				public String getEmp_name() {
					return emp_name;
				}
		
				public void setEmp_name(String emp_name) {
					this.emp_name = emp_name;
				}

			        	// Setter | Getter method for --Emp_grade--
						public char getEmp_grade() {
							return emp_grade;
						}
				
						public void setEmp_grade(char emp_grade) {
							this.emp_grade = emp_grade;
						}
		
						        // Setter | Getter method for --Emp_salary--
								public double getEmp_salary() {
									return emp_salary;
								}
						
								public void setEmp_salary(double emp_salary) {
									this.emp_salary = emp_salary;
								}
						
								        // Setter | Getter method for --Emp_city--
										public String getEmp_city() {
											return emp_city;
										}
								
										public void setEmp_city(String emp_city) {
											this.emp_city = emp_city;
										}
										
										


			// toString method for whatever put in constructor(while-Runtime) that will return
			@Override
			public String toString()
			{
			      return "Object_based_array [emp_id=" + emp_id + ", emp_name=" + emp_name+ ", "
			      		+ "emp_grade=" + emp_grade + ", emp_salary=" + emp_salary+ ", emp_city=" + emp_city + "]";
			}


			// Main method
			public static void main(String args[])
			{
				Object_based_array emp1 = new Object_based_array(101,"Bheem",'S',80000.00,"Chennai");
				Object_based_array emp2 = new Object_based_array(104,"Dolu",'A',60000.00,"Tirupur");
				Object_based_array emp3 = new Object_based_array(103,"Raju",'O',95000.00,"Erode");
				Object_based_array emp4 = new Object_based_array(107,"Jaggu",'A',55000.00,"Coimbatore");
				Object_based_array emp5 = new Object_based_array(123,"Bolu",'B',70000.00,"Karur");
				Object_based_array emp6 = new Object_based_array(102,"Mannu",'B',71000.10,"Dolakpur");
				
				Object_based_array emp[] = {emp1,emp2,emp3,emp4,emp5,emp6};
				
				Arrays.sort(emp);
				
				for(Object_based_array s : emp)
				{
					System.out.println(s);
				}	
			}

						// -- USER DEFINED -- BECAUSE THIS compareTo method abstract 
			            //                    Want access this method means first should define the compareTo method
						public int compareTo(Object_based_array o) {
							
							if(this.getEmp_salary()>o.getEmp_salary())
							{
								return 1;
							}
							
							else if(this.getEmp_salary()<o.getEmp_salary())
							{
								return -1;
							}
							
							else
							{
								return 0;
							}
						}
			
}


