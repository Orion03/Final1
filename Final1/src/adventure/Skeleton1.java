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
			System.out.println("You approach the cool frog. It glistens in the moonlight. Your non-existent ears \nlisten to the soft ribbits of it. \n1 - Admire the cool frog \n2 - Threaten "
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
						+ "where you can find some better \ngear. That means you have to find a skeleton first, though. Luckily, your in a \ngraveyard, so it's not very hard to find one.");
				System.out.println("\n1 - Search for armor \n2 - Search for weapons");
				input7 = input.nextInt();
				
				if(input7 == 1)
				{
					System.out.println("Your hunt for armor begins. Not like it would really take very long to find it, \nthough. That's the merchant right over there. You approach the "
							+ "armor merchant. But \nright before you approach him, you realize you don't have a name. Now would be a \ngood time to figure that out >> ");
					inputName = input.next();
					System.out.println("So you've made up your mind, even though skeletons don't really have brains. \n" + inputName + " is the name you've settled on. You approach the "
							+ "merchant. He welcomes you to \nhis...shop? Can you really call anything in a graveyard a shop?");
					System.out.println("Bartholomew, The Great Armor Merchant: Welcome to thy shop, what shall you have?");
					System.out.println("1 - Steel plated wool insolent armor. Very solid and heavy. It has a wool lining on \nthe inside to protect you from the cold weather of the nights.");
					System.out.println("Bartholomew, The Great Armor Merchant: I've heard humans say that wool is really \nuncomfortable. Good thing skeletons don't have nerves. Looks like"
							+ " we're out of \nstock of anything else. Tell you what, since your the new guy, I'll give you this \none for free.");
					System.out.println("You aquirred the Steel Plated Wool Insolent armor. It's better than what you've got now, so might as well use it. Now it's time to find a weapon. "
							+ "Not like that would take very long, though. That's the merchant right over there.");
					System.out.println("Dracula S. Notobushki, Legendary Weaponsmith: Welcome to the shop, young warrior. What would you like?");
					System.out.println("1 - Caliburn. It looks kind of lame. Apparently it was pulled out a rock by some old king guy. Doesn't seem that impressive, but it's better than "
							+ "what you've got now.");
					System.out.println("Dracula S. Notobushki, Legendary Weaponsmith: Tell you what, since your a new guy around here, I'll give it to you for free.");
					System.out.println("Now that you've got a new set of gear, it's time to head to the exit. Looks like it's conviently right up ahead.");
					
					System.out.println("\nCHAPTER 1 COMPLETE");
				}
				
				else if(input7 == 2)
				{
					System.out.println("Your hunt for weapons begins. Not like it would really take very long to find any, \nthough. That's the merchant right over there. You approach the "
							+ "weapons merchant. But \nright before you approach him, you realize you don't have a name. Now would be a \ngood time to figure that out >> ");
					inputName = input.next();
					System.out.println("So you've made up your mind, even though skeletons don't really have brains. \n" + inputName + " is the name you've settled on. You approach the "
							+ "merchant. He welcomes you to his...shop? Can you really call anything in a graveyard a shop?");
					System.out.println("Dracula S. Notobushki, Legendary Weaponsmith: Welcome to the shop, young warrior. What would you like?");
					System.out.println("1 - Caliburn. It looks kind of lame. Apparently it was pulled out a rock by some old king guy. Doesn't seem that impressive, but it's better than "
							+ "what you've got now.");
					System.out.println("Dracula S. Notobushki, Legendary Weaponsmith: Tell you what, since your a new guy around here, I'll give it to you for free.");
					System.out.println("You aquirred Caliburn. Now you just need some armor. Not like it would take very long to find any though, that's the merchant right over there.");
					System.out.println("Bartholomew, The Great Armor Merchant: Welcome to thy shop, what shall you have?");
					System.out.println("1 - Steel plated wool insolent armor. Very solid and heavy. It has a wool lining on the inside to protect you from the cold weather of the nights.");
					System.out.println("Bartholomew, The Great Armor Merchant: I've heard humans say that wool is really uncomfortable. Good thing skeletons don't have nerves. Looks like"
							+ " we're out of stock of anything else. Tell you what, since your the new guy, I'll give you this one for free.");
					System.out.println("You aquirred the Steel Plated Wool Insolent armor. It's better than what you've got now, so might as well use it.");
					System.out.println("Now that you've got a new set of gear, it's time to head to the exit. Looks like it's conviently right up ahead.");
					
					System.out.println("\nCHAPTER 1 COMPLETE");
				}
			}
		}
		
		else
			System.out.println("The cool frog hates you for ignoring it, and it tears you apart. You died. \nStart your adventure over.");
		
	}

}
