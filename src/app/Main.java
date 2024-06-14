package app;

public class Main {
    public static  void main(String[] args){
        System.out.println("Temperature Unit Converter App");
        double fahrenheit = 77;
        double celsius = 25;

        double celsiusResult = convFahrenheitToCelsius(fahrenheit);
        double fahrenheitResult = convCelsiusToFahrenheit(celsius);
        System.out.println("Result is:\nCelsius: "+celsiusResult+" Farenheit: "+fahrenheitResult);
    }
    private static double convFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    private static double convCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

}
