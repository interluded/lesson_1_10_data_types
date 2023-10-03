import java.util.Scanner;

public class TemperatureConversion
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter temperature in degrees celsius:");
        double temp_C = scan.nextDouble();
        int conversion_variable = 32;
        System.out.println((temp_C * 9/5) + conversion_variable);

    }
}