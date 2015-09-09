import java.util.Scanner;
public class WorkExercise {

	public static void main(String[] args) {
			System.out.print("Enter your username");
			Scanner keyboard = new Scanner(System.in);
			String username = keyboard.nextLine();
			System.out.print("Enter your password");
			String password = keyboard.nextLine();
			System.out.println("Hello "+ username +", Welcome to CSC 200! And your pass word is "+ password);
	}

}
