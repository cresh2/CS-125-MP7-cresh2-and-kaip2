/**
 * Builds the binary tree that the game runs through.
 * 
 * @author Kai
 */
public class Student {
	/**
	 * Default constructor.
	 */
	public Student() {
	}
	
	public Scenario create() {
		Scenario temp1, temp2, temp3, top, top2;
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
		temp2 = top;
		top = new Scenario("You accept the idea  that Prof. Chapman is too far gone for help, but now some \n"
				+ "guy with an accent is teaching the lecture. Do you..");
		top.createAnswer1("Stick around after class to try and get to know the professor.", temp2);
		temp3 = new Scenario("Everyone ends up getting an A in the class because of the traumatic events you \n"
				+ "went through.");
		top.createAnswer2("Collapse in panic because Prof. Chapman was the only thing getting you through \n"
				+ "this course.", temp3);
		temp1 = top;
		top = new Scenario("You have an epiphany and complete the MP, but when you go to lecture you find \n"
				+ "out Prof, Chapman is retiring. Do you think it’s because...");
		top.createAnswer1("His love of cookies consumed him", temp1);
		temp2 = new Scenario("News gets out that you think he retired because of his wife, and he’s forced \n"
				+ "to drop you from the course.");
		top.createAnswer2("His wife is making him retire because he uses his students to make his kids \n"
				+ "lunch because he’s too lazy to do it himself", temp2);
		temp3 = top;
		top = new Scenario("After working for 12 hours you have made very little progress do you...");
		top.createAnswer1("Keep going.", temp3);
		temp1 = new Scenario("You decided to give up, and in your saddened state you make the rash \n"
				+ "decision to drop the class as well.");
		top.createAnswer2("Give up.", temp1);
		temp2 = top;
		top = new Scenario("You decided to take CS 125,and you've just been assigned an MP you're not \n"
				+ "quite sure how to do it, do you...");
		top.createAnswer1("Try and figure it out on your own", temp2);
		temp3 = new Scenario("You drop the class after deciding it wasn't worth it because Professor\n"
				+ "Chapman is the G.O.A.T.");
		top2 = new Scenario("After to doing your best to repress the memories of your failed MP you go \n"
				+ "to lecture and find someone else teaching the lecture, do you..");
		top2.createAnswer1("Drop the class", temp3);
		temp1 = new Scenario("Your new Professor, Prof. Angrave, is actually very entertaining, and you \n"
				+ "start to enjoy the class more than you used to and decide to put more effort into it, \n"
				+ "the results show in your grades and you pass with flying colors");
		top2.createAnswer2("Stick around and see what this British guy has to say", temp1);
		temp2 = top2;
		top2 = new Scenario("There are already 24 other kids asking him questions and you come to the \n"
				+ "conclusion you’re wasting you’re time here, do you...");
		top2.createAnswer1("Take the loss and move on", temp2);
		temp3 = new Scenario("After seeing nearly your entire lecture class looking for help as well, you \n"
				+ "decide to drop the class because you'll never get the opportunity for the help you need.");
		top2.createAnswer2("Give up", temp3);
		temp1 = top2;
		top2 = new Scenario("You join the group and everyone except for one kid is just as lost as you. \n"
				+ "Do you..");
		top2.createAnswer1("Ask the one kid for help", temp1);
		temp2 = new Scenario("As you all work together, you get a working solution. You’ve also found a \n"
				+ "group of people willing to get and work together, you end up doing very in the class \n"
				+ "because of this new group of friends");
		top2.createAnswer2("Collaborate with some of the other kids who are lost.", temp2);
		temp3 = top2;
		top2 = new Scenario("You go to office hours and find that it’s filled, but there are many students \n"
				+ "working in groups do you...");
		top2.createAnswer1("Join a group", temp3);
		temp1 = new Scenario("After 3 hours of waiting for a doyen, someone comes and steals your spot.");
		top2.createAnswer2("Wait until a doyen is free", temp1);
		top.createAnswer2("Go to office hours.", top2);
		temp2 = top;
		top = new Scenario("You are a new college student, do you…");
		top.createAnswer1("Take CS 125.", temp2);
		temp3 = new Scenario("You did not take CS 125 and are therefore lame.");
		top.createAnswer2("Not take CS 125.", temp3);
		return top;
	}
}
