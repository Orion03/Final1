package adventure;

import java.util.Scanner;

public class Skeleton2 {

	public static void main(String[] args) {
		
		text();

	}
	
	public static void text() {
		String input4;
		String input5;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println(" And here begins your journey as a Skeleton sorcerer, the most tragic of them all. ");
		System.out.println("   	rise from thy grave child");
		System.out.println("   	Press any key to continue! ");
		input4 = input.next();
		
		System.out.println("You have risen out the grave and the graveyard is foggy but peaceful in all, \nAfter walking straight for five minutes"
				+ "you have encountered the strongest A posing man of your life." );
		System.out.println("Do you attack the old man ? \nYes? \nOr \nNo");
		input5 = input.next();
		if (input5.equalsIgnoreCase("Yes") || input5.equalsIgnoreCase("No")) {
			
		}
	}

}
