package simple_java;

public class Switch_gradesystem {
	
	public static void main(String args[])
	  {
	  Switch_gradesystem obj = new Switch_gradesystem();
	                     obj.grade('S');
	                     obj.grade('A');
	                     obj.grade('B');
	                     obj.grade('C');
	                     obj.grade('D');
	                     obj.grade('E');
	                     obj.grade('X');
	                     obj.grade('T');
	  }

	    // This method is used for 
	    // Should calculateing the mark based on the grade
	    // Using switch condition
	    public void grade(char grade)
	    {
	    switch(grade)
	      {
	      case 'S' : { 
	                 System.out.println(grade + "-GRADE is -- within 90-100 mark --PASS");
	                 break; 
	                 }
	      case 'A' : { 
	                 System.out.println(grade + "-GRADE is -- within 80-89 mark  --PASS");
	                 break; 
	                 }
	      case 'B' : { 
	                 System.out.println(grade + "-GRADE is -- within 70-79 mark  --PASS");
	                 break; 
	                 }
	      case 'C' : { 
	                 System.out.println(grade + "-GRADE is -- within 60-69 mark  --PASS");
	                 break; 
	                 }
	      case 'D' : { 
	                 System.out.println(grade + "-GRADE is -- within 50-59 mark  --PASS");
	                 break; 
	                 }
	      case 'E' : { 
	                 System.out.println(grade + "-GRADE is -- within 1-49 mark   --FAIL");
	                 break; 
	                 }
	      case 'X' : { 
	                 System.out.println(grade + "-GRADE is -- ABSENT");
	                 break; 
	                 }
	     default :   { 
	                 System.out.println(grade + "-GRADE is not in the list of our GRADE CATEGORY");
	                 break; 
	                 }
	      }
	   }
	}

