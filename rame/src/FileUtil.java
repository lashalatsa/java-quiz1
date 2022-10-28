import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Scanner;

public class FileUtil {
    public static void createFile() throws IOException {
        File file = new File("mariam.txt");
        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println("File created!");
            } else {
                System.out.println("couldnt");
            }
        }
    }

    //
    public static void writeIntoFile(String text) throws IOException {
        File file = new File("mariam.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(text);
        fileWriter.close();
    }

    //
    public static void readFile() throws IOException {
        File file = new File("mariam.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            System.out.println(data);
        }
        scanner.close();

//        public static void deleteFile() {
//            File file = new File("mariam.txt");
//            if (file.exists()) {
//                if (file.delete()) {
//                    System.out.println("file has been deleted!");
//                } else {
//                    System.out.println("error");
//                }
//
//            } else {
//                System.out.println("file does not exists");
//            }
//        }
    }
}

