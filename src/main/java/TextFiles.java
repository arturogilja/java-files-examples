import java.io.*;

public class TextFiles {
    public static void main(String[] args) {
        // Text files
        // Try-with-resources
        try (
            // Read file
            FileReader fileReader = new FileReader("example.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            // Write to file
            FileWriter fileWriter = new FileWriter("example.txt");
            PrintWriter writer = new PrintWriter(fileWriter);
        ) {
            // Read line by line
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Write line by line
            String text = "Hola mundo";
            writer.println(text);
            writer.println(text);
            writer.println(text);
            writer.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
