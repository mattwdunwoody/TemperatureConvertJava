package temperatureApplication;

import java.util.Scanner;

public class temperatureApplications {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Converting Fahrenheit to Celsius
		System.out.println("Convert F to C:\nEnter the temperature in F: ");

		//Get user input
		double fahrenheit = scanner.nextDouble();

		//Calculate result from class library
		double result = temperatureConversionsLibrary.TemperatureConversions.ToCelsius(fahrenheit);

		//Print result
		System.out.println("Result = " + result + " degrees Celcius");

		//---------------------

		//Converting Celsius to Fahrenheit
		System.out.println("\nConvert C to F:\nEnter the temperature in C: ");

		//Get user input
		double celsius = scanner.nextDouble();

		//Calculate result from class library
		double result2 = temperatureConversionsLibrary.TemperatureConversions.ToFahrenheit(celsius);

		//Print result
		System.out.println("Result = " + result2 + " degrees Fahrenheit");
		
		scanner.close();

	}

}
