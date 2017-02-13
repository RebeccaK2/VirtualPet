
/*Rebecca Kentosh
Virtual Pet /App/Test
TODO upper case conversion method ignore case - case-INsensitive
TODO Create ReadMe
Misc things to remember:
tick=player points accumulating behind the scenes to earn an achievement
*/

import java.util.Scanner;

public class VirtualPet1APP {
	public static void main(String[] args) {
		// open scanner
		Scanner scanInput = new Scanner(System.in);

		// Declare names of Player & Pet
		String playerName;
		String petName;
		String userInput;

		// Declare player choices to input (change to a put Map?)
		// Declare starting Values of Points to be accumulated (change to a put
		// Map?)
		int thirstyPts = 0;
		int hungryPts = 0;
		int poopPts = 0;
		int boredPts = 0;
		int sleepyPts = 0;
		int playerPts = 0;
		int totalPlayerPts =(thirstyPts + hungryPts + poopPts + boredPts + sleepyPts);

		// Greeting and user inputs name
		System.out.println("Hello!  Welcome to your Virtual Pet! What is your name?");
		playerName = scanInput.next();

		// User name is validated and user chooses a pet
		do {
			System.out.println("Nice to meet you, " + playerName + ".  It's time to choose YOUR Pet!");
			System.out.println("Please type dog or cat, and then push the enter button.");
			
			do {
				userInput = scanInput.next();
				userInput = userInput.toLowerCase();
				if (userInput.equals("cat")) {
					System.out.println("'meow'!");

				} else if (userInput.equals("dog")) {
					System.out.println("'bark bark'!");

				} else {
					System.out.println("Please try again.");
				}
			} while (!userInput.equals("cat") && !userInput.equals("dog"));

			// User name and user gives pet a name
			System.out.println(playerName + ", what would you like to name me?");
			petName = scanInput.next();

			// Validate pet's new name
			System.out.println(playerName + ", I like my new name, " + petName + " ! :-)");

			// Here are instructions for behind the scenes point accumulation
			System.out.println("I'm so happy to be with you! May I please have a drink? ");
			System.out.println("(What should you do? Type water or food...then push enter.)");
			// water 11xo
			do {
				userInput = scanInput.next();
				if (userInput.equals("water")) {
					thirstyPts = thirstyPts-1;
					poopPts = poopPts+1;
					playerPts =  playerPts+1;
//change playerName to petName
					System.out.println(playerName+", you and I now have points!");
					System.out.println(petName + "'s Thirsty Points = " + thirstyPts);
					System.out.println(petName + "'s Hungry Points = " + hungryPts);
					System.out.println(petName + "'s Potty Points = " + poopPts);
					System.out.println(petName + "'s Play Points = " + boredPts);
					System.out.println(petName + "'s Sleepy Points = " + sleepyPts);
					System.out.println(playerName + "'s Points earned this turn = " + playerPts);
					System.out.println(playerName+ " & "+petName+"'s Total Pet Points = " + totalPlayerPts);
				} else {
					System.out.println("Please try again.");
				}
			} while (!userInput.equals("water"));
			// outside 10x
			System.out.println("Thank you for giving me some water. Uh, oh! I need to go potty!");
					System.out.println("Type water or outside...then push enter.");
			do {
				userInput = scanInput.next();
				if (userInput.equals("outside")) {
					poopPts = poopPts-1;
					boredPts = boredPts+1;
					playerPts = 1;
					totalPlayerPts=totalPlayerPts+1;
					
					System.out.println(playerName+", we now have more points!");
					System.out.println(petName + "'s Thirsty Points = " + thirstyPts);
					System.out.println(petName + "'s Hungry Points = " + hungryPts);
					System.out.println(petName + "'s Potty Points = " + poopPts);
					System.out.println(petName + "'s Play Points = " + boredPts);
					System.out.println(petName + "'s Sleepy Points = " + sleepyPts);
					System.out.println(playerName + "'s Points earned this round = " + playerPts);
					System.out.println(playerName+ " & "+petName+"'s Total Pet Points = " + totalPlayerPts);

				} else {
					System.out.println("Please try again.");
				}
			} while (!userInput.equals("outside"));
			// play 9x
			System.out
					.println("Thank you for taking me outside! I feel much better. Is there something fun we can do?  "
							+ "Type water or bed or play...then push enter.");
			do {
				userInput = scanInput.next();
				if (userInput.equals("play")) {
					boredPts = boredPts -1;
					thirstyPts = thirstyPts+1;
					hungryPts = hungryPts+1;
					playerPts = playerPts+1;
					System.out.println(playerName+", look! We now have new points!");
					System.out.println(petName + "'s Thirsty Points = " + thirstyPts);
					System.out.println(petName + "'s Hungry Points = " + hungryPts);
					System.out.println(petName + "'s Potty Points = " + poopPts);
					System.out.println(petName + "'s Play Points = " + boredPts);
					System.out.println(petName + "'s Sleepy Points = " + sleepyPts);
					System.out.println(playerName + "'s Points earned this round = " + playerPts);
					System.out.println(playerName+ " & "+petName+"'s Total Pet Points = " + totalPlayerPts);

				} else {
					System.out.println("Please try again.");
				}
			} while (!userInput.equals("play"));
			// food 8x
			System.out.println("Thank you for playing with me! That was fun! All that playing made me hungry. "
					+ "Type bed or food or play...then push enter.");
			do {
				userInput = scanInput.next();
				if (userInput.equals("food")) {
					hungryPts = hungryPts-1;
					sleepyPts = sleepyPts+1;
					poopPts = poopPts +1;
					playerPts = playerPts+1;
					System.out.println(playerName+", some of our points are increasing!");
					System.out.println(petName + "'s Thirsty Points = " + thirstyPts);
					System.out.println(petName + "'s Hungry Points = " + hungryPts);
					System.out.println(petName + "'s Potty Points = " + poopPts);
					System.out.println(petName + "'s Play Points = " + boredPts);
					System.out.println(petName + "'s Sleepy Points = " + sleepyPts);
					System.out.println(playerName + "'s Points earned this round = " + playerPts);
					System.out.println(playerName+ " & "+petName+"'s Total Pet Points = " + totalPlayerPts);System.out.println(playerName + "'s Total Pet Points = " + totalPlayerPts);

				} else {
					System.out.println("Please try again.");
				}
			} while (!userInput.equals("food"));
			// outside 7x
			System.out.println("Thank you for feeding me!  Uh, oh! I need to go outside!  "
					+ "Type outside or play or bed...then push enter.");
			do {
				userInput = scanInput.next();
				if (userInput.equals("outside")) {
					poopPts = poopPts -1;
					boredPts = boredPts+1;
					playerPts = playerPts+1;
					System.out.println(playerName+", some of our points are decreasing!");
					System.out.println(petName + "'s Thirsty Points = " + thirstyPts);
					System.out.println(petName + "'s Hungry Points = " + hungryPts);
					System.out.println(petName + "'s Potty Points = " + poopPts);
					System.out.println(petName + "'s Play Points = " + boredPts);
					System.out.println(petName + "'s Sleepy Points = " + sleepyPts);
					System.out.println(playerName + "'s Points earned this round = " + playerPts);
					System.out.println(playerName+ " & "+petName+"'s Total Pet Points = " + totalPlayerPts);
				} else {
					System.out.println("Please try again.");
				}
			} while (!userInput.equals("outside"));
			// play 6x
			System.out.println(
					"Thank you for taking me outside! I feel much better. " + "Can we stay outside and have more fun?  "
							+ "Type water or bed or outside or play...then push enter.");
			do {
				userInput = scanInput.next();
				if (userInput.equals("play")) {
					boredPts = boredPts-1;
					thirstyPts = thirstyPts +1;
					hungryPts = hungryPts +1;
					playerPts = playerPts+1;
					System.out.println(playerName+", your points are getting bigger, but my play points are less!");
					System.out.println(petName + "'s Thirsty Points = " + thirstyPts);
					System.out.println(petName + "'s Hungry Points = " + hungryPts);
					System.out.println(petName + "'s Potty Points = " + poopPts);
					System.out.println(petName + "'s Play Points = " + boredPts);
					System.out.println(petName + "'s Sleepy Points = " + sleepyPts);
					System.out.println(playerName + "'s Points earned this round = " + playerPts);
					System.out.println(playerName+ " & "+petName+"'s Total Pet Points = " + totalPlayerPts);
				} else {
					System.out.println("Please try again.");
				}
			} while (!userInput.equals("play"));
			// water 5x
			System.out.println("That was fun playing with you! It sure made me thirsty!");
			do {
				userInput = scanInput.next();
				if (userInput.equals("water")) {
					thirstyPts = thirstyPts-1;
					sleepyPts = sleepyPts +1;
					poopPts = poopPts+1;
					playerPts = playerPts+1;
					System.out.println(playerName+", some of our points have changed!");
					System.out.println(petName + "'s Thirsty Points = " + thirstyPts);
					System.out.println(petName + "'s Hungry Points = " + hungryPts);
					System.out.println(petName + "'s Potty Points = " + poopPts);
					System.out.println(petName + "'s Play Points = " + boredPts);
					System.out.println(petName + "'s Sleepy Points = " + sleepyPts);
					System.out.println(playerName + "'s Points earned this round = " + playerPts);
					System.out.println(playerName+ " & "+petName+"'s Total Pet Points = " + totalPlayerPts);
				} else {
					System.out.println("Please try again.");
				}
			} while (!userInput.equals("water"));
			// food 4x
			System.out.println("Thank you for that fresh bowl of water. Wow I was thirsty!  "
					+ "All our fun together sure has made me hungry!");
			do {
				userInput = scanInput.next();
				if (userInput.equals("food")) {
					hungryPts = hungryPts-1;
					sleepyPts = sleepyPts+1;
					poopPts = poopPts +1;
					playerPts = playerPts +1;
					System.out.println(playerName+", some of our points did not change!");
					System.out.println(petName + "'s Thirsty Points = " + thirstyPts);
					System.out.println(petName + "'s Hungry Points = " + hungryPts);
					System.out.println(petName + "'s Potty Points = " + poopPts);
					System.out.println(petName + "'s Play Points = " + boredPts);
					System.out.println(petName + "'s Sleepy Points = " + sleepyPts);
					System.out.println(playerName + "'s Points earned this round = " + playerPts);
					System.out.println(playerName+ " & "+petName+"'s Total Pet Points = " + totalPlayerPts);
				} else {
					System.out.println("Please try again.");
				}
			} while (!userInput.equals("food"));
			// bed 3x
			System.out.println("Thank you for that big snack! Now I need a nap.");
			do {
				userInput = scanInput.next();
				if (userInput.equals("bed")) {
					sleepyPts = sleepyPts-1;
					playerPts = playerPts+1;
					System.out.println(playerName+", just 2 of my points changed!");
					System.out.println(petName + "'s Thirsty Points = " + thirstyPts);
					System.out.println(petName + "'s Hungry Points = " + hungryPts);
					System.out.println(petName + "'s Potty Points = " + poopPts);
					System.out.println(petName + "'s Play Points = " + boredPts);
					System.out.println(petName + "'s Sleepy Points = " + sleepyPts);
					System.out.println(playerName + "'s Points earned this round = " + playerPts);
					System.out.println(playerName+ " & "+petName+"'s Total Pet Points = " + totalPlayerPts);
				} else {
					System.out.println("Please try again.");
				}
			} while (!userInput.equals("bed"));
			// outside 2x
			System.out.println("That was a good nap! Whenever I wake up, I have to go outside!");
			do {
				userInput = scanInput.next();
				if (userInput.equals("outside")) {
					poopPts = poopPts -1;
					boredPts =boredPts +1;
					playerPts =playerPts +1;
					System.out.println(playerName+", your answer changes our points!");
					System.out.println(petName + "'s Thirsty Points = " + thirstyPts);
					System.out.println(petName + "'s Hungry Points = " + hungryPts);
					System.out.println(petName + "'s Potty Points = " + poopPts);
					System.out.println(petName + "'s Play Points = " + boredPts);
					System.out.println(petName + "'s Sleepy Points = " + sleepyPts);
					System.out.println(playerName + "'s Points earned this round = " + playerPts);
					System.out.println(playerName+ " & "+petName+"'s Total Pet Points = " + totalPlayerPts);
				} else {
					System.out.println("Please try again.");
				}
			} while (!userInput.equals("outside"));
			// bed 1 last
			System.out.println(playerName + " It's so fun being with you! I like seeing our points change, too!");
			System.out.println("  I am very tired from our exciting time together, so must go to sleep now.");
			do {
				userInput = scanInput.next();
				if (userInput.equals("bed")) {
					sleepyPts = sleepyPts+1;
					playerPts =playerPts +1;
					System.out.println(playerName+" and "+petName+"'s new points!");
					System.out.println(petName + "'s Thirsty Points = " + thirstyPts);
					System.out.println(petName + "'s Hungry Points = " + hungryPts);
					System.out.println(petName + "'s Potty Points = " + poopPts);
					System.out.println(petName + "'s Play Points = " + boredPts);
					System.out.println(petName + "'s Sleepy Points = " + sleepyPts);
					System.out.println(playerName + "'s Points earned this round = " + playerPts);
					System.out.println(playerName+ " & "+petName+"'s Total Pet Points = " + totalPlayerPts);
				} else {
					System.out.println("Please try again.");
				}
			} while (!userInput.equals("bed"));

			System.out.println(playerName + " Congratulations," + playerName + "!  You've earned " + playerPts
					+ " points " + "and now you have an EXPERT pet owner certificate!  " + playerName
					+ ", You are an EXPERT PET OWNER!");
			System.out.println("I'm very happy you are my EXPERT pet owner, " + playerName + " .  "
					+ "Thank you for taking such good care of me! ");

			System.out.println("Would you like to choose another pet? Please type yes or no.");

			userInput = scanInput.next();
			if (userInput.equals("yes")) {
				System.out.println("I can't wait to meet our new pet friend!");
			} else {
				System.out.println("It's time for you to have rest time, too.  " + "Goodnight, " + playerName + " .");
			}
		} while (userInput.equals("yes"));
		scanInput.close();
	}
}
