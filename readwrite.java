import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

// Reads a file
public class readwrite {
    public readwrite(String inputFile) throws IOException {
        File file = new File(inputFile);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    // Asks for a file and a text string, writes the string into the file
    public void writeCode(String codeFile, String text) throws IOException {
        try (PrintWriter writer = new PrintWriter(codeFile)) {
            writer.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFile(File file) {
        String currentString = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while (reader.ready()) {
                char nextChar = (char) reader.read();
                currentString += nextChar;

            }
            reader.close();
        } catch (IOException ex) {
            System.out.println("nah");
        }
        return currentString;

    }

    public static int countCharacters(String inputFile) {
        File newf = new File(inputFile);
        String blonk = readFile(newf);
        return blonk.length();
    }

    public static void main(String[] args) {
        try {
            readwrite rw = new readwrite("input.txt");
            rw.writeCode("output.txt", "aidan rahill is my baby boy i love him");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
