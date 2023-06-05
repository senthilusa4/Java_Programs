package inheritance_programs;

public class Child_bank extends Father_bank {
		
		public static void main(String args[])
		{
			Child_bank obj = new Child_bank();
			int balance = obj.bank_balance();
			System.out.println(balance);
		}

	}


