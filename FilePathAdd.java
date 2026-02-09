import java.util.Scanner;

public class FilePathAdd {
    public static void filePath(Scanner UserInput) {
        System.out.println("Please enter the FULL Path of your ISO / Image. ()");
        String Path = UserInput.nextLine();
        System.out.println("Using File: " + Path);
    }
}
