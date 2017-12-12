/**
 * A Choose-your-own Adventure game for CS 125.
 * 
 * @author cresh2 and kaip2
 */
import java.util.Scanner;
public class CS125ChooseYourOwnAdventureGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student game = new Student();
		Scanner input = new Scanner(System.in);
		int answer = 0;
		boolean isValidAnswer = false;
		Scenario story = game.create();
		
		//Beginning of the user interface
		System.out.println("This is a CS 125 Choose-your-own Adventure! Enjoy!");
		
		do {
			System.out.println(story.getMessage() + "\n");
			if (story.getFirstAnswerScenario() != null) {
				System.out.println("Answers:");
				System.out.println("1. " + story.getFirstAnswer());
			}
			if (story.getSecondAnswerScenario() != null) {
				System.out.println("2. " + story.getSecondAnswer());
			}
			if (story.getFirstAnswerScenario() == null && story.getSecondAnswerScenario() == null) {
				answer = 0;
			} else {
				System.out.print("Which answer do you choose? Type 1 for answer 1, 2 for answer 2, or 0 to quit entirely: ");
				answer = input.nextInt();
				System.out.println();
				
				// Checks if the answer is valid
				do {
					switch(answer) {
						case 0: isValidAnswer = true;
							break;
						case 1: if (story.getFirstAnswer() == null) {
								isValidAnswer = false;
							} else {
								isValidAnswer = true;
							}
							break;
						case 2: if (story.getSecondAnswer() == null) {
								isValidAnswer = false;
							} else {
								isValidAnswer = true;
							}
							break;
						default: isValidAnswer = false;
							break;
					}
					if (isValidAnswer == false) {
						System.out.print("Please enter a valid choice: ");
						answer = input.nextInt();
						System.out.println();
					}
				} while (isValidAnswer == false);
			}
			// Moves on to the corresponding scenario if necessary
			if (answer == 1) {
				story = story.getFirstAnswerScenario();
			} else if (answer == 2) {
				story = story.getSecondAnswerScenario();
			}
		}while (answer != 0);
		input.close();
		System.out.print("Thank you for playing!");
		
	}

}