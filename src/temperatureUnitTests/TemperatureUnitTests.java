package temperatureUnitTests;

import org.junit.Test;
import org.junit.Assert;

public class TemperatureUnitTests {
	
	@Test
	public void FahrenheitToCelsiusTest()
	{
		//Arrange
		double fahrenheit = 77;
		double expected = 25;

		//Act
		double actual = temperatureConversionsLibrary.TemperatureConversions.ToCelsius(fahrenheit);

		//Assert
		Assert.assertEquals(expected, actual, 0);
	}

	@Test
	public void CelsiusToFahrenheitTest()
	{
		//Arrange
		double celsius = 25;
		double expected = 77;

		//Act
		double actual = temperatureConversionsLibrary.TemperatureConversions.ToFahrenheit(celsius);

		//Assert
		Assert.assertEquals(expected, actual, 0);
	}
}
