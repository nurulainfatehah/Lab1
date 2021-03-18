package exercise8;
import java.util.Scanner;

import exercise7.CalculateWeightOnMars;

public class Human {
	private String name;
	
	private String getName(String name)
	{
		return name;
	}
	
	private void setName(String name)
	{
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		
		String name; // attr. to hold value name
		double weight; // attr. to hold value weight
		
		CalculateWeightOnMars mars = new CalculateWeightOnMars();
		// initialize object for class CalculateWeightOnMars
		
		Human human = new Human();
		
		Scanner print = new Scanner(System.in);
		// initialize object for package scanner for display purpose
		
		int choice = 0;
		int counter = 0;
		
		do
		{
			counter++;
			System.out.println();
			System.out.println("===============  Person " + counter + "  ===============");
			System.out.println();
			System.out.println("Please enter your name: "); // ask user for name
			name = print.nextLine();
			
			human.setName(name);
			
			System.out.println();
			
			
			System.out.println("Please enter your weight: (kg)"); // ask user for weight in kilograms
			weight = print.nextDouble(); // read input on console
			mars.setWeight(weight); // send value from attr. weight to method setWeight from class CalculateWeightOnMars
			
			System.out.println();
			System.out.println("Enter 1 to enter weight of next person.");
			choice = print.nextInt();
			print.nextLine();
			
		}while(choice == 1);
		
		
		
		System.out.println();
		System.out.println("The list of information of people's weight would be as follows: ");
		
	}
	
	
}

