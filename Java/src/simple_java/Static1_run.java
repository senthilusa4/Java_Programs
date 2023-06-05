package simple_java;

public class Static1_run {
	
	public static void main(String[] args) {
		
		Static1 dolu = new Static1(); // Creating no arguments constructor
		Static1 bolu = new Static1("senthil");  // Creating single argument constructor
		
		dolu.display(); // Display based on the dolu object  // non static method
		bolu.display(); // Display based on the bolu object  // non static method
		dolu.print();   // Static method 
	}

}
