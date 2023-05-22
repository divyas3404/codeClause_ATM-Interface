import java.io.IOException;

public class ATM {

	public static void main(String[] args) throws IOException {
		AllMenu optionMenu = new AllMenu();
		introduction();
		optionMenu.mainMenu();
	}
	

	public static void introduction() {
		System.out.println("\n\n--------------------------\nWelcome to the ATM!\n--------------------------\n");
	}
}
