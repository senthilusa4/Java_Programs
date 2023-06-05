package simple_java;

// Math class method is for perform some calculation

public class Math_1 {
	
	public static void main(String args[])
	{
		// PI value static variable
		System.out.println(Math.PI);
		
		// ABS - Absoluate method only returns (Positive-value) 
		System.out.println(Math.abs(-5.639));
		System.out.println(Math.abs(-7.6));
		System.out.println(Math.abs(-10));
		System.out.println(Math.abs(-123654789));
		
		// MAX - max method only returns (Maximum-value)
		System.out.println(Math.max(8.456, 10.78965));
		System.out.println(Math.max(123.456, 456980.741));
		System.out.println(Math.max(19, 20));
		System.out.println(Math.max(147852, 369852140));
		
		// Min - min method only returns (Minimum-value)
		System.out.println(Math.min(8.456, 10.78965));
		System.out.println(Math.min(123.456, 456980.741));
		System.out.println(Math.min(19, 20));
		System.out.println(Math.min(147852, 369852140));
		
		// Ceil - ceil method ROUNDs the value upward and return (2.3) is output 3
		System.out.println(Math.ceil(7.896));
		
		// Floor - Floor method ROUNDs the value downward and return (2.3) is output 2
		System.out.println(Math.floor(7.896));
		
		// Round - Round method return as whole value
		System.out.println(Math.round(789.456));
		System.out.println(Math.round(45.63));
		
		// Pow - Power method return X to the power of Y (3^2) = 9
		System.out.println(Math.pow(8, 2));
		
		// Cbrt - Returns cube-root output |  input(9) = 3
		System.out.println(Math.cbrt(9));
		
		// Sqrt - Returns Square-Root output | input(4) = 2
		System.out.println(Math.sqrt(81));
		
		// Signum -Return based on input Positive input-value = 1.0
		//                               Negative input-value = -1.0
		System.out.println(Math.signum(-86532.547));
		System.out.println(Math.signum(8965.25));
	
		// Random - Return below 1 random value (Each_time it's changed)  
		System.out.println(Math.random());
		
		// Rint - Rint like round() but return type is double  |  5.6 = 5.0
		System.out.println(Math.rint(89.456321));
		
		// SubtractExact - SUBTRACT two input values 
		System.out.println(Math.subtractExact(7, 6));
		System.out.println(Math.subtractExact(750, 777));
		
		// AddExtract - ADDING two input values
		System.out.println(Math.addExact(7, 6));
		System.out.println(Math.addExact(750, 777));
		
		// IncrementExtract- increment ADD one value  like (a++)  |  input(5) = 6
		System.out.println(Math.incrementExact(0));
		System.out.println(Math.incrementExact(89));
		
		// DecrementExact - Decrement reduce one value  like (a--) |  input(5) = 4
		System.out.println(Math.decrementExact(0));
		System.out.println(Math.decrementExact(99));
		
		// negateExtract - Input negative value means result came positive 
		//                 Input positive value means result came negative
		System.out.println(Math.negateExact(8));
		System.out.println(Math.negateExact(-8));
	
	}
	
}
