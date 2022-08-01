
public class MileConversion 
{
	public static void main (String [] args)
	{
		final int INCHES = 63360; 
		final int FEET = 5280;
		final int YARDS = 1760;
		double miles = 0.7;

		double yardsInMile = miles*YARDS;
		double feetInMile = miles*FEET;
		double inchesInMile = miles*INCHES;
		
		System.out.println(miles+ "mile(-s) is " +yardsInMile+ " yards, "
				+feetInMile+ " feet and " +inchesInMile+ "inches.");
		
	}
}
