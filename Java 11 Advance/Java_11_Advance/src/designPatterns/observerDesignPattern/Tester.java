package designPatterns.observerDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tester {

	public static void main(String[] args) throws IOException {
		
		Subscriber subscriber1 = new Subscriber("Shikha");
		Subscriber subscriber2 = new Subscriber("Greg");

		YoutubeChannel youtubeChannel = new YoutubeChannel();
		youtubeChannel.subscribe(subscriber1);
		youtubeChannel.subscribe(subscriber2);
		
		youtubeChannel.newVideoUploaded("Design Patterns");
		youtubeChannel.newVideoUploaded("Java");
		
		System.out.println("Welcome to Youtube Subscription Program!!!");
		while(true) {
			System.out.println("Select Your Choice: ");
			System.out.println("Press 1 : Create new Subscriber");
			System.out.println("Press 2 : Upload new video");
			System.out.println("Press 3 : Exit the program");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Integer choice  = Integer.parseInt(br.readLine().trim());
			
			if(choice == 1) {
				// Code for creating new Subscriber and Subscribe Youtube Channel
				System.out.println("Enter the name of Subscriber: ");
				String subscriberName = br.readLine().trim();
				Subscriber subscriber3 = new Subscriber(subscriberName);
				youtubeChannel.subscribe(subscriber3);
			}
			else if(choice == 2) {
				// Code for uploading new video
				System.out.println("Enter the title of the video");
				String title = br.readLine().trim();
				youtubeChannel.newVideoUploaded(title);
			}
			else if(choice == 3) {
				// Code for exit the program
				System.out.println("Thank you for using the program!!!");
				break;
			}
			else {
				// Code for Invalid Input
				System.out.println("Invalid Input. Please provide Valid Input");
			}
			
			
		}

		
	}

}
