/**
 * A class that will be used to implement a binary tree-like structure for a pick-your-fate game.
 * <p>
 * This class will contain an scenario as well as the possible answers and will point to the respective 
 * scenarios for each answer.
 * 
 * @author cresh2
 */
public class Scenario {
	/**
	 * String variable that contains the message you.
	 */
	private String message;
	
	/**
	 * String variable that contains the first answer, but will be empty if this is the end of the story.
	 */
	private String answer1;
	
	/**
	 * String variable that contains the second answer, but may be empty if there is no second choice or
	 * it is the end of the story.
	 */
	private String answer2;
	
	/**
	 * Scenario for the first answer but will be null if this is the end of the story.
	 */
	private Scenario scenarioFor1;
	
	/**
	 * Scenario for the second answer but will be null if there isn't a second choice.
	 */
	private Scenario scenarioFor2;
	
	/**
	 * Creates the first scenario for the player.
	 * 
	 * @param newMessage the message for this scenario
	 */
	public Scenario(final String newMessage) {
		message = newMessage;
		answer1 = "";
		answer2 = "";
		scenarioFor1 = null;
		scenarioFor2 = null;		
	}
	
	/**
	 * Creates the first answer and scenario for that answer.
	 * 
	 * @param newAnswer the first answer to the scenario
	 * @param newMessage the scenario message for the first answer's scenario
	 */
	public void createAnswer1(final String newAnswer, final String newMessage) {
		answer1 = newAnswer;
		scenarioFor1 = new Scenario(newMessage);
	}
	
	/**
	 * Creates the second answer and scenario for that answer.
	 * 
	 * @param newAnswer the second answer to the scenario
	 * @param newMessage the scenario message for the second answer's scenario
	 */
	public void createAnswer2(final String newAnswer, final String newMessage) {
		answer2 = newAnswer;
		scenarioFor2 = new Scenario(newMessage);
	}
	
	/**
	 * Gets the message for this scenario
	 * 
	 * @return the message for this scenario
	 */
	public String getMessage() {
		return this.message;
	}
	
	/**
	 * Gets the first answer for this scenario
	 * 
	 * @return the first answer for this scenario
	 */
	public String getFirstAnswer() {
		return this.answer1;
	}
	
	/**
	 * Gets the second answer for this scenario
	 * 
	 * @return the second answer for this scenario
	 */
	public String getSecondAnswer() {
		return this.answer2;
	}
	
	/**
	 * Gets the first answer's scenario
	 * 
	 * @return the first answer's scenario
	 */
	public Scenario getFirstAnswerScenario() {
		return this.scenarioFor1;
	}
	
	/**
	 * Gets the second answer's scenario
	 * 
	 * @return the second answer's scenario
	 */
	public Scenario getSecondAnswerScenario() {
		return this.scenarioFor2;
	}
}
