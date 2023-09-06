/*
 * Created By: Jacob Roe
 * Created On: 9/12/2022
 * Chapter 3 - Room Painting
 * 
 * Modification Log
 * Date			Programmer		Description
 * 9/12/2022	Jacob Roe		Initial Implementation
 * 
 * This program Calculates the cost to paint a room based off of the room size and amount of paint
 */
package Paint;

import java.util.Scanner;

public class PaintCalculations {

	public static void main(String[] args) {
		//Declare Variables
		Scanner keyboard = new Scanner(System.in);
		int length, width, height, price;
		
			//prompt user for length, width, and height
			System.out.print("Enter room length in feet: ");
			length = keyboard.nextInt();
			System.out.print("Enter room width in feet: ");
			width = keyboard.nextInt();
			System.out.print("Enter room height in feet: ");
			height = keyboard.nextInt();

			// call method for price calculation
			price = calcPrice(length, width, height);
			
			//Display final price
			System.out.println("Total price: $" + price);
	}	
	
	public static int calcPrice(int length, int width, int height)
	{
		//Declare local variables
		final int COST = 32;
		int area, gallons, price;
		
		//Calculate wall area
		area = length * height * 2 + width * height *2;
		
		//method call for gallons calculation
		gallons = calcGal(area);
		
		//Display gallons needed
		System.out.println("Gallons needed: " + gallons);
		
		//Compute price
		price = gallons * COST;
		return price;
	}
	
	public static int calcGal(int area)
	{
		//Declare local variables
		final int PAINT = 350;
		int gallons;
		//Calculate gallons needed
		gallons = area / PAINT;
	
		return gallons;
	}

}

