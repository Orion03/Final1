package finalChapter;

import java.util.Scanner;

public class SkeletonFinalChapter {

	public static void main(String[] args) {
		
		text();

	}
	
	public static void text() {
		
		Scanner input = new Scanner(System.in);
		
		int input8;
		String input9;
		int input10;
		int input11;
		int input12;
		int input13;
		int input14;
		
		System.out.println("The Final Chapter Begins...");
		System.out.println("Your standing at the exit. It's 4:30pm, October 31st. 30 minutes early. What humans call \n.:Trick-or-treating:. "
				+ "starts soon. Perfect. Foolish mortals think that skeletons are just silly children \nin costumes during these times, but "
				+ "little do they know that it is actually an army of undead skeletons \nready to start a siege on humanity. But first, "
				+ "there's a few other things you must take care of first:");
		System.out.println("\n1 - Find other useful weapons \n2 - Find healing items \n3 - Enhance stength with milk");
		input8 = input.nextInt();
		
		if(input8 == 1)
		{
			System.out.println("So you need weapons other than a sword. Considering the merchant is out of stock, you'll have to find "
					+ "\nsomething on your own. There's a special grave up ahead, maybe it has something of use.");
			System.out.println("\nRaid the grave? \n \nYes \nNo");
			input9 = input.next();
			
			if(input9.equalsIgnoreCase("Yes") || input9.equalsIgnoreCase("y"))
			{
				System.out.println("You decide to raid the grave. You've disturbed the spirit of that grave, and you feel uneasy. You "
						+ "realize that was actually \nElvis Presley's grave. He decides that you disrupted him and is punishable by death. "
						+ "You die on the \nspot, just from him looking at you. You died. Start your adventure over.");
			}
			
			else if(input9.equalsIgnoreCase("No") || input9.equalsIgnoreCase("n"))
			{
				System.out.println("You decide not to disrupt the dead. A good decision on your part. Luckily though, there are convient "
						+ "\ndaggers right by the grave that don't belong to anybody. You decide to pick them up. Now that you have \nanother "
						+ "type of weapon, it's time to gather the other things:");
				System.out.println("\n1 - Find healing items \n2 - Enhance strength with milk");
				input10 = input.nextInt();
				
				if(input10 == 1)
				{
					System.out.println("You decide to search for healing items next. In the graveyard, there are many trees growing "
							+ "different \ntypes of fruits. You could probably only hold 1, though. Choose wisely:");
					System.out.println("\n1 - Apple \n2 - Orange \n3 - Peach");
					input11 = input.nextInt();
					
					if(input11 == 1)
					{
						System.out.println("You take the apple. Apparently, you've doomed all of skeletonkind. You died. Start your "
								+ "adventure over.");
					}
					
					else if(input11 == 3)
					{
						System.out.println("You take the peach. You hate the way the fuzz feels, despite being a skeleton and not having any "
								+ "\nnerves. You hate the way it looks, despite being a skeleton and having no eyes. The peach hates you \nback. "
								+ "It wants to kill you. The peach, turns out, was not actually a peach, but instead a bomb \ndisguised as a "
								+ "peach and gained sentience. The peach blows itself up. You died. Start your adventure \nover.");
					}
					
					else if(input11 == 2)
					{
						System.out.println("The right choice. You are satisfied with the orange. The orange is satisfied with you. It's time to find the last thing:");
						System.out.println("1 - Enhance strength with milk");
						input12 = input.nextInt();
						
						if(input12 == 1)
						{
							System.out.println("It's time to search for milk. Everybody knows that milk contains calcium, which strengthens the bones. Considering you are only bones, all "
									+ "of that calcium goes straight to it, meaning it boosts it by much more than any mere human. This is the most difficult of tasks: You must leave "
									+ "the graveyard. There's a gas station right across from it which has tons of milk, but your not going to find any in the graveyard. You must decide:");
							System.out.println("\n1 - Jaywalk \n2 - Use the cross walk \n3 - Use a medieval catapult");
							input13 = input.nextInt();
							
							if(input13 == 1)
							{
								System.out.println("You decide to jaywalk. You begin to sink. Unfortunately, the road suddenly turned into quicksand. Maybe it's because you broke the "
										+ "law. You died. Start your adventure over.");
							}
							
							else if(input13 == 2)
							{
								System.out.println("You decide to use the crosswalk. You may be a skeleton, but at least you have some common sense. However, someone in a SUV didn't see "
										+ "you and ran you over. Your bones crushed underneath the pressure. You died. Start your adventure over.");
							}
							
							else if(input13 == 3)
							{
								System.out.println("You decide to use the catapult. It seems like a really bad idea, but somehow you think it will work. You get in. Another skeleton "
										+ "cuts a rope. Your flying through the air to the other side. Across the graveyard, across the road, and straight through a window in the gas "
										+ "station. The impact of you crashing through the window didn't even hurt. Maybe it's because your a skeleton and don't have nerves. You get up "
										+ "and find the milk. You can take only about 1/2 of a gallon. You must decide: ");
								System.out.println("\n1 - Steal the milk \n2 - Pay for the milk ($1.50)");
								input14 = input.nextInt();
								
								if(input14 == 2)
								{
									System.out.println("You decide to pay for the milk. After all, stealing is wrong. You walk up to the counter. The cashier dies of a heart attack. "
											+ "Guess humans don't see walking skeletons very much. When he falls to the ground, his hand conviently hits the defense system button. "
											+ "Before you know it, the defense system activates, and you get shot from just about every angle possible. You died. Start your adventure "
											+ "over.");
								}
							}
						}
					}
				}
				
			}
		}
		
	}

}
