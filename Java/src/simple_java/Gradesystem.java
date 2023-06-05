package simple_java;

public class Gradesystem {
	
	public static void main(String args[])
	  {
	    Gradesystem obj = new Gradesystem();
	                obj.grade(70); 
	    System.out.println("-------------------------------------");
	  }

	    // This method used for
	    // To calculateing the grade system based on the mark
	    // Using IFELSE lader condition
	    public void grade(int mark)
	    {
	    System.out.println(""); 
	    System.out.println("90 to 100 mark means Its an S-GRADE");
	    System.out.println("80 to 89 mark means Its an  A-GRADE"); 
	    System.out.println("70 to 79 mark means Its an  B-GRADE");
	    System.out.println("60 to 69 mark means Its an  C-GRADE");
	    System.out.println("50 to 59 mark means Its an  D-GRADE");
	    System.out.println("Lessthan 50 mark means Its an E-GRADE");
	    System.out.println("");
	    System.out.println("-------------------------------------");
	    

	    if((mark >= 90) && (mark <= 100))
	    {
	    System.out.println(mark + " mark is = S-Grade");
	    }
	        else if((mark >= 80) && (mark <= 89))
	        {
	        System.out.println(mark + " mark is = A-Grade");
	        }
	              else if((mark >= 70) && (mark <= 79))
	              {
	              System.out.println(mark + " mark is = B-Grade");
	              }       
	                    else if((mark >= 60) && (mark <= 69))
	                    {
	                    System.out.println(mark + " mark is = C-Grade");
	                    } 
	                          else if((mark >= 50) && (mark <= 59))
	                          {    
	                          System.out.println(mark + " mark is = D-Grade");
	                          } 
	                                else if((mark >= 0) && (mark <= 49))
	                                {
	                                System.out.println(mark + " mark is = E-Grade");
	                                }       
	                                      else 
	                                      {
	                                      System.out.println(mark + " This mark is not valid");
	                                      }  
	     }
	}

