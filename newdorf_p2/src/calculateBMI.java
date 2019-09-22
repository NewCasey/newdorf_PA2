import java.util.Scanner;

public class calculateBMI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Press 1 for metric or 2 for imperial units: ");
		int regionSelect = scan.nextInt();
		
		if (regionSelect == 1) {
			System.out.println("You have selected metric units.");
			System.out.println("Enter weight in kilograms: ");
			int weightKg = scan.nextInt();
			System.out.println("Weight = " + weightKg + " kg.");
			System.out.println("Enter height in centimeters: ");
			int heightCm = scan.nextInt();
			System.out.println("Height = " + heightCm + " cm.");
			double finalBMI = (Double.valueOf(weightKg) / Double.valueOf(heightCm * heightCm)) * 10000;
			System.out.println();
			System.out.println("BMI = " + finalBMI + ".");
			System.out.println();		
		}
		if (regionSelect == 2) {
			System.out.println("You have selected imperial units.");
			System.out.println("Enter weight in pounds: ");
			int weightLbs = scan.nextInt();
			System.out.println("Weight = " + weightLbs + " kg.");
			System.out.println("Enter height in inches: ");
			int heightIn = scan.nextInt();
			System.out.println("Height = " + heightIn + " cm.");
			double finalBMI = ((703.0 * Double.valueOf(weightLbs)) / Double.valueOf(heightIn * heightIn));
			System.out.println();
			System.out.println("BMI = " + finalBMI + ".");
			System.out.println();		
		}
		if (regionSelect != 1 & regionSelect !=2) {
		System.out.println("You have chosen neither. Instead, have a list of the BMI categories.");
		System.out.println();		
		}
		System.out.println("Underweight =< 18.5");
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25–29.9");
		System.out.println("Obesity = BMI of 30 or greater");
	}
}
