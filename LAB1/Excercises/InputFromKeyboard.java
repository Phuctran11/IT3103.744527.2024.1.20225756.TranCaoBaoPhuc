import java.util.Scanner;
public class InputFromKeyboard {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Bao Phuc - What's your name?");
		String strName = keyboard.nextLine();
		System.out.println("Bao Phuc - How old are you?");
		int iAge = keyboard.nextInt();
		System.out.println("Bao Phuc - How tall are you (m)?");
		double dHeight = keyboard.nextDouble();
		
		System.out.println("Mrs/Ms. " + strName + ", " + iAge +"years old. "
							+ "Your height is " + dHeight + ".");
	}
}
