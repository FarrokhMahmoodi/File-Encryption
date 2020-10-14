//This program encodes a given file using a secret key
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.util.Scanner;

public class Encryption {

    public static void main(String args[]) {
        System.out.println("Enter filename to encrypt: ");

        Scanner input = new Scanner(System.in);

        String fileName = input.next();

        System.out.println("Target file name: ");

        String targetName = input.next();

        System.out.println("Enter your key: ");

        byte key = input.nextByte();

        Scanner scanner1;

        try {
            FileOutputStream writer = new FileOutputStream(new File(targetName));

            File file = new File(fileName);
            byte[] fileContent = Files.readAllBytes(file.toPath());

            for (byte f : fileContent) {
                byte sum = (byte) (f + key);
                writer.write(sum);
            }

            writer.close();

            writer.flush();


        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
