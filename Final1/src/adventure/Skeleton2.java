package adventure;

import java.util.Scanner;

public class Skeleton2 {

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
		
		System.out.println("And thus, your adventure as a Skeleton Sorcerer begins...");
		System.out.println("		   Rise from thy grave");
		System.out.println("		Press any key to continue");
		input4 = input.next();
		
		System.out.println("You walk through the graveyard, searching for an exit. Through your search, \nsomething catches your eye socket. It's a man. An old man. \n \nApproach the "
				+ "old man? \n  \nYes \nNo");
		input5 = input.next();
		
		if(input5.equalsIgnoreCase("Yes") || input5.equalsIgnoreCase("y"))
		{
			System.out.println("You approach the old man. He T-poses in the moonlight. Your non-existent ears \nlisten to the soft breaths of him. \n1 - Admire the old man \n2 - "
					+ "Threaten the old man");
			input6 = input.nextInt();
			
			if(input6 == 2)
			{
				System.out.println("You threaten the old man. You hold a sword up to his neck. You look at him \nmenacingly in the eye. The old man turned you to dust. You died. Start "
						+ "your \nadventure over.");
				Final.Dialog.text();
			}
			
			else if(input6 == 1)
			{
				System.out.println("You admire the old man. He admires you back. Content with your admiration for him, \nthe old man walks away into the graveyard. Perhaps someday he "
						+ "will aid you in your \njourney. As you walk further searching for the exit, you notice that your costume and \nstaff are quite worn. Although your costume is "
						+ "made of hard leather and your staff \nof the finest wood, there's no telling how long it's been degrading \nalong with you. Perhaps a fellow skeleton "
						+ "knows where you can find some better \ngear. That means you have to find a skeleton first, though. Luckily, your in a \ngraveyard, so it's not very hard to "
						+ "find one.");
				System.out.println("\n1 - Search for a costume \n2 - Search for a staff");
				input7 = input.nextInt();
				
				if(input7 == 1)
				{
					System.out.println("Your hunt for a costume begins. Not like it would really take very long to find it, \nthough. That's the merchant right over there. You approach "
							+ "the armor merchant. But \nright before you approach him, you realize you don't have a name. Now would be a \ngood time to figure that out >> ");
					inputName = input.next();
					System.out.println("So you've made up your mind, even though skeletons don't really have brains. \n" + inputName + " is the name you've settled on. You approach the "
							+ "merchant. He welcomes you to \nhis...shop? Can you really call anything in a graveyard a shop?");
					System.out.println("Caeser, The Amazing Costume Merchant: Welcome to thy shop, what shall you have?");
					System.out.println("1 - Gator scaled costume. Very solid and heavy. It has a scale lining on \nthe outside to protect you from the damaging weapons of the humans.");
					System.out.println("Ceaser, The Amazing Costume Merchant: I've heard humans say that gator scale is really \nrough. Good thing skeletons don't have nerves. Looks like"
							+ " we're out of \nstock of anything else. Tell you what, since your the new guy, I'll give you this \none for free.");
					System.out.println("You aquirred the Gator Scaled Costume. It's better than what you've got now, so might as \nwell use it. Now it's time to find a staff. "
							+ "Not like that would take very long, though. That's the \nmerchant right over there.");
					System.out.println("Zypher, The Unchallenged Wizard: Welcome to the shop, young sorcerer. What would you like?");
					System.out.println("1 - ヘビ. It looks strnage. Apparently it's Japanese for snake. Doesn't \nseem that impressive, but it's better than "
							+ "what you've got now.");
					System.out.println("Zypher, The Unchallenged Wizard: Tell you what, since your a new guy around here, I'll \ngive it to you for free.");
					System.out.println("Now that you've got a new set of gear, it's time to head to the exit. Looks like it's conviently right \nup ahead.");
					
					System.out.println("\nCHAPTER 1 COMPLETE");
					
					finalChapter.SkeletonFinalChapter.text(inputName);
				}
				
				else if(input7 == 2)
				{
					System.out.println("Your hunt for a staff begins. Not like it would really take very long to find any, \nthough. That's the merchant right over there. You approach "
							+ "the weapons merchant. But \nright before you approach him, you realize you don't have a name. Now would be a \ngood time to figure that out >> ");
					inputName = input.next();
					System.out.println("So you've made up your mind, even though skeletons don't really have brains. \n" + inputName + " is the name you've settled on. You approach the "
							+ "merchant. He welcomes you to his...shop? Can you \nreally call anything in a graveyard a shop?");
					System.out.println("Zypher, The Unchallenged Wizard: Welcome to the shop, young sorcerer. What would you like?");
					System.out.println("1 - ヘビ. It looks strnage. Apparently it's Japanese for snake. Doesn't \nseem that impressive, but it's better than "
							+ "what you've got now.");
					System.out.println("Zypher, The Unchallenged Wizard: Tell you what, since your a new guy around here, I'll \ngive it to you for free.");
					System.out.println("You aquirred ヘビ. Now you just need some a costume. Not like it would take very long to find any \nthough, that's the merchant right over there.");
					System.out.println("Caeser, The Amazing Costume Merchant: Welcome to thy shop, what shall you have?");
					System.out.println("1 - Gator scaled costume. Very solid and heavy. It has a scale lining on \nthe outside to protect you from the damaging weapons of the humans.");
					System.out.println("Ceaser, The Amazing Costume Merchant: I've heard humans say that gator scale is really \nrough. Good thing skeletons don't have nerves. Looks like"
							+ " we're out of \nstock of anything else. Tell you what, since your the new guy, I'll give you this \none for free.");
					System.out.println("You aquirred the Gator Scaled Costume. It's better than what you've got now, so might as \nwell use it.");
					System.out.println("Now that you've got a new set of gear, it's time to head to the exit. Looks like it's conviently right \nup ahead.");
					
					System.out.println("\nCHAPTER 1 COMPLETE");
					
					finalChapter.SkeletonFinalChapter.text(inputName);
				}
			}
		}
		
		else if(input5.equalsIgnoreCase("No") || input5.equalsIgnoreCase("n"))
			System.out.println("The cool frog hates you for ignoring it, and it tears you apart. You died. \nStart your adventure over.");
		Final.Dialog.text();
		
	}

}
