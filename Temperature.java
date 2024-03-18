package temperature;
import java.util.Scanner;


public class Temperature {
    public static double celsiusTofahrenheit (double celsius){
        return (celsius *9/5 +32); 
    }
    
    public static double fahrenheitTocelsius (double fahrenheit){
        return (fahrenheit -32) *5/9;
    }
    
    public static void main (String args []){
        
        Scanner input = new Scanner (System.in);
        System.out.println("Input the Celsius");
        
        double val = input.nextDouble();
        
        double celsius = val;
        double fahrenheit = fahrenheitTocelsius (celsius);
        System.out.println( celsius + "C is to "+ fahrenheit + "F" );
        
    }
}
