package simple_java;

public class Typecasting {
	

	  /* Typecasting (within a range - we do typecasting means the result will understandable) 
	                 (outof the range - we do typecasting means the result will not understandable) 
	     (EX) int a = 125;
	          byte b = (byte)a; [it works fine & understandable]
	     (EX) int a = 180;
	          byte b = (byte)a; [its works but, not understandable]
	  */

	  public static void main(String args[])
	    {
	    Typecasting obj = new Typecasting();
	                obj.short_to_int(); 
	                obj.short_to_float();
	                obj.byte_to_char();
//	                obj.short_to_boolean();
	                obj.int_to_byte();
	                obj.long_to_float();
	                obj.int_to_char();
//	                obj.boolean_to_byte();
	                obj.char_to_byte();
	                obj.double_to_byte();
	    }

	      // This method is used for Typecasting (short to int) | implicit typecasting  |  low value to high - widening
	      public void short_to_int()
	        {
	        short num = 85;
	        int num1 = num;
	        System.out.println("short num = " + num);
	        System.out.println("int num1 = " + num1);
	        System.out.println("-------------------");
	        }
	      
	          // This method is used for Typecasting (short to float) | implicit typecasting  |  low value to high - widening
	          public void short_to_float()
	          {
	          short num = 85;
	          float num1 = num;
	          System.out.println("short num = " + num);
	          System.out.println("float num1 = " + num1);
	          System.out.println("-------------------");
	          }
	          
	            // This method is used for Typecasting (byte to char) | implicit typecasting  |  low value to high - widening
	            public void byte_to_char()
	            {
	            short n = 126;
	            char num1 = 'n';
	            System.out.println("byte num = " + n);
	            System.out.println("char num1 = " + num1);
	            System.out.println("-------------------");
	            }  
	              
	/*            // This method is used for Typecasting (short to boolean) | implicit typecasting  |  low value to high - widening
	              public void short_to_boolean()
	              {
	              short num = 85;
	              boolean num1 = (boolean)num;
	              System.out.println("short num = " + num);
	              System.out.println("boolean num1 = " + num1);
	              }
	*/   

	                // This method is used for Typecasting (int to byte) | explicit typecasting  |  high value to low - narrowing
	                public void int_to_byte()
	                {
	                int num = 126;
	                byte num1 = (byte)num;
	                System.out.println("int num = " + num);
	                System.out.println("byte num1 = " + num1);
	                System.out.println("-------------------");
	                }
	                 
	                  // This method is used for Typecasting (long to float) | explicit typecasting  |  high value to low - narrowing
	                  public void long_to_float()
	                  {
	                  long num = 123456789123456789l;
	                  double num1 = num;
	                  System.out.println("long num = " + num);
	                  System.out.println("float num1 = " + num1);
	                  System.out.println("-------------------");
	                  } 

	                     // This method is used for Typecasting (int to char) | explicit typecasting  |  high value to low - narrowing
	                     public void int_to_char()
	                     {
	                     int n = 33564;
	                     char num1 = (char)'n';
	                     System.out.println("int num = " + n);
	                     System.out.println("char num1 = " + num1);
	                     System.out.println("-------------------");
	                     }

	/*                      // This method is used for Typecasting (int to char) | implicit typecasting  |  low value to high - widening
	                        public void boolean_to_byte()
	                        {
	                        boolean n = true;
	                        byte num1 = (byte)n;
	                        System.out.println("boolean num = " + n);
	                        System.out.println("byte num1 = " + num1);
	                       }
	*/
	                         // This method is used for Typecasting (char to byte) | explicit typecasting  |  high value to low - narrowing
	                         public void char_to_byte()
	                         {
	                         char n = '9';
	                         byte num1 = (byte)n;
	                         System.out.println("char num = " + n);
	                         System.out.println("byte num1 = " + num1);
	                         System.out.println("-------------------");
	                         }

	                            // This method is used for Typecasting (float to byte) | explicit typecasting  |  high value to low - narrowing
	                            public void double_to_byte()
	                            {
	                            double n = 33.29;
	                            byte num1 = (byte)n;
	                            System.out.println("double n = " + n);
	                            System.out.println("byte num1 = " + num1);
	                            System.out.println("-------------------");
	                            }
	                     
	}  


