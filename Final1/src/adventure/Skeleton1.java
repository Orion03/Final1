package adventure;

import java.util.Scanner;

public class Skeleton1 {

	public static void main(String[] args) {
		
		text();

	}
	
	public static void text() {
		
		Scanner input = new Scanner(System.in);
		
		String input4;
		String input5;
		int input6;
		int input7;
		String inputName;
		
		System.out.println("And thus, your adventure as a Skeleton Warrior begins...");
		System.out.println("		   Rise from thy grave");
		System.out.println("		Press any key to continue");
		input4 = input.next();
		
		System.out.println("You walk through the graveyard, searching for an exit. Through your search, \nsomething catches your eye socket. It's a frog. A cool frog. \n \nApproach the "
				+ "cool frog? \n  \nYes \nNo");
		input5 = input.next();
		
		if(input5.equalsIgnoreCase("Yes") || input5.equalsIgnoreCase("y"))
		{
			System.out.println("You approach the cool frog. It glistens in the moonlight. Your non-existent ears listen to the soft ribbits of it. \n1 - Admire the cool frog \n2 - Threaten "
					+ "the cool frog");
			input6 = input.nextInt();
			
			if(input6 == 2)
			{
				System.out.println("You threaten the cool frog. You hold a sword up to it's neck. You look at it \nmenacingly in the eye. The cool frog swallows you whole. You died. Start "
						+ "your \nadventure over.");
			}
			
			else if(input6 == 1)
			{
				System.out.println("You admire the cool frog. It admires you back. Content with your admiration for it, \nthe cool frog hops away into the graveyard. Perhaps someday it "
						+ "will aid you in your \njourney. As you walk further searching for the exit, you notice that your armor and \nweapons are quite worn. Although your armor is made "
						+ "of pure iron and your sword \nsharpened to the thinnest point, there's no telling how long it's been degrading \nalong with you. Perhaps a fellow skeleton knows "
						+ "where you can find some better \ngear. That means you have to find a skeleton first, though. Luckily, your in a graveyard, so it's not very hard to find one.");
				System.out.println("\n1 - Search for armor \n2 - Search for weapons");
				input7 = input.nextInt();
				
				if(input7 == 1)
				{
					System.out.println("Your hunt for armor begins. Not like it would really take very long to find it, \nthough. That's the merchant right over there. You approach the "
							+ "armor merchant. But \nright before you approach him, you realize you don't have a name. Now would be a \ngood time to figure that out >> ");
					inputName = input.next();
					System.out.println("So you've made up your mind, even though skeletons don't really have brains. \n" + inputName + " is the name you've settled on.");
				}
				
				else if(input7 == 2)
				{
					System.out.println("");
				}
			}
		}
		
	}

}
