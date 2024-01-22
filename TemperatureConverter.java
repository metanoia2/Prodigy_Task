import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  for temperature and unit input
        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Enter unit of measurement (Celsius, Fahrenheit, or Kelvin): ");
        String originalUnit = scanner.nextLine().toLowerCase();

        // temperature conversion based on the original unit
        double convertedToFahrenheit = 0;
        double convertedToKelvin = 0;

        switch (originalUnit) {
            case "celsius":
                convertedToFahrenheit = celsiusToFahrenheit(temperature);
                convertedToKelvin = celsiusToKelvin(temperature);
                break;
            case "fahrenheit":
                convertedToFahrenheit = fahrenheitToCelsius(temperature);
                convertedToKelvin = fahrenheitToKelvin(temperature);
                break;
            case "kelvin":
                convertedToFahrenheit = kelvinToFahrenheit(temperature);
                convertedToKelvin = kelvinToCelsius(temperature);
                break;
            default:
                System.out.println("Invalid unit of measurement. Please enter Celsius, Fahrenheit, or Kelvin.");
                System.exit(1); // error code
        }

        //Declare the converted values
        System.out.println("Converted to Fahrenheit: " + convertedToFahrenheit + " °F");
        System.out.println("Converted to Kelvin: " + convertedToKelvin + " K");
    }

    // Temperature conversion formulas
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    private static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    private static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }
}
