package simple_java;

public class Switch_program {
	
	public static void main(String args[])
	  {
	  Switch_program obj = new Switch_program();
	                 obj.date(1);
	                 obj.date(2);
	                 obj.date(3);
	                 obj.date(4);
	                 obj.date(5);
	                 obj.date(6);
	                 obj.date(7);
	                 obj.date(12);
	                 obj.date(-2);
	                 
	  }

	    public void date(int date_no)
	    {
	    switch(date_no)
	    {

	      case 1 : {
	               System.out.println(date_no  + " " +  " day of the week is Sunday");
	               break;
	               }
	      case 2 : {
	               System.out.println(date_no  + " " + " day of the week is Monday");
	               break;
	               }
	      case 3 : {
	               System.out.println(date_no + " "  + " day of the week is Thusday");
	               break;
	               }
	      case 4 : {
	               System.out.println(date_no + " "  + " day of the week is Wednesday");
	               break;
	               }
	      case 5 : {
	               System.out.println(date_no + " "  + " day of the week is Thursday");
	               break;
	               }
	      case 6 : {
	               System.out.println(date_no + " " + " day of the week is Friday");
	               break;
	               }
	      case 7 : {
	               System.out.println(date_no + " " + " day of the week is Saturday");
	               break;
	               }
	     default : {
	               System.out.println(date_no + " " + "check your given date");
	               }
	    }
	  }
	

}
