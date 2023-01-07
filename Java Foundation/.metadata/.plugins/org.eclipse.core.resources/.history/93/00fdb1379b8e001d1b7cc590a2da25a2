package controlStructures.selectionControlStructures;

import java.util.Scanner;

public class FoodDeliveryCost {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Food Type: ");
		char foodType = scanner.next().charAt(0);
		System.out.println("Enter the quantity: ");
		int quantity = scanner.nextInt();
		System.out.println("Enter the distance to your address: ");
		int distance = scanner.nextInt();
		
		int costPerPlate;
		if( foodType == 'N' ) {
			costPerPlate = 15;
		} else if( foodType == 'V' ) {
			costPerPlate = 12;
		} else {
			System.out.println("Invalid foodType!!");
			return;
		}
		
		int deliveryCharge = 0;
		if( distance <= 0 ) {
			System.out.println("Invalid Distance!!");
			return;
		}
		else if( distance > 0 && distance <= 3 ) {
			deliveryCharge = 0;
		} 
		else if( distance > 3 && distance <= 6 ) {
			int i = 1;
			while ( i <= (distance-3) ) {
				deliveryCharge = deliveryCharge + 1;
				i++;
			}
		} 
		else {
			deliveryCharge = deliveryCharge + 3;
			int i = 4;
			while ( i <= (distance-3) ) {
				deliveryCharge = deliveryCharge + 2;
				i++;
			} 
		}
		
		if( quantity <= 0 ) {
			System.out.println("Invalid Quantity!!!");
			return;
		}
		
		int billAmount = costPerPlate*quantity + deliveryCharge;
		
		System.out.println("Your bill Amount is: " + billAmount);
		
		

	}

}
