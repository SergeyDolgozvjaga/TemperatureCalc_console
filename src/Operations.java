
/**
 * Class calculate operations between different temperature systems
 * */
public class Operations {

    private static final int kalvinConst = 273;

    /**Translate Kalvin to Fahrenheit */
    public int kalvinToFahrenheit(int kalvin) {

        int kalvinToFahrenheit = (int) (1.8 * (kalvin - kalvinConst) + 32);
        return kalvinToFahrenheit;
    }

    /** Translate from Celsius to Kalvin */
    public int celsiusToKalvin(int celsius) {

        int celsiusToKalvin = celsius + kalvinConst;
        return celsiusToKalvin;
    }

    /** Translate Fahrenheit to Celsius */
    public int fahrenheitToCelsius(int fahrenheit) {

        int fahrenheitToCelsius = (int) ((fahrenheit - 32) / 1.8);
        return fahrenheitToCelsius;
    }

    /** Translate Kalvin to Celsius */
    public int kalvinToCelsius(int kalvin) {

        int kalvinToCelsius = kalvin - kalvinConst;
        return kalvinToCelsius;
    }

    /** Translate Fahrenheit to Kalvin */
    public int fahrenheitToKalvin(int fahrenheit) {

        int fahrenheitToKalvin = ((5 / 9) * (fahrenheit - 32)) + kalvinConst;
        return fahrenheitToKalvin;
    }

    /** Translate Celsius to Fahrenheit */
    public int celsiusToFahrenheit(int celsius) {

        int celsiusToFahrenheit = ((9 / 5) * celsius + 32);
        return celsiusToFahrenheit;
    }

}
