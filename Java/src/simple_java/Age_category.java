package simple_java;

public class Age_category {
	
	public static void main(String args[])
	  {
	  Age_category obj = new Age_category();
	               obj.agetable(19);
	  System.out.println("-------------------------------------------------------------");
	  }

	    // This method is used for
	    // Based on the age | should divide the category of the age
	    // Using IFELSE Lader condition
	    public void agetable(int age)
	    {
	    System.out.println("");
	    System.out.println(" 0 to 5 age people are come's under the CHILD category");
	    System.out.println(" 6 to 12 age people are come's under the BOYZ category");
	    System.out.println("13 to 19 age people are come's under the TEEN category");
	    System.out.println("20 to 30 age people are come's under the YOUTH category");
	    System.out.println("31 to 60 age people are come's under the ADULT category");
	    System.out.println(" 0 to 5 age people are come's under the SENIOR-MEN category");
	    System.out.println("");
	    System.out.println("-------------------------------------------------------------");
	         
	    if((age >= 0) && (age <= 5))
	    {
	    System.out.println(age + " age is come under the CHILD category");
	    }
	        else if((age >= 6) && (age <= 12))
	        {
	        System.out.println(age + " age is come under the BOYZ category");
	        }
	             else if((age >= 13) && (age <= 19))
	             {
	             System.out.println(age + " age is come under the TEEN category");
	             }
	                  else if((age >= 20) && (age <= 30))
	                  {
	                  System.out.println(age + " age is come under the YOUTH category");
	                  }
	                       else if((age >= 31) && (age <= 60))
	                       {
	                       System.out.println(age + " age is come under the ADULT category");
	                       }
	                            else if((age >= 61) && (age <= 200))
	                            { 
	                            System.out.println(age + " age is come under the SENIOR-MEN category");
	                            }
	                                 else 
	                                 {
	                                 System.out.println(age + " age is not acceptable and please enter correct age");
	                                 }          

	    }
	}


