import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StorageDeviceLister {
    static void deviceList(Scanner UserInput) {

        try {
            ProcessBuilder pb = new ProcessBuilder("lsblk");
            Process process = pb.start();
            
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(process.getInputStream())
            );
            
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String device = UserInput.nextLine();
        System.out.println("Using device: " + device);
    }
}
