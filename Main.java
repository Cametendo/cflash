import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        
        greeting();
        String input = UserInput.nextLine();
        
        if (YesNo.check(input)) {
            System.out.println("Please choose a device");
        } else {
            System.out.println("Canceling...");
            System.exit(0);
        }

        
    }
}
