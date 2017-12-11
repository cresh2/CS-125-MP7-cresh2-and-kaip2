/**
 * @author Kai
 *
 */
public class Student {
	/**
	 * Default constructor.
	 */
	public Student() {
		super();
	}
	
	public Scenario create() {
		Scenario temp1, temp2, temp3, top;
		temp1 = new Scenario("You along with the majority of the class ask \n"
				+ "this and he tells you not to worry because it will be explained \n"
				+ "eventually. Which holds true and you do very well on the final.");
		top = new Scenario("Prof. Angrave ends up doing a class Q&A, do you...");
		top.createAnswer1("Ask about the final.", temp1);
		temp2 = new Scenario("Prof. Angrave gets your question and indulges everyone on his\n"
				+ " past projects, the most notorious of which, includes being hired to break \n"
				+ "into a bank to show the flaws in the security system. Your suspicion has been \n"
				+ "squashed and you proceed in the class like you were before.");
		top.createAnswer2("Ask about Prof. Angrave.", temp2);
		temp3 = top;
		top = new Scenario("After speaking to your new Prof, Prof. Angrave, you get the feeling \n"
				+ "that he’s hiding something. Do you...");
		top.createAnswer1("Forget about it and move on.", temp3);
		temp1 = new Scenario("During your research on your new Prof. you find out that he is just an \n"
				+ "unbelievably distinguished computer science teacher. This gives you the confidence \n"
				+ "to trust in this guy to succeed in the class, which you do a great job of");
		top.createAnswer2("Investigate further.", temp1);
		return null;
	}
}
