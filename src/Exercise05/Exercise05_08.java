package Exercise05;

/*
 *  @author Shubham Dankhara  (D21cs108)
 *  
 *  
 *  (Conversions between Celsius and Fahrenheit) Write a class that contains the following two methods: 
 *  /** Convert from Celsius to Fahrenheit 
 *  public static double celsiusToFahrenheit(double celsius)
 *  /** Convert from Fahrenheit to Celsius
 *  public static double fahrenheitToCelsius(double fahrenheit)
 *  /** Convert from Fahrenheit to Celsius
 *  public static double fahrenheitToCelsius(double fahrenheit)
 *  
 *  Write a test program that invokes these methods to display the following tables:
 *  Celsius  Fahrenheit | Fahrenheit Celsius
 *  40.0 	  	  104.0 | 120.0 		48.89 
 *  39.0		  102.2 | 110.0 		43.33
 *  ...
 *  32.0		   89.6 | 40.0 		4.44
 *  31.0		   87.8 | 30.0 		-1.11
*/
public class Exercise05_08 {

	public static void main(String[] args) {
		
		// print table format
		System.out.println("Celsius     Fahrenheit     |    Fahrenheit     Celsius\n"
				+ "-------------------------------------------------------");
		
		// declare celsius = 40
		double celsius = 40;
		
		// declare fahrenhit = 120
		double fahrenheit = 120;

		// For loop it will continue for 10 times
		for (int i = 1; i <= 10; celsius--, fahrenheit -= 10, i++) {
			
			// print celcius column after -15 space and 1 value after dot(".")
			System.out.printf("%-15.1f", celsius);
			
			// print fahrenheit column after -12 space and 1 value after dot(".")
			System.out.printf("%-12.1f|\t", celsiusToFahrenheit(celsius));
			
			// print fahrenheit column after -15 space and 1 value after dot(".")
			System.out.printf("%-15.1f", fahrenheit);
			
			// print celcius column and 1 value after dot(".")
			System.out.printf("%.2f\n", fahrenheitToCelsius(fahrenheit));
		}
	}

	// Methods

	// Convert from Celsius to Fahrenheit
	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}

	// Convert from Fahrenheit to Celsius
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}

}
