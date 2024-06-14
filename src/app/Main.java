package app;

public class Main {
    public static  void main(String[] args){
        System.out.println("Temperature Unit Converter App");
        double fahrenheit = 77;

        double celsiusResult = convFahrenheitToCelsius(fahrenheit);
        System.out.println("Result is: Celsius:"+celsiusResult);
    }
    private static double convFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}
