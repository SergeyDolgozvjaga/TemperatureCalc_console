
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Application read data from console and convert one temperature to another.
 *
 * @Author Dolgozvjaga Sergey
 * */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Operations oper = new Operations();

        System.out.println("Enter a number");
        int temp = Integer.parseInt(br.readLine());
        System.out.println("Enter a type: k - kalvin, c - celsius, f - fahrenheit");
        String type = br.readLine();

        if (type.equals("k")){
            System.out.println("Kalvin is: " + temp + " Celsius is: " + oper.kalvinToCelsius(temp) + " Fahrenheit is: " + oper.kalvinToFahrenheit(temp));
        } else if (type.equals("c")){
            System.out.println("Kalvin is: " + new Operations().celsiusToKalvin(temp) + " Celsius is: " + temp + " Fahrenheit is: " + oper.celsiusToFahrenheit(temp));
        } else if(type.equals("f")){
            System.out.println("Kalvin is: " + oper.fahrenheitToKalvin(temp) + " Celsius is: " + oper.fahrenheitToCelsius(temp) + " Fahrenheit is: " + temp);
        }
    }

}
