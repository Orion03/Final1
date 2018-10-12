package adventure;

import java.util.Scanner;

public class Skeleton2 {

	public static void main(String[] args) {
		
		text();

	}
	
	public static void text() {
		String input4;
		String input5;
		int input6;
		
		Scanner input = new Scanner(System.in);
		System.out.println(" And here begins your journey as a Skeleton sorcerer, the most tragic of them all. ");
		System.out.println("   	rise from thy grave child");
		System.out.println("   	Press any key to continue! ");
		input4 = input.next();
		
		System.out.println("You have risen out the grave and the graveyard is foggy but peaceful in all, \nAfter walking straight for five minutes"
				+ " you have encountered the strongest A posing man of your life." );
		System.out.println("Do you attack the old man ? \nYes? \nOr \nNo");
		input5 = input.next();
		if (input5.equalsIgnoreCase("Yes") || input5.equalsIgnoreCase("y")) {
			System.out.println("You slowly approach the old man and \nthe"
					+ " old mans pose leaves you frightened and terrified, \nyou feel threatened do you attack? Yes or no?");
			input6 = input.nextInt();
			 if (input6 == 2 ) {
				System.out.println(" The old man grabs you with his mind and he confuzzles you with his A posing abilites, "
						+ "\nyou float in the air and he snaps your neck, you have died.  ");
			}
			 else if (input6 == 1) {
				  System.out.println(" YOu attacked the old man and the old can't handle the lighting  and is not back and now is T posing meaning he became passive"
				  		+ "\nthe now t posing man lets you through into a building. The building old and falling apart slowly. ");
			 }
		}
		
	}

}
