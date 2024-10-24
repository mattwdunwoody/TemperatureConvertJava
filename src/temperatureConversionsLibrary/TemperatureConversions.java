package temperatureConversionsLibrary;

public class TemperatureConversions {
	public static double ToFahrenheit(double celsius)
	{
		double fahrenheit = ((celsius * 9) / 5) + 32;
		return fahrenheit;
	}
	public static double ToCelsius(double fahrenheit)
	{
		double celsius = (fahrenheit - 32) * 5 / 9;
		return celsius;
	}
}
