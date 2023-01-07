package controlStructures.iterationControlStructures;

import java.util.Scanner;

public class NoOfRabbitsAndChickenInFarm {

	public static void main(String[] args) {
		
//		Find the number of rabbits and chickens in a farm.
//		Given the number of heads and legs of the chickens and rabbits.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Total No. of Heads: ");
		int heads = scanner.nextInt();
		System.out.println("Enter the Total No. of Legs: ");
		int legs = scanner.nextInt();
		
		int rabbits = legs/2 - heads;
		int chicken = 2*heads - legs/2;
		
		if( (4*rabbits + 2*chicken) == legs ) {
			System.out.println("Chicken: " + chicken + ", Rabbits: " + rabbits);
		} else {
			System.out.println("The number of chicken and rabbits cannot be found!!");
		}

	}

}
