import java.util.Scanner;

public class MileConversion 
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		final int INCHES = 63360; 
		final int FEET = 5280;
		final int YARDS = 1760;
		
		System.out.print("Enter number of miles >> ");
		double miles = input.nextDouble();

		double yardsInMile = miles*YARDS;
		double feetInMile = miles*FEET;
		double inchesInMile = miles*INCHES;
		
		
		System.out.println(miles+ " mile(-s) is " +yardsInMile+ " yards, "
				+feetInMile+ " feet and " +inchesInMile+ " inches.");
		
	}
}
